/**
 */
package amesim.impl;

import amesim.AmesimPackage;
import amesim.Component;
import amesim.Line;
import amesim.Parameter;
import amesim.Port;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link amesim.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getSubModelName <em>Sub Model Name</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getSubModelInstanceNumber <em>Sub Model Instance Number</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getSubModelDirectory <em>Sub Model Directory</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getPort <em>Port</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getNestedComponent <em>Nested Component</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getNestedLine <em>Nested Line</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getYCoordinate <em>YCoordinate</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#getNumberOfRotations <em>Number Of Rotations</em>}</li>
 *   <li>{@link amesim.impl.ComponentImpl#isIsFlipped <em>Is Flipped</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The default value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected String categoryName = CATEGORY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList parameter;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList port;

	/**
	 * The cached value of the '{@link #getNestedComponent() <em>Nested Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList nestedComponent;

	/**
	 * The cached value of the '{@link #getNestedLine() <em>Nested Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedLine()
	 * @generated
	 * @ordered
	 */
	protected EList nestedLine;

	/**
	 * The default value of the '{@link #getXCoordinate() <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final String XCOORDINATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXCoordinate() <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinate()
	 * @generated
	 * @ordered
	 */
	protected String xCoordinate = XCOORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYCoordinate() <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final String YCOORDINATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYCoordinate() <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinate()
	 * @generated
	 * @ordered
	 */
	protected String yCoordinate = YCOORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconName() <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconName() <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconName()
	 * @generated
	 * @ordered
	 */
	protected String iconName = ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfRotations() <em>Number Of Rotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRotations()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ROTATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRotations() <em>Number Of Rotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRotations()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRotations = NUMBER_OF_ROTATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFlipped() <em>Is Flipped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFlipped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FLIPPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFlipped() <em>Is Flipped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFlipped()
	 * @generated
	 * @ordered
	 */
	protected boolean isFlipped = IS_FLIPPED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AmesimPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.COMPONENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.COMPONENT__SUB_MODEL_NAME, oldSubModelName, subModelName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.COMPONENT__SUB_MODEL_INSTANCE_NUMBER, oldSubModelInstanceNumber, subModelInstanceNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.COMPONENT__SUB_MODEL_DIRECTORY, oldSubModelDirectory, subModelDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryName(String newCategoryName) {
		String oldCategoryName = categoryName;
		categoryName = newCategoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.COMPONENT__CATEGORY_NAME, oldCategoryName, categoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList(Parameter.class, this, AmesimPackage.COMPONENT__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPort() {
		if (port == null) {
			port = new EObjectContainmentEList(Port.class, this, AmesimPackage.COMPONENT__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedComponent() {
		if (nestedComponent == null) {
			nestedComponent = new EObjectContainmentEList(Component.class, this, AmesimPackage.COMPONENT__NESTED_COMPONENT);
		}
		return nestedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNestedLine() {
		if (nestedLine == null) {
			nestedLine = new EObjectContainmentEList(Line.class, this, AmesimPackage.COMPONENT__NESTED_LINE);
		}
		return nestedLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXCoordinate() {
		return xCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXCoordinate(String newXCoordinate) {
		String oldXCoordinate = xCoordinate;
		xCoordinate = newXCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.COMPONENT__XCOORDINATE, oldXCoordinate, xCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYCoordinate() {
		return yCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCoordinate(String newYCoordinate) {
		String oldYCoordinate = yCoordinate;
		yCoordinate = newYCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.COMPONENT__YCOORDINATE, oldYCoordinate, yCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIconName() {
		return iconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconName(String newIconName) {
		String oldIconName = iconName;
		iconName = newIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.COMPONENT__ICON_NAME, oldIconName, iconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRotations() {
		return numberOfRotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRotations(int newNumberOfRotations) {
		int oldNumberOfRotations = numberOfRotations;
		numberOfRotations = newNumberOfRotations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.COMPONENT__NUMBER_OF_ROTATIONS, oldNumberOfRotations, numberOfRotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFlipped() {
		return isFlipped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFlipped(boolean newIsFlipped) {
		boolean oldIsFlipped = isFlipped;
		isFlipped = newIsFlipped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmesimPackage.COMPONENT__IS_FLIPPED, oldIsFlipped, isFlipped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmesimPackage.COMPONENT__PARAMETER:
				return ((InternalEList)getParameter()).basicRemove(otherEnd, msgs);
			case AmesimPackage.COMPONENT__PORT:
				return ((InternalEList)getPort()).basicRemove(otherEnd, msgs);
			case AmesimPackage.COMPONENT__NESTED_COMPONENT:
				return ((InternalEList)getNestedComponent()).basicRemove(otherEnd, msgs);
			case AmesimPackage.COMPONENT__NESTED_LINE:
				return ((InternalEList)getNestedLine()).basicRemove(otherEnd, msgs);
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
			case AmesimPackage.COMPONENT__NAME:
				return getName();
			case AmesimPackage.COMPONENT__SUB_MODEL_NAME:
				return getSubModelName();
			case AmesimPackage.COMPONENT__SUB_MODEL_INSTANCE_NUMBER:
				return getSubModelInstanceNumber();
			case AmesimPackage.COMPONENT__SUB_MODEL_DIRECTORY:
				return getSubModelDirectory();
			case AmesimPackage.COMPONENT__CATEGORY_NAME:
				return getCategoryName();
			case AmesimPackage.COMPONENT__PARAMETER:
				return getParameter();
			case AmesimPackage.COMPONENT__PORT:
				return getPort();
			case AmesimPackage.COMPONENT__NESTED_COMPONENT:
				return getNestedComponent();
			case AmesimPackage.COMPONENT__NESTED_LINE:
				return getNestedLine();
			case AmesimPackage.COMPONENT__XCOORDINATE:
				return getXCoordinate();
			case AmesimPackage.COMPONENT__YCOORDINATE:
				return getYCoordinate();
			case AmesimPackage.COMPONENT__ICON_NAME:
				return getIconName();
			case AmesimPackage.COMPONENT__NUMBER_OF_ROTATIONS:
				return new Integer(getNumberOfRotations());
			case AmesimPackage.COMPONENT__IS_FLIPPED:
				return isIsFlipped() ? Boolean.TRUE : Boolean.FALSE;
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
			case AmesimPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case AmesimPackage.COMPONENT__SUB_MODEL_NAME:
				setSubModelName((String)newValue);
				return;
			case AmesimPackage.COMPONENT__SUB_MODEL_INSTANCE_NUMBER:
				setSubModelInstanceNumber((String)newValue);
				return;
			case AmesimPackage.COMPONENT__SUB_MODEL_DIRECTORY:
				setSubModelDirectory((String)newValue);
				return;
			case AmesimPackage.COMPONENT__CATEGORY_NAME:
				setCategoryName((String)newValue);
				return;
			case AmesimPackage.COMPONENT__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection)newValue);
				return;
			case AmesimPackage.COMPONENT__PORT:
				getPort().clear();
				getPort().addAll((Collection)newValue);
				return;
			case AmesimPackage.COMPONENT__NESTED_COMPONENT:
				getNestedComponent().clear();
				getNestedComponent().addAll((Collection)newValue);
				return;
			case AmesimPackage.COMPONENT__NESTED_LINE:
				getNestedLine().clear();
				getNestedLine().addAll((Collection)newValue);
				return;
			case AmesimPackage.COMPONENT__XCOORDINATE:
				setXCoordinate((String)newValue);
				return;
			case AmesimPackage.COMPONENT__YCOORDINATE:
				setYCoordinate((String)newValue);
				return;
			case AmesimPackage.COMPONENT__ICON_NAME:
				setIconName((String)newValue);
				return;
			case AmesimPackage.COMPONENT__NUMBER_OF_ROTATIONS:
				setNumberOfRotations(((Integer)newValue).intValue());
				return;
			case AmesimPackage.COMPONENT__IS_FLIPPED:
				setIsFlipped(((Boolean)newValue).booleanValue());
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
			case AmesimPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmesimPackage.COMPONENT__SUB_MODEL_NAME:
				setSubModelName(SUB_MODEL_NAME_EDEFAULT);
				return;
			case AmesimPackage.COMPONENT__SUB_MODEL_INSTANCE_NUMBER:
				setSubModelInstanceNumber(SUB_MODEL_INSTANCE_NUMBER_EDEFAULT);
				return;
			case AmesimPackage.COMPONENT__SUB_MODEL_DIRECTORY:
				setSubModelDirectory(SUB_MODEL_DIRECTORY_EDEFAULT);
				return;
			case AmesimPackage.COMPONENT__CATEGORY_NAME:
				setCategoryName(CATEGORY_NAME_EDEFAULT);
				return;
			case AmesimPackage.COMPONENT__PARAMETER:
				getParameter().clear();
				return;
			case AmesimPackage.COMPONENT__PORT:
				getPort().clear();
				return;
			case AmesimPackage.COMPONENT__NESTED_COMPONENT:
				getNestedComponent().clear();
				return;
			case AmesimPackage.COMPONENT__NESTED_LINE:
				getNestedLine().clear();
				return;
			case AmesimPackage.COMPONENT__XCOORDINATE:
				setXCoordinate(XCOORDINATE_EDEFAULT);
				return;
			case AmesimPackage.COMPONENT__YCOORDINATE:
				setYCoordinate(YCOORDINATE_EDEFAULT);
				return;
			case AmesimPackage.COMPONENT__ICON_NAME:
				setIconName(ICON_NAME_EDEFAULT);
				return;
			case AmesimPackage.COMPONENT__NUMBER_OF_ROTATIONS:
				setNumberOfRotations(NUMBER_OF_ROTATIONS_EDEFAULT);
				return;
			case AmesimPackage.COMPONENT__IS_FLIPPED:
				setIsFlipped(IS_FLIPPED_EDEFAULT);
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
			case AmesimPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmesimPackage.COMPONENT__SUB_MODEL_NAME:
				return SUB_MODEL_NAME_EDEFAULT == null ? subModelName != null : !SUB_MODEL_NAME_EDEFAULT.equals(subModelName);
			case AmesimPackage.COMPONENT__SUB_MODEL_INSTANCE_NUMBER:
				return SUB_MODEL_INSTANCE_NUMBER_EDEFAULT == null ? subModelInstanceNumber != null : !SUB_MODEL_INSTANCE_NUMBER_EDEFAULT.equals(subModelInstanceNumber);
			case AmesimPackage.COMPONENT__SUB_MODEL_DIRECTORY:
				return SUB_MODEL_DIRECTORY_EDEFAULT == null ? subModelDirectory != null : !SUB_MODEL_DIRECTORY_EDEFAULT.equals(subModelDirectory);
			case AmesimPackage.COMPONENT__CATEGORY_NAME:
				return CATEGORY_NAME_EDEFAULT == null ? categoryName != null : !CATEGORY_NAME_EDEFAULT.equals(categoryName);
			case AmesimPackage.COMPONENT__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case AmesimPackage.COMPONENT__PORT:
				return port != null && !port.isEmpty();
			case AmesimPackage.COMPONENT__NESTED_COMPONENT:
				return nestedComponent != null && !nestedComponent.isEmpty();
			case AmesimPackage.COMPONENT__NESTED_LINE:
				return nestedLine != null && !nestedLine.isEmpty();
			case AmesimPackage.COMPONENT__XCOORDINATE:
				return XCOORDINATE_EDEFAULT == null ? xCoordinate != null : !XCOORDINATE_EDEFAULT.equals(xCoordinate);
			case AmesimPackage.COMPONENT__YCOORDINATE:
				return YCOORDINATE_EDEFAULT == null ? yCoordinate != null : !YCOORDINATE_EDEFAULT.equals(yCoordinate);
			case AmesimPackage.COMPONENT__ICON_NAME:
				return ICON_NAME_EDEFAULT == null ? iconName != null : !ICON_NAME_EDEFAULT.equals(iconName);
			case AmesimPackage.COMPONENT__NUMBER_OF_ROTATIONS:
				return numberOfRotations != NUMBER_OF_ROTATIONS_EDEFAULT;
			case AmesimPackage.COMPONENT__IS_FLIPPED:
				return isFlipped != IS_FLIPPED_EDEFAULT;
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
		result.append(", categoryName: ");
		result.append(categoryName);
		result.append(", xCoordinate: ");
		result.append(xCoordinate);
		result.append(", yCoordinate: ");
		result.append(yCoordinate);
		result.append(", iconName: ");
		result.append(iconName);
		result.append(", numberOfRotations: ");
		result.append(numberOfRotations);
		result.append(", isFlipped: ");
		result.append(isFlipped);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
