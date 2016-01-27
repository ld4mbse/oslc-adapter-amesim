/**
 */
package amesim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see amesim.AmesimPackage#getParameterType()
 * @model
 * @generated
 */
public final class ParameterType extends AbstractEnumerator {
	/**
	 * The '<em><b>AME REAL PARAMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AME REAL PARAMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AME_REAL_PARAMETER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AME_REAL_PARAMETER = 0;

	/**
	 * The '<em><b>AME INTEGER PARAMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AME INTEGER PARAMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AME_INTEGER_PARAMETER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AME_INTEGER_PARAMETER = 1;

	/**
	 * The '<em><b>AME TEXT PARAMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AME TEXT PARAMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AME_TEXT_PARAMETER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AME_TEXT_PARAMETER = 2;

	/**
	 * The '<em><b>AME REAL PARAMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AME_REAL_PARAMETER
	 * @generated
	 * @ordered
	 */
	public static final ParameterType AME_REAL_PARAMETER_LITERAL = new ParameterType(AME_REAL_PARAMETER, "AME_REAL_PARAMETER", "AME_REAL_PARAMETER");

	/**
	 * The '<em><b>AME INTEGER PARAMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AME_INTEGER_PARAMETER
	 * @generated
	 * @ordered
	 */
	public static final ParameterType AME_INTEGER_PARAMETER_LITERAL = new ParameterType(AME_INTEGER_PARAMETER, "AME_INTEGER_PARAMETER", "AME_INTEGER_PARAMETER");

	/**
	 * The '<em><b>AME TEXT PARAMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AME_TEXT_PARAMETER
	 * @generated
	 * @ordered
	 */
	public static final ParameterType AME_TEXT_PARAMETER_LITERAL = new ParameterType(AME_TEXT_PARAMETER, "AME_TEXT_PARAMETER", "AME_TEXT_PARAMETER");

	/**
	 * An array of all the '<em><b>Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParameterType[] VALUES_ARRAY =
		new ParameterType[] {
			AME_REAL_PARAMETER_LITERAL,
			AME_INTEGER_PARAMETER_LITERAL,
			AME_TEXT_PARAMETER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Parameter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParameterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parameter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterType get(int value) {
		switch (value) {
			case AME_REAL_PARAMETER: return AME_REAL_PARAMETER_LITERAL;
			case AME_INTEGER_PARAMETER: return AME_INTEGER_PARAMETER_LITERAL;
			case AME_TEXT_PARAMETER: return AME_TEXT_PARAMETER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ParameterType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ParameterType
