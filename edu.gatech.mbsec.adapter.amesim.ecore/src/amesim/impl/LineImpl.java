/**
 */
package amesim.impl;

import amesim.AmesimPackage;
import amesim.Line;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link amesim.impl.LineImpl#getName <em>Name</em>}</li>
 *   <li>{@link amesim.impl.LineImpl#getSubModelName <em>Sub Model Name</em>}</li>
 *   <li>{@link amesim.impl.LineImpl#getSubModelInstanceNumber <em>Sub Model Instance Number</em>}</li>
 *   <li>{@link amesim.impl.LineImpl#getSubModelDirectory <em>Sub Model Directory</em>}</li>
 *   <li>{@link amesim.impl.LineImpl#getSourceComponentName <em>Source Component Name</em>}</li>
 *   <li>{@link amesim.impl.LineImpl#getTargetComponentName <em>Target Component Name</em>}</li>
 *   <li>{@link amesim.impl.LineImpl#getSourcePortIndex <em>Source Port Index</em>}</li>
 *   <li>{@link amesim.impl.LineImpl#getTargetPortIndex <em>Target Port Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends MinimalEObjectImpl.Container implements Line {
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
	 * The default value of the '{@link #getSubModelName() <em>Sub Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubModelName() <em>Sub Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModelName()
	 * @generated
	 * @ordered
	 */
	protected String subModelName = SUB_MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubModelInstanceNumber() <em>Sub Model Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModelInstanceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_MODEL_INSTANCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubModelInstanceNumber() <em>Sub Model Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModelInstanceNumber()
	 * @generated
	 * @ordered
	 */
	protected String subModelInstanceNumber = SUB_MODEL_INSTANCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubModelDirectory() <em>Sub Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModelDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_MODEL_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubModelDirectory() <em>Sub Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModelDirectory()
	 * @generated
	 * @ordered
	 */
	protected String subModelDirectory = SUB_MODEL_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceComponentName() <em>Source Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceComponentName() <em>Source Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceComponentName()
	 * @generated
	 * @ordered
	 */
	protected String sourceComponentName = SOURCE_COMPONENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetComponentName() <em>Target Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetComponentName() <em>Target Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetComponentName()
	 * @generated
	 * @ordered
	 */
	protected String targetComponentName = TARGET_COMPONENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourcePortIndex() <em>Source Port Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePortIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_PORT_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSourcePortIndex() <em>Source Port Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePortIndex()
	 * @generated
	 * @ordered
	 */
	protected int sourcePortIndex = SOURCE_PORT_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPortIndex() <em>Target Port Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPortIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_PORT_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetPortIndex() <em>Target Port Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPortIndex()
	 * @generated
	 * @ordered
	 */
	protected int targetPortIndex = TARGET_PORT_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AmesimPackage.Literals.LINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.LINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubModelName() {
		return subModelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubModelName(String newSubModelName) {
		String oldSubModelName = subModelName;
		subModelName = newSubModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.LINE__SUB_MODEL_NAME, oldSubModelName, subModelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubModelInstanceNumber() {
		return subModelInstanceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubModelInstanceNumber(String newSubModelInstanceNumber) {
		String oldSubModelInstanceNumber = subModelInstanceNumber;
		subModelInstanceNumber = newSubModelInstanceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.LINE__SUB_MODEL_INSTANCE_NUMBER, oldSubModelInstanceNumber, subModelInstanceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubModelDirectory() {
		return subModelDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubModelDirectory(String newSubModelDirectory) {
		String oldSubModelDirectory = subModelDirectory;
		subModelDirectory = newSubModelDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.LINE__SUB_MODEL_DIRECTORY, oldSubModelDirectory, subModelDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceComponentName() {
		return sourceComponentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceComponentName(String newSourceComponentName) {
		String oldSourceComponentName = sourceComponentName;
		sourceComponentName = newSourceComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.LINE__SOURCE_COMPONENT_NAME, oldSourceComponentName, sourceComponentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetComponentName() {
		return targetComponentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetComponentName(String newTargetComponentName) {
		String oldTargetComponentName = targetComponentName;
		targetComponentName = newTargetComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.LINE__TARGET_COMPONENT_NAME, oldTargetComponentName, targetComponentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourcePortIndex() {
		return sourcePortIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePortIndex(int newSourcePortIndex) {
		int oldSourcePortIndex = sourcePortIndex;
		sourcePortIndex = newSourcePortIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.LINE__SOURCE_PORT_INDEX, oldSourcePortIndex, sourcePortIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetPortIndex() {
		return targetPortIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPortIndex(int newTargetPortIndex) {
		int oldTargetPortIndex = targetPortIndex;
		targetPortIndex = newTargetPortIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.LINE__TARGET_PORT_INDEX, oldTargetPortIndex, targetPortIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmesimPackage.LINE__NAME:
				return getName();
			case AmesimPackage.LINE__SUB_MODEL_NAME:
				return getSubModelName();
			case AmesimPackage.LINE__SUB_MODEL_INSTANCE_NUMBER:
				return getSubModelInstanceNumber();
			case AmesimPackage.LINE__SUB_MODEL_DIRECTORY:
				return getSubModelDirectory();
			case AmesimPackage.LINE__SOURCE_COMPONENT_NAME:
				return getSourceComponentName();
			case AmesimPackage.LINE__TARGET_COMPONENT_NAME:
				return getTargetComponentName();
			case AmesimPackage.LINE__SOURCE_PORT_INDEX:
				return new Integer(getSourcePortIndex());
			case AmesimPackage.LINE__TARGET_PORT_INDEX:
				return new Integer(getTargetPortIndex());
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
			case AmesimPackage.LINE__NAME:
				setName((String)newValue);
				return;
			case AmesimPackage.LINE__SUB_MODEL_NAME:
				setSubModelName((String)newValue);
				return;
			case AmesimPackage.LINE__SUB_MODEL_INSTANCE_NUMBER:
				setSubModelInstanceNumber((String)newValue);
				return;
			case AmesimPackage.LINE__SUB_MODEL_DIRECTORY:
				setSubModelDirectory((String)newValue);
				return;
			case AmesimPackage.LINE__SOURCE_COMPONENT_NAME:
				setSourceComponentName((String)newValue);
				return;
			case AmesimPackage.LINE__TARGET_COMPONENT_NAME:
				setTargetComponentName((String)newValue);
				return;
			case AmesimPackage.LINE__SOURCE_PORT_INDEX:
				setSourcePortIndex(((Integer)newValue).intValue());
				return;
			case AmesimPackage.LINE__TARGET_PORT_INDEX:
				setTargetPortIndex(((Integer)newValue).intValue());
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
			case AmesimPackage.LINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmesimPackage.LINE__SUB_MODEL_NAME:
				setSubModelName(SUB_MODEL_NAME_EDEFAULT);
				return;
			case AmesimPackage.LINE__SUB_MODEL_INSTANCE_NUMBER:
				setSubModelInstanceNumber(SUB_MODEL_INSTANCE_NUMBER_EDEFAULT);
				return;
			case AmesimPackage.LINE__SUB_MODEL_DIRECTORY:
				setSubModelDirectory(SUB_MODEL_DIRECTORY_EDEFAULT);
				return;
			case AmesimPackage.LINE__SOURCE_COMPONENT_NAME:
				setSourceComponentName(SOURCE_COMPONENT_NAME_EDEFAULT);
				return;
			case AmesimPackage.LINE__TARGET_COMPONENT_NAME:
				setTargetComponentName(TARGET_COMPONENT_NAME_EDEFAULT);
				return;
			case AmesimPackage.LINE__SOURCE_PORT_INDEX:
				setSourcePortIndex(SOURCE_PORT_INDEX_EDEFAULT);
				return;
			case AmesimPackage.LINE__TARGET_PORT_INDEX:
				setTargetPortIndex(TARGET_PORT_INDEX_EDEFAULT);
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
			case AmesimPackage.LINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmesimPackage.LINE__SUB_MODEL_NAME:
				return SUB_MODEL_NAME_EDEFAULT == null ? subModelName != null : !SUB_MODEL_NAME_EDEFAULT.equals(subModelName);
			case AmesimPackage.LINE__SUB_MODEL_INSTANCE_NUMBER:
				return SUB_MODEL_INSTANCE_NUMBER_EDEFAULT == null ? subModelInstanceNumber != null : !SUB_MODEL_INSTANCE_NUMBER_EDEFAULT.equals(subModelInstanceNumber);
			case AmesimPackage.LINE__SUB_MODEL_DIRECTORY:
				return SUB_MODEL_DIRECTORY_EDEFAULT == null ? subModelDirectory != null : !SUB_MODEL_DIRECTORY_EDEFAULT.equals(subModelDirectory);
			case AmesimPackage.LINE__SOURCE_COMPONENT_NAME:
				return SOURCE_COMPONENT_NAME_EDEFAULT == null ? sourceComponentName != null : !SOURCE_COMPONENT_NAME_EDEFAULT.equals(sourceComponentName);
			case AmesimPackage.LINE__TARGET_COMPONENT_NAME:
				return TARGET_COMPONENT_NAME_EDEFAULT == null ? targetComponentName != null : !TARGET_COMPONENT_NAME_EDEFAULT.equals(targetComponentName);
			case AmesimPackage.LINE__SOURCE_PORT_INDEX:
				return sourcePortIndex != SOURCE_PORT_INDEX_EDEFAULT;
			case AmesimPackage.LINE__TARGET_PORT_INDEX:
				return targetPortIndex != TARGET_PORT_INDEX_EDEFAULT;
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
		result.append(", subModelName: ");
		result.append(subModelName);
		result.append(", subModelInstanceNumber: ");
		result.append(subModelInstanceNumber);
		result.append(", subModelDirectory: ");
		result.append(subModelDirectory);
		result.append(", sourceComponentName: ");
		result.append(sourceComponentName);
		result.append(", targetComponentName: ");
		result.append(targetComponentName);
		result.append(", sourcePortIndex: ");
		result.append(sourcePortIndex);
		result.append(", targetPortIndex: ");
		result.append(targetPortIndex);
		result.append(')');
		return result.toString();
	}

} //LineImpl
