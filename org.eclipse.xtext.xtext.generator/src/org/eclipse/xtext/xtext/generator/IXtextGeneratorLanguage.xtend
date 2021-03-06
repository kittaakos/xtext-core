/*******************************************************************************
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator

import java.util.List
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.xtext.generator.model.StandaloneSetupAccess

/**
 * Configuration for an Xtext language. Implemented by {@link XtextGeneratorLanguage}.
 * 
 * @noimplement This interface should not be implemented by clients.
 */
interface IXtextGeneratorLanguage {
	
	def Grammar getGrammar()
	
	def List<String> getFileExtensions()
	
	def StandaloneSetupAccess getRuntimeGenSetup()
	
	def GuiceModuleAccess getRuntimeGenModule()
	
	def GuiceModuleAccess getIdeGenModule()
	
	def GuiceModuleAccess getEclipsePluginGenModule()
	
	def GuiceModuleAccess getIdeaGenModule()
	
	def GuiceModuleAccess getWebGenModule()
	
	def ResourceSet getResourceSet()
	
	/**
	 * @deprecated Use {@link CodeConfig#isPreferXtendStubs()} instead
	 */
	@Deprecated
	def boolean isGenerateXtendStubs() 
	
}
