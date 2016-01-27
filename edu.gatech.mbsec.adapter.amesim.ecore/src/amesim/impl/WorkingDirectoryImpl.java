/**
 */
package amesim.impl;

import amesim.AmesimPackage;
import amesim.Circuit;
import amesim.WorkingDirectory;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Working Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link amesim.impl.WorkingDirectoryImpl#getCircuit <em>Circuit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkingDirectoryImpl extends MinimalEObjectImpl.Container implements WorkingDirectory {
	/**
	 * The cached value of the '{@link #getCircuit() <em>Circuit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuit()
	 * @generated
	 * @ordered
	 */
	protected EList circuit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkingDirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AmesimPackage.Literals.WORKING_DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCircuit() {
		if (circuit == null) {
			circuit = new EObjectContainmentEList(Circuit.class, this, AmesimPackage.WORKING_DIRECTORY__CIRCUIT);
		}
		return circuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmesimPackage.WORKING_DIRECTORY__CIRCUIT:
				return ((InternalEList)getCircuit()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmesimPackage.WORKING_DIRECTORY__CIRCUIT:
				return getCircuit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmesimPackage.WORKING_DIRECTORY__CIRCUIT:
				getCircuit().clear();
				getCircuit().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmesimPackage.WORKING_DIRECTORY__CIRCUIT:
				getCircuit().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmesimPackage.WORKING_DIRECTORY__CIRCUIT:
				return circuit != null && !circuit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkingDirectoryImpl
