/*
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LinkEndCreationDataOperations.java,v 1.4 2007/05/03 21:11:52 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.LinkEndCreationData;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Link End Creation Data</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndCreationData#validateCreateLinkAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Create Link Action</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.LinkEndCreationData#validateSingleInputPin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Single Input Pin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndCreationDataOperations
		extends LinkEndDataOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndCreationDataOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinkEndCreationData can only be end data for CreateLinkAction or one of its specializations.
	 * self.LinkAction.oclIsKindOf(CreateLinkAction)
	 * @param linkEndCreationData The receiving '<em><b>Link End Creation Data</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCreateLinkAction(
			LinkEndCreationData linkEndCreationData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.LINK_END_CREATION_DATA__CREATE_LINK_ACTION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateCreateLinkAction", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(linkEndCreationData, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{linkEndCreationData}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link end creation data for ordered association ends must have a single input pin for the insertion point with type UnlimitedNatural and multiplicity of 1..1, otherwise the action has no input pin for the insertion point.
	 * let insertAtPins : Collection = self.insertAt in
	 * if self.end.ordering = #unordered
	 * then insertAtPins->size() = 0
	 * else let insertAtPin : InputPin = insertAts->asSequence()->first() in
	 * insertAtPins->size() = 1
	 * and insertAtPin.type = UnlimitedNatural
	 * and insertAtPin.multiplicity.is(1,1))
	 * endif
	 * 
	 * @param linkEndCreationData The receiving '<em><b>Link End Creation Data</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSingleInputPin(
			LinkEndCreationData linkEndCreationData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.LINK_END_CREATION_DATA__SINGLE_INPUT_PIN,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSingleInputPin", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(linkEndCreationData, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{linkEndCreationData}));
			}
			return false;
		}
		return true;
	}

} // LinkEndCreationDataOperations