/**
 */
package amesim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link amesim.Circuit#getComponent <em>Component</em>}</li>
 *   <li>{@link amesim.Circuit#getLine <em>Line</em>}</li>
 *   <li>{@link amesim.Circuit#getName <em>Name</em>}</li>
 *   <li>{@link amesim.Circuit#getGlobalParameter <em>Global Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see amesim.AmesimPackage#getCircuit()
 * @model
 * @generated
 */
public interface Circuit extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link amesim.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see amesim.AmesimPackage#getCircuit_Component()
	 * @model type="amesim.Component" containment="true"
	 * @generated
	 */
	EList getComponent();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link amesim.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see amesim.AmesimPackage#getCircuit_Line()
	 * @model type="amesim.Line" containment="true"
	 * @generated
	 */
	EList getLine();

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
	 * @see amesim.AmesimPackage#getCircuit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link amesim.Circuit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Global Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link amesim.GlobalParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Parameter</em>' containment reference list.
	 * @see amesim.AmesimPackage#getCircuit_GlobalParameter()
	 * @model type="amesim.GlobalParameter" containment="true"
	 * @generated
	 */
	EList getGlobalParameter();

} // Circuit
