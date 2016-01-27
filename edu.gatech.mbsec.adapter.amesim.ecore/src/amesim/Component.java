/**
 */
package amesim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link amesim.Component#getName <em>Name</em>}</li>
 *   <li>{@link amesim.Component#getSubModelName <em>Sub Model Name</em>}</li>
 *   <li>{@link amesim.Component#getSubModelInstanceNumber <em>Sub Model Instance Number</em>}</li>
 *   <li>{@link amesim.Component#getSubModelDirectory <em>Sub Model Directory</em>}</li>
 *   <li>{@link amesim.Component#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link amesim.Component#getParameter <em>Parameter</em>}</li>
 *   <li>{@link amesim.Component#getPort <em>Port</em>}</li>
 *   <li>{@link amesim.Component#getNestedComponent <em>Nested Component</em>}</li>
 *   <li>{@link amesim.Component#getNestedLine <em>Nested Line</em>}</li>
 *   <li>{@link amesim.Component#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link amesim.Component#getYCoordinate <em>YCoordinate</em>}</li>
 *   <li>{@link amesim.Component#getIconName <em>Icon Name</em>}</li>
 *   <li>{@link amesim.Component#getNumberOfRotations <em>Number Of Rotations</em>}</li>
 *   <li>{@link amesim.Component#isIsFlipped <em>Is Flipped</em>}</li>
 * </ul>
 * </p>
 *
 * @see amesim.AmesimPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see amesim.AmesimPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link amesim.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Model Name</em>' attribute.
	 * @see #setSubModelName(String)
	 * @see amesim.AmesimPackage#getComponent_SubModelName()
	 * @model
	 * @generated
	 */
	String getSubModelName();

	/**
	 * Sets the value of the '{@link amesim.Component#getSubModelName <em>Sub Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Model Name</em>' attribute.
	 * @see #getSubModelName()
	 * @generated
	 */
	void setSubModelName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Model Instance Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Model Instance Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Model Instance Number</em>' attribute.
	 * @see #setSubModelInstanceNumber(String)
	 * @see amesim.AmesimPackage#getComponent_SubModelInstanceNumber()
	 * @model
	 * @generated
	 */
	String getSubModelInstanceNumber();

	/**
	 * Sets the value of the '{@link amesim.Component#getSubModelInstanceNumber <em>Sub Model Instance Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Model Instance Number</em>' attribute.
	 * @see #getSubModelInstanceNumber()
	 * @generated
	 */
	void setSubModelInstanceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Sub Model Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Model Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Model Directory</em>' attribute.
	 * @see #setSubModelDirectory(String)
	 * @see amesim.AmesimPackage#getComponent_SubModelDirectory()
	 * @model
	 * @generated
	 */
	String getSubModelDirectory();

	/**
	 * Sets the value of the '{@link amesim.Component#getSubModelDirectory <em>Sub Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Model Directory</em>' attribute.
	 * @see #getSubModelDirectory()
	 * @generated
	 */
	void setSubModelDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see amesim.AmesimPackage#getComponent_CategoryName()
	 * @model
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link amesim.Component#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link amesim.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see amesim.AmesimPackage#getComponent_Parameter()
	 * @model type="amesim.Parameter" containment="true"
	 * @generated
	 */
	EList getParameter();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link amesim.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see amesim.AmesimPackage#getComponent_Port()
	 * @model type="amesim.Port" containment="true"
	 * @generated
	 */
	EList getPort();

	/**
	 * Returns the value of the '<em><b>Nested Component</b></em>' containment reference list.
	 * The list contents are of type {@link amesim.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Component</em>' containment reference list.
	 * @see amesim.AmesimPackage#getComponent_NestedComponent()
	 * @model type="amesim.Component" containment="true"
	 * @generated
	 */
	EList getNestedComponent();

	/**
	 * Returns the value of the '<em><b>Nested Line</b></em>' containment reference list.
	 * The list contents are of type {@link amesim.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Line</em>' containment reference list.
	 * @see amesim.AmesimPackage#getComponent_NestedLine()
	 * @model type="amesim.Line" containment="true"
	 * @generated
	 */
	EList getNestedLine();

	/**
	 * Returns the value of the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XCoordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCoordinate</em>' attribute.
	 * @see #setXCoordinate(String)
	 * @see amesim.AmesimPackage#getComponent_XCoordinate()
	 * @model
	 * @generated
	 */
	String getXCoordinate();

	/**
	 * Sets the value of the '{@link amesim.Component#getXCoordinate <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCoordinate</em>' attribute.
	 * @see #getXCoordinate()
	 * @generated
	 */
	void setXCoordinate(String value);

	/**
	 * Returns the value of the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YCoordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCoordinate</em>' attribute.
	 * @see #setYCoordinate(String)
	 * @see amesim.AmesimPackage#getComponent_YCoordinate()
	 * @model
	 * @generated
	 */
	String getYCoordinate();

	/**
	 * Sets the value of the '{@link amesim.Component#getYCoordinate <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCoordinate</em>' attribute.
	 * @see #getYCoordinate()
	 * @generated
	 */
	void setYCoordinate(String value);

	/**
	 * Returns the value of the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Name</em>' attribute.
	 * @see #setIconName(String)
	 * @see amesim.AmesimPackage#getComponent_IconName()
	 * @model
	 * @generated
	 */
	String getIconName();

	/**
	 * Sets the value of the '{@link amesim.Component#getIconName <em>Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Name</em>' attribute.
	 * @see #getIconName()
	 * @generated
	 */
	void setIconName(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Rotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Rotations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Rotations</em>' attribute.
	 * @see #setNumberOfRotations(int)
	 * @see amesim.AmesimPackage#getComponent_NumberOfRotations()
	 * @model
	 * @generated
	 */
	int getNumberOfRotations();

	/**
	 * Sets the value of the '{@link amesim.Component#getNumberOfRotations <em>Number Of Rotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Rotations</em>' attribute.
	 * @see #getNumberOfRotations()
	 * @generated
	 */
	void setNumberOfRotations(int value);

	/**
	 * Returns the value of the '<em><b>Is Flipped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Flipped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Flipped</em>' attribute.
	 * @see #setIsFlipped(boolean)
	 * @see amesim.AmesimPackage#getComponent_IsFlipped()
	 * @model
	 * @generated
	 */
	boolean isIsFlipped();

	/**
	 * Sets the value of the '{@link amesim.Component#isIsFlipped <em>Is Flipped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Flipped</em>' attribute.
	 * @see #isIsFlipped()
	 * @generated
	 */
	void setIsFlipped(boolean value);

} // Component
