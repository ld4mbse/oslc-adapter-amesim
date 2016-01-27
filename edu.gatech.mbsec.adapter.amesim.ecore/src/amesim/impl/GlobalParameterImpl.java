/**
 */
package amesim.impl;

import amesim.AmesimPackage;
import amesim.GlobalParameter;
import amesim.ParameterType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link amesim.impl.GlobalParameterImpl#getUniqueName <em>Unique Name</em>}</li>
 *   <li>{@link amesim.impl.GlobalParameterImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link amesim.impl.GlobalParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link amesim.impl.GlobalParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link amesim.impl.GlobalParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link amesim.impl.GlobalParameterImpl#getMinimalValue <em>Minimal Value</em>}</li>
 *   <li>{@link amesim.impl.GlobalParameterImpl#getMaximalValue <em>Maximal Value</em>}</li>
 *   <li>{@link amesim.impl.GlobalParameterImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalParameterImpl extends MinimalEObjectImpl.Container implements GlobalParameter {
	/**
	 * The default value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected String uniqueName = UNIQUE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterType TYPE_EDEFAULT = ParameterType.AME_REAL_PARAMETER_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimalValue() <em>Minimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimalValue() <em>Minimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalValue()
	 * @generated
	 * @ordered
	 */
	protected String minimalValue = MINIMAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximalValue() <em>Maximal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximalValue() <em>Maximal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalValue()
	 * @generated
	 * @ordered
	 */
	protected String maximalValue = MAXIMAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AmesimPackage.Literals.GLOBAL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueName() {
		return uniqueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueName(String newUniqueName) {
		String oldUniqueName = uniqueName;
		uniqueName = newUniqueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.GLOBAL_PARAMETER__UNIQUE_NAME, oldUniqueName, uniqueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.GLOBAL_PARAMETER__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ParameterType newType) {
		ParameterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.GLOBAL_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.GLOBAL_PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.GLOBAL_PARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimalValue() {
		return minimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimalValue(String newMinimalValue) {
		String oldMinimalValue = minimalValue;
		minimalValue = newMinimalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.GLOBAL_PARAMETER__MINIMAL_VALUE, oldMinimalValue, minimalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximalValue() {
		return maximalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximalValue(String newMaximalValue) {
		String oldMaximalValue = maximalValue;
		maximalValue = newMaximalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.GLOBAL_PARAMETER__MAXIMAL_VALUE, oldMaximalValue, maximalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.GLOBAL_PARAMETER__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmesimPackage.GLOBAL_PARAMETER__UNIQUE_NAME:
				return getUniqueName();
			case AmesimPackage.GLOBAL_PARAMETER__TITLE:
				return getTitle();
			case AmesimPackage.GLOBAL_PARAMETER__TYPE:
				return getType();
			case AmesimPackage.GLOBAL_PARAMETER__VALUE:
				return getValue();
			case AmesimPackage.GLOBAL_PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case AmesimPackage.GLOBAL_PARAMETER__MINIMAL_VALUE:
				return getMinimalValue();
			case AmesimPackage.GLOBAL_PARAMETER__MAXIMAL_VALUE:
				return getMaximalValue();
			case AmesimPackage.GLOBAL_PARAMETER__UNIT:
				return getUnit();
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
			case AmesimPackage.GLOBAL_PARAMETER__UNIQUE_NAME:
				setUniqueName((String)newValue);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__TITLE:
				setTitle((String)newValue);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__TYPE:
				setType((ParameterType)newValue);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__VALUE:
				setValue((String)newValue);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__MINIMAL_VALUE:
				setMinimalValue((String)newValue);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__MAXIMAL_VALUE:
				setMaximalValue((String)newValue);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__UNIT:
				setUnit((String)newValue);
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
			case AmesimPackage.GLOBAL_PARAMETER__UNIQUE_NAME:
				setUniqueName(UNIQUE_NAME_EDEFAULT);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__MINIMAL_VALUE:
				setMinimalValue(MINIMAL_VALUE_EDEFAULT);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__MAXIMAL_VALUE:
				setMaximalValue(MAXIMAL_VALUE_EDEFAULT);
				return;
			case AmesimPackage.GLOBAL_PARAMETER__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case AmesimPackage.GLOBAL_PARAMETER__UNIQUE_NAME:
				return UNIQUE_NAME_EDEFAULT == null ? uniqueName != null : !UNIQUE_NAME_EDEFAULT.equals(uniqueName);
			case AmesimPackage.GLOBAL_PARAMETER__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AmesimPackage.GLOBAL_PARAMETER__TYPE:
				return type != TYPE_EDEFAULT;
			case AmesimPackage.GLOBAL_PARAMETER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case AmesimPackage.GLOBAL_PARAMETER__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case AmesimPackage.GLOBAL_PARAMETER__MINIMAL_VALUE:
				return MINIMAL_VALUE_EDEFAULT == null ? minimalValue != null : !MINIMAL_VALUE_EDEFAULT.equals(minimalValue);
			case AmesimPackage.GLOBAL_PARAMETER__MAXIMAL_VALUE:
				return MAXIMAL_VALUE_EDEFAULT == null ? maximalValue != null : !MAXIMAL_VALUE_EDEFAULT.equals(maximalValue);
			case AmesimPackage.GLOBAL_PARAMETER__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
		result.append(" (uniqueName: ");
		result.append(uniqueName);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(", value: ");
		result.append(value);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", minimalValue: ");
		result.append(minimalValue);
		result.append(", maximalValue: ");
		result.append(maximalValue);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //GlobalParameterImpl
