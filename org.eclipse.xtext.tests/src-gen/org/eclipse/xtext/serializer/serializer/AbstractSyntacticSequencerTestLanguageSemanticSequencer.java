/*
 * generated by Xtext
 */
package org.eclipse.xtext.serializer.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.serializer.services.SyntacticSequencerTestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.syntacticsequencertest.ActionOnly;
import org.eclipse.xtext.serializer.syntacticsequencertest.Add0;
import org.eclipse.xtext.serializer.syntacticsequencertest.Add1;
import org.eclipse.xtext.serializer.syntacticsequencertest.Add2;
import org.eclipse.xtext.serializer.syntacticsequencertest.AlternativeTransition;
import org.eclipse.xtext.serializer.syntacticsequencertest.BooleanAlternative;
import org.eclipse.xtext.serializer.syntacticsequencertest.BooleanAlternativeLiteral;
import org.eclipse.xtext.serializer.syntacticsequencertest.BooleanValues;
import org.eclipse.xtext.serializer.syntacticsequencertest.Bug398890;
import org.eclipse.xtext.serializer.syntacticsequencertest.FragmentCallerType;
import org.eclipse.xtext.serializer.syntacticsequencertest.LongAlternative;
import org.eclipse.xtext.serializer.syntacticsequencertest.MandatoryKeywords;
import org.eclipse.xtext.serializer.syntacticsequencertest.MandatoryManyTransition;
import org.eclipse.xtext.serializer.syntacticsequencertest.Model;
import org.eclipse.xtext.serializer.syntacticsequencertest.Mult2;
import org.eclipse.xtext.serializer.syntacticsequencertest.OptionalManyTransition;
import org.eclipse.xtext.serializer.syntacticsequencertest.OptionalSingleTransition;
import org.eclipse.xtext.serializer.syntacticsequencertest.SingleCrossReference;
import org.eclipse.xtext.serializer.syntacticsequencertest.SyntacticsequencertestPackage;
import org.eclipse.xtext.serializer.syntacticsequencertest.UnassignedDatatype;
import org.eclipse.xtext.serializer.syntacticsequencertest.Val0;
import org.eclipse.xtext.serializer.syntacticsequencertest.Val1;
import org.eclipse.xtext.serializer.syntacticsequencertest.Val2;

