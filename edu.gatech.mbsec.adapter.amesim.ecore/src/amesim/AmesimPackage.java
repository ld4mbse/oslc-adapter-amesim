/**
 */
package amesim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see amesim.AmesimFactory
 * @model kind="package"
 * @generated
 */
public interface AmesimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "amesim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lms.amesim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmesimPackage eINSTANCE = amesim.impl.AmesimPackageImpl.init();

	/**
	 * The meta object id for the '{@link amesim.impl.WorkingDirectoryImpl <em>Working Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amesim.impl.WorkingDirectoryImpl
	 * @see amesim.impl.AmesimPackageImpl#getWorkingDirectory()
	 * @generated
	 */
	int WORKING_DIRECTORY = 0;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DIRECTORY__CIRCUIT = 0;

	/**
	 * The number of structural features of the '<em>Working Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKING_DIRECTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link amesim.impl.CircuitImpl <em>Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amesim.impl.CircuitImpl
	 * @see amesim.impl.AmesimPackageImpl#getCircuit()
	 * @generated
	 */
	int CIRCUIT = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__LINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Global Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__GLOBAL_PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link amesim.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amesim.impl.ComponentImpl
	 * @see amesim.impl.AmesimPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sub Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUB_MODEL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub Model Instance Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUB_MODEL_INSTANCE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Sub Model Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUB_MODEL_DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CATEGORY_NAME = 4;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORT = 6;

	/**
	 * The feature id for the '<em><b>Nested Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NESTED_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Nested Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NESTED_LINE = 8;

	/**
	 * The feature id for the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__XCOORDINATE = 9;

	/**
	 * The feature id for the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__YCOORDINATE = 10;

	/**
	 * The feature id for the '<em><b>Icon Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ICON_NAME = 11;

	/**
	 * The feature id for the '<em><b>Number Of Rotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NUMBER_OF_ROTATIONS = 12;

	/**
	 * The feature id for the '<em><b>Is Flipped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_FLIPPED = 13;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link amesim.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amesim.impl.LineImpl
	 * @see amesim.impl.AmesimPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sub Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SUB_MODEL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub Model Instance Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SUB_MODEL_INSTANCE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Sub Model Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SUB_MODEL_DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Source Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SOURCE_COMPONENT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Target Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TARGET_COMPONENT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Source Port Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SOURCE_PORT_INDEX = 6;

	/**
	 * The feature id for the '<em><b>Target Port Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TARGET_PORT_INDEX = 7;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link amesim.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amesim.impl.PortImpl
	 * @see amesim.impl.AmesimPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link amesim.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amesim.impl.ParameterImpl
	 * @see amesim.impl.AmesimPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATA_PATH = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIT = 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link amesim.impl.GlobalParameterImpl <em>Global Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amesim.impl.GlobalParameterImpl
	 * @see amesim.impl.AmesimPackageImpl#getGlobalParameter()
	 * @generated
	 */
	int GLOBAL_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETER__UNIQUE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETER__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETER__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETER__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETER__DEFAULT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Minimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETER__MINIMAL_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Maximal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETER__MAXIMAL_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETER__UNIT = 7;

	/**
	 * The number of structural features of the '<em>Global Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_PARAMETER_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link amesim.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amesim.impl.VariableImpl
	 * @see amesim.impl.AmesimPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link amesim.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see amesim.ParameterType
	 * @see amesim.impl.AmesimPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link amesim.WorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Working Directory</em>'.
	 * @see amesim.WorkingDirectory
	 * @generated
	 */
	EClass getWorkingDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link amesim.WorkingDirectory#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circuit</em>'.
	 * @see amesim.WorkingDirectory#getCircuit()
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	EReference getWorkingDirectory_Circuit();

	/**
	 * Returns the meta object for class '{@link amesim.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit</em>'.
	 * @see amesim.Circuit
	 * @generated
	 */
	EClass getCircuit();

	/**
	 * Returns the meta object for the containment reference list '{@link amesim.Circuit#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see amesim.Circuit#getComponent()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link amesim.Circuit#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see amesim.Circuit#getLine()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Line();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Circuit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see amesim.Circuit#getName()
	 * @see #getCircuit()
	 * @generated
	 */
	EAttribute getCircuit_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link amesim.Circuit#getGlobalParameter <em>Global Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Parameter</em>'.
	 * @see amesim.Circuit#getGlobalParameter()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_GlobalParameter();

	/**
	 * Returns the meta object for class '{@link amesim.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see amesim.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see amesim.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Component#getSubModelName <em>Sub Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Model Name</em>'.
	 * @see amesim.Component#getSubModelName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_SubModelName();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Component#getSubModelInstanceNumber <em>Sub Model Instance Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Model Instance Number</em>'.
	 * @see amesim.Component#getSubModelInstanceNumber()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_SubModelInstanceNumber();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Component#getSubModelDirectory <em>Sub Model Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Model Directory</em>'.
	 * @see amesim.Component#getSubModelDirectory()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_SubModelDirectory();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Component#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see amesim.Component#getCategoryName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_CategoryName();

	/**
	 * Returns the meta object for the containment reference list '{@link amesim.Component#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see amesim.Component#getParameter()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link amesim.Component#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see amesim.Component#getPort()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link amesim.Component#getNestedComponent <em>Nested Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Component</em>'.
	 * @see amesim.Component#getNestedComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_NestedComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link amesim.Component#getNestedLine <em>Nested Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Line</em>'.
	 * @see amesim.Component#getNestedLine()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_NestedLine();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Component#getXCoordinate <em>XCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoordinate</em>'.
	 * @see amesim.Component#getXCoordinate()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_XCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Component#getYCoordinate <em>YCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoordinate</em>'.
	 * @see amesim.Component#getYCoordinate()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_YCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Component#getIconName <em>Icon Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Name</em>'.
	 * @see amesim.Component#getIconName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IconName();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Component#getNumberOfRotations <em>Number Of Rotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Rotations</em>'.
	 * @see amesim.Component#getNumberOfRotations()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_NumberOfRotations();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Component#isIsFlipped <em>Is Flipped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Flipped</em>'.
	 * @see amesim.Component#isIsFlipped()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IsFlipped();

	/**
	 * Returns the meta object for class '{@link amesim.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see amesim.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Line#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see amesim.Line#getName()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Name();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Line#getSubModelName <em>Sub Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Model Name</em>'.
	 * @see amesim.Line#getSubModelName()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_SubModelName();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Line#getSubModelInstanceNumber <em>Sub Model Instance Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Model Instance Number</em>'.
	 * @see amesim.Line#getSubModelInstanceNumber()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_SubModelInstanceNumber();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Line#getSubModelDirectory <em>Sub Model Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Model Directory</em>'.
	 * @see amesim.Line#getSubModelDirectory()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_SubModelDirectory();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Line#getSourceComponentName <em>Source Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Component Name</em>'.
	 * @see amesim.Line#getSourceComponentName()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_SourceComponentName();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Line#getTargetComponentName <em>Target Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Component Name</em>'.
	 * @see amesim.Line#getTargetComponentName()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_TargetComponentName();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Line#getSourcePortIndex <em>Source Port Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Port Index</em>'.
	 * @see amesim.Line#getSourcePortIndex()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_SourcePortIndex();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Line#getTargetPortIndex <em>Target Port Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Port Index</em>'.
	 * @see amesim.Line#getTargetPortIndex()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_TargetPortIndex();

	/**
	 * Returns the meta object for class '{@link amesim.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see amesim.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Port#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see amesim.Port#getId()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Id();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see amesim.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for class '{@link amesim.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see amesim.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see amesim.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Parameter#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Path</em>'.
	 * @see amesim.Parameter#getDataPath()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DataPath();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Parameter#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see amesim.Parameter#getTitle()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Title();

	/**
	 * Returns the meta object for the attribute '{@link amesim.Parameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see amesim.Parameter#getUnit()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Unit();

	/**
	 * Returns the meta object for class '{@link amesim.GlobalParameter <em>Global Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Parameter</em>'.
	 * @see amesim.GlobalParameter
	 * @generated
	 */
	EClass getGlobalParameter();

	/**
	 * Returns the meta object for the attribute '{@link amesim.GlobalParameter#getUniqueName <em>Unique Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see amesim.GlobalParameter#getUniqueName()
	 * @see #getGlobalParameter()
	 * @generated
	 */
	EAttribute getGlobalParameter_UniqueName();

	/**
	 * Returns the meta object for the attribute '{@link amesim.GlobalParameter#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see amesim.GlobalParameter#getTitle()
	 * @see #getGlobalParameter()
	 * @generated
	 */
	EAttribute getGlobalParameter_Title();

	/**
	 * Returns the meta object for the attribute '{@link amesim.GlobalParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see amesim.GlobalParameter#getType()
	 * @see #getGlobalParameter()
	 * @generated
	 */
	EAttribute getGlobalParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link amesim.GlobalParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see amesim.GlobalParameter#getValue()
	 * @see #getGlobalParameter()
	 * @generated
	 */
	EAttribute getGlobalParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link amesim.GlobalParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see amesim.GlobalParameter#getDefaultValue()
	 * @see #getGlobalParameter()
	 * @generated
	 */
	EAttribute getGlobalParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link amesim.GlobalParameter#getMinimalValue <em>Minimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimal Value</em>'.
	 * @see amesim.GlobalParameter#getMinimalValue()
	 * @see #getGlobalParameter()
	 * @generated
	 */
	EAttribute getGlobalParameter_MinimalValue();

	/**
	 * Returns the meta object for the attribute '{@link amesim.GlobalParameter#getMaximalValue <em>Maximal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximal Value</em>'.
	 * @see amesim.GlobalParameter#getMaximalValue()
	 * @see #getGlobalParameter()
	 * @generated
	 */
	EAttribute getGlobalParameter_MaximalValue();

	/**
	 * Returns the meta object for the attribute '{@link amesim.GlobalParameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see amesim.GlobalParameter#getUnit()
	 * @see #getGlobalParameter()
	 * @generated
	 */
	EAttribute getGlobalParameter_Unit();

	/**
	 * Returns the meta object for class '{@link amesim.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see amesim.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for enum '{@link amesim.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see amesim.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AmesimFactory getAmesimFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link amesim.impl.WorkingDirectoryImpl <em>Working Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amesim.impl.WorkingDirectoryImpl
		 * @see amesim.impl.AmesimPackageImpl#getWorkingDirectory()
		 * @generated
		 */
		EClass WORKING_DIRECTORY = eINSTANCE.getWorkingDirectory();

		/**
		 * The meta object literal for the '<em><b>Circuit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKING_DIRECTORY__CIRCUIT = eINSTANCE.getWorkingDirectory_Circuit();

		/**
		 * The meta object literal for the '{@link amesim.impl.CircuitImpl <em>Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amesim.impl.CircuitImpl
		 * @see amesim.impl.AmesimPackageImpl#getCircuit()
		 * @generated
		 */
		EClass CIRCUIT = eINSTANCE.getCircuit();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__COMPONENT = eINSTANCE.getCircuit_Component();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__LINE = eINSTANCE.getCircuit_Line();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT__NAME = eINSTANCE.getCircuit_Name();

		/**
		 * The meta object literal for the '<em><b>Global Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__GLOBAL_PARAMETER = eINSTANCE.getCircuit_GlobalParameter();

		/**
		 * The meta object literal for the '{@link amesim.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amesim.impl.ComponentImpl
		 * @see amesim.impl.AmesimPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SUB_MODEL_NAME = eINSTANCE.getComponent_SubModelName();

		/**
		 * The meta object literal for the '<em><b>Sub Model Instance Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SUB_MODEL_INSTANCE_NUMBER = eINSTANCE.getComponent_SubModelInstanceNumber();

		/**
		 * The meta object literal for the '<em><b>Sub Model Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SUB_MODEL_DIRECTORY = eINSTANCE.getComponent_SubModelDirectory();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CATEGORY_NAME = eINSTANCE.getComponent_CategoryName();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARAMETER = eINSTANCE.getComponent_Parameter();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORT = eINSTANCE.getComponent_Port();

		/**
		 * The meta object literal for the '<em><b>Nested Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__NESTED_COMPONENT = eINSTANCE.getComponent_NestedComponent();

		/**
		 * The meta object literal for the '<em><b>Nested Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__NESTED_LINE = eINSTANCE.getComponent_NestedLine();

		/**
		 * The meta object literal for the '<em><b>XCoordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__XCOORDINATE = eINSTANCE.getComponent_XCoordinate();

		/**
		 * The meta object literal for the '<em><b>YCoordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__YCOORDINATE = eINSTANCE.getComponent_YCoordinate();

		/**
		 * The meta object literal for the '<em><b>Icon Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ICON_NAME = eINSTANCE.getComponent_IconName();

		/**
		 * The meta object literal for the '<em><b>Number Of Rotations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NUMBER_OF_ROTATIONS = eINSTANCE.getComponent_NumberOfRotations();

		/**
		 * The meta object literal for the '<em><b>Is Flipped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__IS_FLIPPED = eINSTANCE.getComponent_IsFlipped();

		/**
		 * The meta object literal for the '{@link amesim.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amesim.impl.LineImpl
		 * @see amesim.impl.AmesimPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__NAME = eINSTANCE.getLine_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__SUB_MODEL_NAME = eINSTANCE.getLine_SubModelName();

		/**
		 * The meta object literal for the '<em><b>Sub Model Instance Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__SUB_MODEL_INSTANCE_NUMBER = eINSTANCE.getLine_SubModelInstanceNumber();

		/**
		 * The meta object literal for the '<em><b>Sub Model Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__SUB_MODEL_DIRECTORY = eINSTANCE.getLine_SubModelDirectory();

		/**
		 * The meta object literal for the '<em><b>Source Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__SOURCE_COMPONENT_NAME = eINSTANCE.getLine_SourceComponentName();

		/**
		 * The meta object literal for the '<em><b>Target Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__TARGET_COMPONENT_NAME = eINSTANCE.getLine_TargetComponentName();

		/**
		 * The meta object literal for the '<em><b>Source Port Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__SOURCE_PORT_INDEX = eINSTANCE.getLine_SourcePortIndex();

		/**
		 * The meta object literal for the '<em><b>Target Port Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__TARGET_PORT_INDEX = eINSTANCE.getLine_TargetPortIndex();

		/**
		 * The meta object literal for the '{@link amesim.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amesim.impl.PortImpl
		 * @see amesim.impl.AmesimPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ID = eINSTANCE.getPort_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '{@link amesim.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amesim.impl.ParameterImpl
		 * @see amesim.impl.AmesimPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DATA_PATH = eINSTANCE.getParameter_DataPath();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TITLE = eINSTANCE.getParameter_Title();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__UNIT = eINSTANCE.getParameter_Unit();

		/**
		 * The meta object literal for the '{@link amesim.impl.GlobalParameterImpl <em>Global Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amesim.impl.GlobalParameterImpl
		 * @see amesim.impl.AmesimPackageImpl#getGlobalParameter()
		 * @generated
		 */
		EClass GLOBAL_PARAMETER = eINSTANCE.getGlobalParameter();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETER__UNIQUE_NAME = eINSTANCE.getGlobalParameter_UniqueName();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETER__TITLE = eINSTANCE.getGlobalParameter_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETER__TYPE = eINSTANCE.getGlobalParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETER__VALUE = eINSTANCE.getGlobalParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETER__DEFAULT_VALUE = eINSTANCE.getGlobalParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Minimal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETER__MINIMAL_VALUE = eINSTANCE.getGlobalParameter_MinimalValue();

		/**
		 * The meta object literal for the '<em><b>Maximal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETER__MAXIMAL_VALUE = eINSTANCE.getGlobalParameter_MaximalValue();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_PARAMETER__UNIT = eINSTANCE.getGlobalParameter_Unit();

		/**
		 * The meta object literal for the '{@link amesim.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amesim.impl.VariableImpl
		 * @see amesim.impl.AmesimPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link amesim.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see amesim.ParameterType
		 * @see amesim.impl.AmesimPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

	}

} //AmesimPackage
