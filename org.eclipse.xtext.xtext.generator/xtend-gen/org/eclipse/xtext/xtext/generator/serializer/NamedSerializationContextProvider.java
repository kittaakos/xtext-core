/**
 * Copyright (c) 2016 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator.serializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.analysis.SerializationContextMap;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xtext.generator.serializer.NamedSerializationContexts;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
@SuppressWarnings("all")
public class NamedSerializationContextProvider {
  private final Map<ParserRule, Integer> rules;
  
  public NamedSerializationContextProvider(final Grammar grammar) {
    final Function1<Pair<Integer, ParserRule>, Pair<ParserRule, Integer>> _function = (Pair<Integer, ParserRule> it) -> {
      ParserRule _value = it.getValue();
      Integer _key = it.getKey();
      return Pair.<ParserRule, Integer>of(_value, _key);
    };
    this.rules = CollectionLiterals.<ParserRule, Integer>newHashMap(((Pair<? extends ParserRule, ? extends Integer>[])Conversions.unwrapArray(IterableExtensions.<Pair<Integer, ParserRule>, Pair<ParserRule, Integer>>map(IterableExtensions.<ParserRule>indexed(GrammarUtil.allParserRules(grammar)), _function), Pair.class)));
  }
  
  public <T extends Object> List<NamedSerializationContexts<T>> getNamedContexts(final SerializationContextMap<T> map) {
    final ArrayList<NamedSerializationContexts<T>> result = CollectionLiterals.<NamedSerializationContexts<T>>newArrayList();
    final HashMap<String, Integer> names = CollectionLiterals.<String, Integer>newHashMap();
    List<SerializationContextMap.Entry<T>> _values = map.values();
    for (final SerializationContextMap.Entry<T> e : _values) {
      Set<EClass> _types = e.getTypes();
      for (final EClass t : _types) {
        {
          final List<ISerializationContext> ctx = e.getContexts(t);
          String _xifexpression = null;
          if ((t == null)) {
            _xifexpression = "";
          } else {
            _xifexpression = t.getName();
          }
          String _plus = (_xifexpression + "_");
          String _significantGrammarElement = this.getSignificantGrammarElement(ctx);
          final String name = (_plus + _significantGrammarElement);
          final Integer dup = names.get(name);
          String _xifexpression_1 = null;
          if ((dup == null)) {
            String _xblockexpression = null;
            {
              names.put(name, Integer.valueOf(1));
              _xblockexpression = name;
            }
            _xifexpression_1 = _xblockexpression;
          } else {
            String _xblockexpression_1 = null;
            {
              names.put(name, Integer.valueOf(((dup).intValue() + 1)));
              _xblockexpression_1 = ((name + "_") + dup);
            }
            _xifexpression_1 = _xblockexpression_1;
          }
          final String unique = _xifexpression_1;
          T _value = e.getValue();
          NamedSerializationContexts<T> _namedSerializationContexts = new NamedSerializationContexts<T>(unique, t, ctx, _value);
          result.add(_namedSerializationContexts);
        }
      }
    }
    return result;
  }
  
  public String getSignificantGrammarElement(final Iterable<ISerializationContext> contexts) {
    ParserRule rule = null;
    int index = Integer.MAX_VALUE;
    for (final ISerializationContext ctx : contexts) {
      {
        ParserRule pr = ctx.getParserRule();
        if ((pr == null)) {
          final Action action = ctx.getAssignedAction();
          if ((action != null)) {
            pr = GrammarUtil.containingParserRule(action);
          }
        }
        if ((pr != null)) {
          final Integer i = this.rules.get(pr);
          if (((i).intValue() < index)) {
            index = (i).intValue();
            rule = pr;
          }
        }
      }
    }
    if ((rule != null)) {
      return rule.getName();
    }
    return "unknown";
  }
}
