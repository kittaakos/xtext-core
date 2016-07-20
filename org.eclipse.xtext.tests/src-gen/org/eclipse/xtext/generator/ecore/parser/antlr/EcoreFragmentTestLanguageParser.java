/*
 * generated by Xtext
 */
package org.eclipse.xtext.generator.ecore.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.generator.ecore.parser.antlr.internal.InternalEcoreFragmentTestLanguageParser;
import org.eclipse.xtext.generator.ecore.services.EcoreFragmentTestLanguageGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EcoreFragmentTestLanguageParser extends AbstractAntlrParser {

	@Inject
	private EcoreFragmentTestLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEcoreFragmentTestLanguageParser createParser(XtextTokenStream stream) {
		return new InternalEcoreFragmentTestLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Second";
	}

	public EcoreFragmentTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EcoreFragmentTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}