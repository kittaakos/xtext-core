/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.parser.packrat.internal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.parser.packrat.IBacktracker;
import org.eclipse.xtext.parser.packrat.internal.Marker.IMarkerVisitor;
import org.eclipse.xtext.parser.packrat.tokens.AbstractParsedToken;
import org.eclipse.xtext.parser.packrat.tokens.AbstractParsedTokenVisitor;
import org.eclipse.xtext.parser.packrat.tokens.CompoundParsedToken;
import org.eclipse.xtext.parser.packrat.tokens.ErrorToken;
import org.eclipse.xtext.parser.packrat.tokens.ParsedNonTerminal;
import org.eclipse.xtext.parser.packrat.tokens.ParsedNonTerminalEnd;
import org.eclipse.xtext.parser.packrat.tokens.ParsedTerminal;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class MarkerAwareBacktracker implements IBacktracker {

	private final Marker marker;

	public MarkerAwareBacktracker(Marker marker) {
		this.marker = marker;
	}

	protected class NestedBacktrackingResult extends AbstractParsedTokenVisitor implements IBacktrackingResult, IMarkerVisitor {

		private boolean result;

		private boolean lookup;

		private int stackSize;

		private int errorStack;

		private int skippedOffset;

		private final Set<AbstractParsedToken> markedTokens;

		protected NestedBacktrackingResult() {
			this.result = false;
			this.markedTokens = new HashSet<AbstractParsedToken>(8);
			this.skippedOffset = 0;
		}

		public void commit() {
			markedTokens.clear();
		}

		public void discard() {
			for(AbstractParsedToken token: markedTokens) {
				token.setSkipped(false);
			}
			marker.getInput().setOffset(marker.getInput().getOffset() + skippedOffset);
			markedTokens.clear();
		}

		public boolean isSuccessful() {
			return result;
		}

		public IBacktrackingResult skipPreviousToken() {
			errorStack = 0;
			result = false;
			lookup = true;
			stackSize = 0;
			int idx = -1;
			List<AbstractParsedToken> content = marker.getContent();
			idx = content.size() - 1;
			while(idx >= 0 && !result && lookup) {
				content.get(idx).accept(this);
				if (!result)
					idx--;
			}
			if (result) {
				Skipper skipper = new Skipper();
				for (int i = idx; i < content.size(); i++)
					content.get(i).accept(skipper);
				idx = 0;
				skippedOffset += skipper.skippedOffset;
				marker.getInput().setOffset(marker.getInput().getOffset() - skipper.skippedOffset);
			}
			return this;
		}

		@Override
		public void visitAbstractParsedToken(AbstractParsedToken token) {
			//
		}

		@Override
		public void visitCompoundParsedToken(CompoundParsedToken token) {
			if (lookup && !token.isSkipped()) {
				if (errorStack != 0)
					errorStack--;
				if (stackSize == 0)
					lookup = false;
				else {
					stackSize--;
					if (GrammarUtil.isOptionalCardinality(token.getGrammarElement())) {
						result = errorStack == 0;
					}
				}
			}
		}

		@Override
		public void visitParsedNonTerminal(ParsedNonTerminal token) {
			if (lookup && !token.isSkipped()) {
				if (stackSize == 0)
					lookup = false;
				else {
					stackSize--;
					if (errorStack != 0)
						errorStack--;
					EObject grammarElement = token.getGrammarElement();
					if (grammarElement instanceof AbstractElement) {
						if (GrammarUtil.isOptionalCardinality((AbstractElement) grammarElement)) {
							result = errorStack == 0;
						}
					} else {
						lookup = false;
					}
				}
			}
		}

		@Override
		public void visitParsedNonTerminalEnd(ParsedNonTerminalEnd token) {
			if (lookup && !token.isSkipped()) {
				if (errorStack != 0)
					errorStack++;
				stackSize++;
			}
		}

		@Override
		public void visitCompoundParsedTokenEnd(org.eclipse.xtext.parser.packrat.tokens.CompoundParsedToken.End token) {
			if (lookup && !token.isSkipped()) {
				if (errorStack != 0)
					errorStack++;
				stackSize++;
			}
		}

		@Override
		public void visitParsedTerminal(ParsedTerminal token) {
			if (lookup && !token.isHidden() && !token.isSkipped() && (token.getGrammarElement() instanceof AbstractElement)) {
				if (GrammarUtil.isOptionalCardinality((AbstractElement) token.getGrammarElement())) {
					result = errorStack == 0;
					lookup = !result;
				}
			}
		}

		@Override
		public void visitErrorToken(ErrorToken token) {
			if (!token.isSkipped())
				errorStack++;
		}

		public void visitMarker(Marker marker) {
			final List<AbstractParsedToken> content = marker.getContent();
			if (!lookup) {
				for(int i = 0; i < content.size(); i++) {
					content.get(i).accept(this);
				}
			} else {
				for(int i = content.size() - 1; i >= 0; i--) {
					content.get(i).accept(this);
				}
			}
		}

		private final class Skipper extends AbstractParsedTokenVisitor {
			private boolean continueSkip;
			private int skippedOffset;
			private int stackSize;

			private Skipper() {
				this.continueSkip = true;
				this.skippedOffset = 0;
				this.stackSize = 0;
			}

			@Override
			public void visitAbstractParsedToken(AbstractParsedToken token) {
				//
			}

			@Override
			public void visitCompoundParsedToken(CompoundParsedToken token) {
				if (!token.isSkipped()) {
					if (continueSkip) {
						markedTokens.add(token);
						token.setSkipped(true);
						stackSize++;
					}
				}
			}

			@Override
			public void visitCompoundParsedTokenEnd(CompoundParsedToken.End token) {
				if (!token.isSkipped()) {
					if (continueSkip) {
						markedTokens.add(token);
						token.setSkipped(true);
						stackSize--;
						continueSkip = stackSize != 0;
					}
				}
			}

			@Override
			public void visitParsedTerminal(ParsedTerminal token) {
				if (!token.isSkipped()) {
					if (continueSkip) {
						markedTokens.add(token);
						token.setSkipped(true);
						skippedOffset += token.getLength();
						continueSkip = stackSize != 0;
					}
				}
			}

			@Override
			public void visitParsedNonTerminal(ParsedNonTerminal token) {
				if (!token.isSkipped()) {
					if (continueSkip) {
						markedTokens.add(token);
						token.setSkipped(true);
						stackSize++;
					}
				}
			}

			@Override
			public void visitParsedNonTerminalEnd(ParsedNonTerminalEnd token) {
				if (!token.isSkipped()) {
					if (continueSkip) {
						markedTokens.add(token);
						token.setSkipped(true);
						stackSize--;
						continueSkip = stackSize != 0;
					}
				}
			}

			@Override
			public void visitErrorToken(ErrorToken token) {
				if (!token.isSkipped()) {
					markedTokens.add(token);
					token.setSkipped(true);
				}
			}
		}
	}

	public IBacktrackingResult skipPreviousToken() {
		return new NestedBacktrackingResult().skipPreviousToken();
	}

}
