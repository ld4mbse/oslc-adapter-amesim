/**
 */
package amesim.impl;

import amesim.AmesimPackage;
import amesim.Circuit;
import amesim.Component;
import amesim.GlobalParameter;
import amesim.Line;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link amesim.impl.CircuitImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link amesim.impl.CircuitImpl#getLine <em>Line</em>}</li>
 *   <li>{@link amesim.impl.CircuitImpl#getName <em>Name</em>}</li>
 *   <li>{@link amesim.impl.CircuitImpl#getGlobalParameter <em>Global Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircuitImpl extends MinimalEObjectImpl.Container implements Circuit {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList component;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList line;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGlobalParameter() <em>Global Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalParameter()
	 * @generated
	 * @ordered
	 */
	protected EList globalParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AmesimPackage.Literals.CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList(Component.class, this, AmesimPackage.CIRCUIT__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLine() {
		if (line == null) {
			line = new EObjectContainmentEList(Line.class, this, AmesimPackage.CIRCUIT__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.CIRCUIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGlobalParameter() {
		if (globalParameter == null) {
			globalParameter = new EObjectContainmentEList(GlobalParameter.class, this, AmesimPackage.CIRCUIT__GLOBAL_PARAMETER);
		}
		return globalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmesimPackage.CIRCUIT__COMPONENT:
				return ((InternalEList)getComponent()).basicRemove(otherEnd, msgs);
			case AmesimPackage.CIRCUIT__LINE:
				return ((InternalEList)getLine()).basicRemove(otherEnd, msgs);
			case AmesimPackage.CIRCUIT__GLOBAL_PARAMETER:
				return ((InternalEList)getGlobalParameter()).basicRemove(otherEnd, msgs);
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
			case AmesimPackage.CIRCUIT__COMPONENT:
				return getComponent();
			case AmesimPackage.CIRCUIT__LINE:
				return getLine();
			case AmesimPackage.CIRCUIT__NAME:
				return getName();
			case AmesimPackage.CIRCUIT__GLOBAL_PARAMETER:
				return getGlobalParameter();
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
			case AmesimPackage.CIRCUIT__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection)newValue);
				return;
			case AmesimPackage.CIRCUIT__LINE:
				getLine().clear();
				getLine().addAll((Collection)newValue);
				return;
			case AmesimPackage.CIRCUIT__NAME:
				setName((String)newValue);
				return;
			case AmesimPackage.CIRCUIT__GLOBAL_PARAMETER:
				getGlobalParameter().clear();
				getGlobalParameter().addAll((Collection)newValue);
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
			case AmesimPackage.CIRCUIT__COMPONENT:
				getComponent().clear();
				return;
			case AmesimPackage.CIRCUIT__LINE:
				getLine().clear();
				return;
			case AmesimPackage.CIRCUIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmesimPackage.CIRCUIT__GLOBAL_PARAMETER:
				getGlobalParameter().clear();
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
			case AmesimPackage.CIRCUIT__COMPONENT:
				return component != null && !component.isEmpty();
			case AmesimPackage.CIRCUIT__LINE:
				return line != null && !line.isEmpty();
			case AmesimPackage.CIRCUIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmesimPackage.CIRCUIT__GLOBAL_PARAMETER:
				return globalParameter != null && !globalParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CircuitImpl
