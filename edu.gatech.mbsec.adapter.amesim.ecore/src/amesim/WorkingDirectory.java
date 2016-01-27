/**
 */
package amesim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Working Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link amesim.WorkingDirectory#getCircuit <em>Circuit</em>}</li>
 * </ul>
 * </p>
 *
 * @see amesim.AmesimPackage#getWorkingDirectory()
 * @model
 * @generated
 */
public interface WorkingDirectory extends EObject {
	/**
	 * Returns the value of the '<em><b>Circuit</b></em>' containment reference list.
	 * The list contents are of type {@link amesim.Circuit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit</em>' containment reference list.
	 * @see amesim.AmesimPackage#getWorkingDirectory_Circuit()
	 * @model type="amesim.Circuit" containment="true"
	 * @generated
	 */
	EList getCircuit();

} // WorkingDirectory
