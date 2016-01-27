/**
 */
package amesim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link amesim.Line#getName <em>Name</em>}</li>
 *   <li>{@link amesim.Line#getSubModelName <em>Sub Model Name</em>}</li>
 *   <li>{@link amesim.Line#getSubModelInstanceNumber <em>Sub Model Instance Number</em>}</li>
 *   <li>{@link amesim.Line#getSubModelDirectory <em>Sub Model Directory</em>}</li>
 *   <li>{@link amesim.Line#getSourceComponentName <em>Source Component Name</em>}</li>
 *   <li>{@link amesim.Line#getTargetComponentName <em>Target Component Name</em>}</li>
 *   <li>{@link amesim.Line#getSourcePortIndex <em>Source Port Index</em>}</li>
 *   <li>{@link amesim.Line#getTargetPortIndex <em>Target Port Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see amesim.AmesimPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
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
	 * @see amesim.AmesimPackage#getLine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link amesim.Line#getName <em>Name</em>}' attribute.
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
	 * @see amesim.AmesimPackage#getLine_SubModelName()
	 * @model
	 * @generated
	 */
	String getSubModelName();

	/**
	 * Sets the value of the '{@link amesim.Line#getSubModelName <em>Sub Model Name</em>}' attribute.
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
	 * @see amesim.AmesimPackage#getLine_SubModelInstanceNumber()
	 * @model
	 * @generated
	 */
	String getSubModelInstanceNumber();

	/**
	 * Sets the value of the '{@link amesim.Line#getSubModelInstanceNumber <em>Sub Model Instance Number</em>}' attribute.
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
	 * @see amesim.AmesimPackage#getLine_SubModelDirectory()
	 * @model
	 * @generated
	 */
	String getSubModelDirectory();

	/**
	 * Sets the value of the '{@link amesim.Line#getSubModelDirectory <em>Sub Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Model Directory</em>' attribute.
	 * @see #getSubModelDirectory()
	 * @generated
	 */
	void setSubModelDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Source Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Component Name</em>' attribute.
	 * @see #setSourceComponentName(String)
	 * @see amesim.AmesimPackage#getLine_SourceComponentName()
	 * @model
	 * @generated
	 */
	String getSourceComponentName();

	/**
	 * Sets the value of the '{@link amesim.Line#getSourceComponentName <em>Source Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Component Name</em>' attribute.
	 * @see #getSourceComponentName()
	 * @generated
	 */
	void setSourceComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Target Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Component Name</em>' attribute.
	 * @see #setTargetComponentName(String)
	 * @see amesim.AmesimPackage#getLine_TargetComponentName()
	 * @model
	 * @generated
	 */
	String getTargetComponentName();

	/**
	 * Sets the value of the '{@link amesim.Line#getTargetComponentName <em>Target Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Component Name</em>' attribute.
	 * @see #getTargetComponentName()
	 * @generated
	 */
	void setTargetComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Source Port Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Port Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port Index</em>' attribute.
	 * @see #setSourcePortIndex(int)
	 * @see amesim.AmesimPackage#getLine_SourcePortIndex()
	 * @model
	 * @generated
	 */
	int getSourcePortIndex();

	/**
	 * Sets the value of the '{@link amesim.Line#getSourcePortIndex <em>Source Port Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port Index</em>' attribute.
	 * @see #getSourcePortIndex()
	 * @generated
	 */
	void setSourcePortIndex(int value);

	/**
	 * Returns the value of the '<em><b>Target Port Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Port Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Port Index</em>' attribute.
	 * @see #setTargetPortIndex(int)
	 * @see amesim.AmesimPackage#getLine_TargetPortIndex()
	 * @model
	 * @generated
	 */
	int getTargetPortIndex();

	/**
	 * Sets the value of the '{@link amesim.Line#getTargetPortIndex <em>Target Port Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port Index</em>' attribute.
	 * @see #getTargetPortIndex()
	 * @generated
	 */
	void setTargetPortIndex(int value);

} // Line