@SuppressWarnings("all")
public abstract class AbstractSyntacticSequencerTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SyntacticSequencerTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SyntacticsequencertestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SyntacticsequencertestPackage.ACTION_ONLY:
				sequence_ActionOnly(context, (ActionOnly) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.ADD0:
				sequence_Addition0(context, (Add0) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.ADD1:
				sequence_Addition1(context, (Add1) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.ADD2:
				sequence_Addition2(context, (Add2) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.ALTERNATIVE_TRANSITION:
				sequence_AlternativeTransition(context, (AlternativeTransition) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.BOOLEAN_ALTERNATIVE:
				sequence_BooleanAlternative(context, (BooleanAlternative) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.BOOLEAN_ALTERNATIVE_LITERAL:
				sequence_BooleanAlternativeLiteral(context, (BooleanAlternativeLiteral) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.BOOLEAN_VALUES:
				sequence_BooleanValues(context, (BooleanValues) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.BUG398890:
				sequence_Bug398890(context, (Bug398890) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.FRAGMENT_CALLER_TYPE:
				sequence_Fragment1_FragmentCaller(context, (FragmentCallerType) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.LONG_ALTERNATIVE:
				sequence_LongAlternative(context, (LongAlternative) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.MANDATORY_KEYWORDS:
				sequence_MandatoryKeywords(context, (MandatoryKeywords) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.MANDATORY_MANY_TRANSITION:
				sequence_MandatoryManyTransition(context, (MandatoryManyTransition) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.MULT2:
				sequence_Multiplication2(context, (Mult2) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.OPTIONAL_MANY_TRANSITION:
				sequence_OptionalManyTransition(context, (OptionalManyTransition) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.OPTIONAL_SINGLE_TRANSITION:
				sequence_OptionalSingleTransition(context, (OptionalSingleTransition) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.SINGLE_CROSS_REFERENCE:
				sequence_SingleCrossReference(context, (SingleCrossReference) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.UNASSIGNED_DATATYPE:
				sequence_UnassignedDatatype(context, (UnassignedDatatype) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.VAL0:
				sequence_Prim0(context, (Val0) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.VAL1:
				sequence_Prim1(context, (Val1) semanticObject); 
				return; 
			case SyntacticsequencertestPackage.VAL2:
				sequence_Prim2(context, (Val2) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionOnly returns ActionOnly
	 *
	 * Constraint:
	 *     {ActionOnly}
	 */
	protected void sequence_ActionOnly(ISerializationContext context, ActionOnly semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exp0 returns Add0
	 *     Addition0 returns Add0
	 *     Addition0.Add0_1_0 returns Add0
	 *
	 * Constraint:
	 *     (left=Addition0_Add0_1_0 right=Prim0)
	 */
	protected void sequence_Addition0(ISerializationContext context, Add0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.ADD0__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.ADD0__LEFT));
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.ADD0__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.ADD0__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddition0Access().getAdd0LeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAddition0Access().getRightPrim0ParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp1 returns Add1
	 *     Addition1 returns Add1
	 *     Addition1.Add1_1_0 returns Add1
	 *     Prim1 returns Add1
	 *
	 * Constraint:
	 *     (left=Addition1_Add1_1_0 right=Prim1)
	 */
	protected void sequence_Addition1(ISerializationContext context, Add1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.ADD1__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.ADD1__LEFT));
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.ADD1__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.ADD1__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddition1Access().getAdd1LeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAddition1Access().getRightPrim1ParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp2 returns Add2
	 *     Addition2 returns Add2
	 *     Addition2.Add2_1_0 returns Add2
	 *     Multiplication2 returns Add2
	 *     Multiplication2.Mult2_1_0 returns Add2
	 *     Prim2 returns Add2
	 *
	 * Constraint:
	 *     (left=Addition2_Add2_1_0 right=Multiplication2)
	 */
	protected void sequence_Addition2(ISerializationContext context, Add2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.ADD2__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.ADD2__LEFT));
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.ADD2__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.ADD2__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAddition2Access().getAdd2LeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAddition2Access().getRightMultiplication2ParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AlternativeTransition returns AlternativeTransition
	 *
	 * Constraint:
	 *     val=ID
	 */
	protected void sequence_AlternativeTransition(ISerializationContext context, AlternativeTransition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.ALTERNATIVE_TRANSITION__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.ALTERNATIVE_TRANSITION__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAlternativeTransitionAccess().getValIDTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BooleanAlternativeLiteral returns BooleanAlternativeLiteral
	 *
	 * Constraint:
	 *     isTrue?='kw2'?
	 */
	protected void sequence_BooleanAlternativeLiteral(ISerializationContext context, BooleanAlternativeLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BooleanAlternative returns BooleanAlternative
	 *
	 * Constraint:
	 *     bool=BooleanAlternativeLiteral
	 */
	protected void sequence_BooleanAlternative(ISerializationContext context, BooleanAlternative semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.BOOLEAN_ALTERNATIVE__BOOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.BOOLEAN_ALTERNATIVE__BOOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanAlternativeAccess().getBoolBooleanAlternativeLiteralParserRuleCall_1_0(), semanticObject.getBool());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BooleanValues returns BooleanValues
	 *
	 * Constraint:
	 *     (val1?='kw1'? val2?=BOOLEAN_TERMINAL_ID? val3?=BooleanDatatypeID?)
	 */
	protected void sequence_BooleanValues(ISerializationContext context, BooleanValues semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Bug398890 returns Bug398890
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Bug398890(ISerializationContext context, Bug398890 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.BUG398890__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.BUG398890__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBug398890Access().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FragmentCaller returns FragmentCallerType
	 *
	 * Constraint:
	 *     (val1=ID fragVal=ID val=ID)
	 */
	protected void sequence_Fragment1_FragmentCaller(ISerializationContext context, FragmentCallerType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.FRAGMENT_CALLER_TYPE__VAL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.FRAGMENT_CALLER_TYPE__VAL1));
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.FRAGMENT_CALLER_TYPE__FRAG_VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.FRAGMENT_CALLER_TYPE__FRAG_VAL));
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.FRAGMENT_CALLER_TYPE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.FRAGMENT_CALLER_TYPE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFragmentCallerAccess().getVal1IDTerminalRuleCall_1_0(), semanticObject.getVal1());
		feeder.accept(grammarAccess.getFragment1Access().getFragValIDTerminalRuleCall_0(), semanticObject.getFragVal());
		feeder.accept(grammarAccess.getFragmentCallerAccess().getValIDTerminalRuleCall_3_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LongAlternative returns LongAlternative
	 *
	 * Constraint:
	 *     (
	 *         foo=ID 
	 *         (
	 *             val1+=ID | 
	 *             val2+=ID | 
	 *             val3+=ID | 
	 *             val4+=ID | 
	 *             val5+=ID | 
	 *             val6+=ID | 
	 *             val7+=ID | 
	 *             val8+=ID
	 *         )*
	 *     )
	 */
	protected void sequence_LongAlternative(ISerializationContext context, LongAlternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MandatoryKeywords returns MandatoryKeywords
	 *
	 * Constraint:
	 *     (val1=ID val2=ID val3=ID)
	 */
	protected void sequence_MandatoryKeywords(ISerializationContext context, MandatoryKeywords semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.MANDATORY_KEYWORDS__VAL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.MANDATORY_KEYWORDS__VAL1));
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.MANDATORY_KEYWORDS__VAL2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.MANDATORY_KEYWORDS__VAL2));
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.MANDATORY_KEYWORDS__VAL3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.MANDATORY_KEYWORDS__VAL3));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMandatoryKeywordsAccess().getVal1IDTerminalRuleCall_1_0(), semanticObject.getVal1());
		feeder.accept(grammarAccess.getMandatoryKeywordsAccess().getVal2IDTerminalRuleCall_3_0(), semanticObject.getVal2());
		feeder.accept(grammarAccess.getMandatoryKeywordsAccess().getVal3IDTerminalRuleCall_6_0(), semanticObject.getVal3());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MandatoryManyTransition returns MandatoryManyTransition
	 *
	 * Constraint:
	 *     val=ID
	 */
	protected void sequence_MandatoryManyTransition(ISerializationContext context, MandatoryManyTransition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.MANDATORY_MANY_TRANSITION__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.MANDATORY_MANY_TRANSITION__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMandatoryManyTransitionAccess().getValIDTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         x1=MandatoryKeywords | 
	 *         x2=Exp0 | 
	 *         x3=Exp1 | 
	 *         x4=Exp2 | 
	 *         x5=SingleCrossReference | 
	 *         x6=BooleanAlternative | 
	 *         x7=UnassignedDatatype | 
	 *         x8=OptionalSingleTransition | 
	 *         x9=OptionalManyTransition | 
	 *         x10=MandatoryManyTransition | 
	 *         x11=AlternativeTransition | 
	 *         x12=BooleanValues | 
	 *         x13=LongAlternative | 
	 *         x14=ActionOnly | 
	 *         x15=FragmentCaller | 
	 *         x16=Bug398890
	 *     )
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exp2 returns Mult2
	 *     Addition2 returns Mult2
	 *     Addition2.Add2_1_0 returns Mult2
	 *     Multiplication2 returns Mult2
	 *     Multiplication2.Mult2_1_0 returns Mult2
	 *     Prim2 returns Mult2
	 *
	 * Constraint:
	 *     (left=Multiplication2_Mult2_1_0 right=Prim2)
	 */
	protected void sequence_Multiplication2(ISerializationContext context, Mult2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.MULT2__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.MULT2__LEFT));
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.MULT2__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.MULT2__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplication2Access().getMult2LeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplication2Access().getRightPrim2ParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OptionalManyTransition returns OptionalManyTransition
	 *
	 * Constraint:
	 *     val=ID
	 */
	protected void sequence_OptionalManyTransition(ISerializationContext context, OptionalManyTransition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.OPTIONAL_MANY_TRANSITION__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.OPTIONAL_MANY_TRANSITION__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOptionalManyTransitionAccess().getValIDTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OptionalSingleTransition returns OptionalSingleTransition
	 *
	 * Constraint:
	 *     val=ID
	 */
	protected void sequence_OptionalSingleTransition(ISerializationContext context, OptionalSingleTransition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.OPTIONAL_SINGLE_TRANSITION__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.OPTIONAL_SINGLE_TRANSITION__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOptionalSingleTransitionAccess().getValIDTerminalRuleCall_2_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp0 returns Val0
	 *     Addition0 returns Val0
	 *     Addition0.Add0_1_0 returns Val0
	 *     Prim0 returns Val0
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Prim0(ISerializationContext context, Val0 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.VAL0__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.VAL0__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrim0Access().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp1 returns Val1
	 *     Addition1 returns Val1
	 *     Addition1.Add1_1_0 returns Val1
	 *     Prim1 returns Val1
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Prim1(ISerializationContext context, Val1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.VAL1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.VAL1__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrim1Access().getNameIDTerminalRuleCall_0_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp2 returns Val2
	 *     Addition2 returns Val2
	 *     Addition2.Add2_1_0 returns Val2
	 *     Multiplication2 returns Val2
	 *     Multiplication2.Mult2_1_0 returns Val2
	 *     Prim2 returns Val2
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Prim2(ISerializationContext context, Val2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.VAL2__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.VAL2__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrim2Access().getNameIDTerminalRuleCall_0_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SingleCrossReference returns SingleCrossReference
	 *
	 * Constraint:
	 *     (
	 *         (name=TERMINAL_ID | name=ID) 
	 *         ref1=[SingleCrossReference|TERMINAL_ID]? 
	 *         ref2=[SingleCrossReference|DatatypeID]? 
	 *         ref3=[SingleCrossReference|ID]? 
	 *         ref4=[SingleCrossReference|ID]?
	 *     )
	 */
	protected void sequence_SingleCrossReference(ISerializationContext context, SingleCrossReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnassignedDatatype returns UnassignedDatatype
	 *
	 * Constraint:
	 *     val=ID
	 */
	protected void sequence_UnassignedDatatype(ISerializationContext context, UnassignedDatatype semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SyntacticsequencertestPackage.Literals.UNASSIGNED_DATATYPE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SyntacticsequencertestPackage.Literals.UNASSIGNED_DATATYPE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnassignedDatatypeAccess().getValIDTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
}
