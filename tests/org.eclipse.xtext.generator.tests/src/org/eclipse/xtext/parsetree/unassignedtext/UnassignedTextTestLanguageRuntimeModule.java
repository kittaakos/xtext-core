/*
 * generated by Xtext
 */
package org.eclipse.xtext.parsetree.unassignedtext;

import org.eclipse.xtext.parsetree.reconstr.IUnassignedTextSerializer;

/**
 * Use this class to register components to be used within the IDE.
 */
public class UnassignedTextTestLanguageRuntimeModule extends
		AbstractUnassignedTextTestLanguageRuntimeModule {

	public Class<? extends IUnassignedTextSerializer> bindIUnassignedTextSerializer() {
		return UnassignedTextTestSerializer.class;
	}
}
