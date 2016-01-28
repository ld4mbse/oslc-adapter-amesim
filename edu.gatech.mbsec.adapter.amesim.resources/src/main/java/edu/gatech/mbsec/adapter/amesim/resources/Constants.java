
package edu.gatech.mbsec.adapter.amesim.resources;


import org.eclipse.lyo.oslc4j.core.model.OslcConstants;

public interface Constants
{
		
//	public static String CHANGE_MANAGEMENT_DOMAIN                    = "http://open-services.net/ns/cm#";
//    public static String CHANGE_MANAGEMENT_NAMESPACE                 = "http://open-services.net/ns/cm#";
//    public static String CHANGE_MANAGEMENT_NAMESPACE_PREFIX          = "oslc_cm";
//    public static String FOAF_NAMESPACE                              = "http://xmlns.com/foaf/0.1/";
//    public static String FOAF_NAMESPACE_PREFIX                       = "foaf";
//    public static String QUALITY_MANAGEMENT_NAMESPACE                = "http://open-services.net/ns/qm#";
//    public static String QUALITY_MANAGEMENT_PREFIX                   = "oslc_qm";
//    public static String REQUIREMENTS_MANAGEMENT_NAMESPACE           = "http://open-services.net/ns/rm#";
//    public static String REQUIREMENTS_MANAGEMENT_PREFIX              = "oslc_rm";
//    public static String SOFTWARE_CONFIGURATION_MANAGEMENT_NAMESPACE = "http://open-services.net/ns/scm#";
//    public static String SOFTWARE_CONFIGURATION_MANAGEMENT_PREFIX    = "oslc_scm";
//    public static String BUGZILLA_DOMAIN							 = "http://www.bugzilla.org/rdf#"; 
//    public static String BUGZILLA_NAMESPACE							 = "http://www.bugzilla.org/rdf#";
//    public static String BUGZILLA_NAMESPACE_PREFIX					 = "bugz";

	public static String MBSE_PREFIX							 = "mbse";
    public static String MBSE_NAMESPACE							 = "http://eclipse.org/MBSE/";
	
    public static String AMESIM_PREFIX								 = "amesim";
    public static String AMESIM_NAMESPACE							 = "http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/";
    
    public static String AMESIM_CIRCUIT_PREFIX                    		 = "amesim_circuit";
    public static String AMESIM_COMPONENT_PREFIX                    	 = "amesim_component";
    public static String AMESIM_LINE_PREFIX                    = "amesim_line";
    public static String AMESIM_PORT_PREFIX                    		 = "amesim_port";
    public static String AMESIM_PARAMETER_PREFIX               = "amesim_parameter";
    public static String AMESIM_GLOBALPARAMETER_PREFIX                   = "amesim_globalparameter";
   
    
    public static String AMESIM_CIRCUIT_NAMESPACE                    	 = AMESIM_NAMESPACE + "Circuit/";
    public static String AMESIM_COMPONENT_NAMESPACE                     = AMESIM_NAMESPACE + "Component/";
    public static String AMESIM_LINE_NAMESPACE                 = AMESIM_NAMESPACE + "Line/";
    public static String AMESIM_PORT_NAMESPACE                    	 = AMESIM_NAMESPACE + "Port/";
    public static String AMESIM_PARAMETER_NAMESPACE            = AMESIM_NAMESPACE + "Parameter/";
    public static String AMESIM_GLOBALPARAMETER_NAMESPACE                = AMESIM_NAMESPACE + "GlobalParameter/";

    
    public static String TYPE_AMESIM_WORKINGDIRECTORY			= AMESIM_NAMESPACE + "WorkingDirectory";
    public static String TYPE_AMESIM_CIRCUIT                   		 = AMESIM_NAMESPACE + "Circuit";
    public static String TYPE_AMESIM_COMPONENT                    		 = AMESIM_NAMESPACE + "Component";
    public static String TYPE_AMESIM_LINE                   	 = AMESIM_NAMESPACE + "Line";
    public static String TYPE_AMESIM_PORT                  		 = AMESIM_NAMESPACE + "Port";
    public static String TYPE_AMESIM_PARAMETER               	 = AMESIM_NAMESPACE + "Parameter";
    public static String TYPE_AMESIM_GLOBALPARAMETER                  	 = AMESIM_NAMESPACE + "GlobalParameter";
    public static String TYPE_AMESIM_VARIABLE			= AMESIM_NAMESPACE + "Variable";
    public static String TYPE_AMESIM_ELEMENTSTOCREATE	= AMESIM_NAMESPACE + "ElementsToCreate";

    
    
    public static String AMESIM_CIRCUIT_DOMAIN                    		 = "http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/circuit/rdf#";
    public static String AMESIM_COMPONENT_DOMAIN                    	 = "http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/component/rdf#";
    public static String AMESIM_LINE_DOMAIN                    = "http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/line/rdf#";
    public static String AMESIM_PORT_DOMAIN                    		 = "http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/port/rdf#";
    public static String AMESIM_PARAMETER_DOMAIN               = "http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/parameter/rdf#";
    public static String AMESIM_GLOBALPARAMETER_DOMAIN                   = "http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/globalparameter/rdf#";
    
    
    public static String  PATH_AMESIM_CIRCUIT						= "circuit";
    public static String  PATH_AMESIM_COMPONENT						= "component";
    public static String  PATH_AMESIM_LINE							= "line";
    public static String  PATH_AMESIM_PORT							= "port";
    public static String  PATH_AMESIM_PARAMETER						= "parameter";
    public static String  PATH_AMESIM_GLOBALPARAMETER				= "globalParameter";
    
//    public static String CHANGE_REQUEST             = "ChangeRequest";
//    public static String TYPE_CHANGE_REQUEST        = CHANGE_MANAGEMENT_NAMESPACE + "ChangeRequest";
//    public static String TYPE_CHANGE_SET            = SOFTWARE_CONFIGURATION_MANAGEMENT_NAMESPACE + "ChangeSet";
//    public static String TYPE_DISCUSSION            = OslcConstants.OSLC_CORE_NAMESPACE + "Discussion";
//    public static String TYPE_PERSON                = FOAF_NAMESPACE + "Person";
//    public static String TYPE_REQUIREMENT           = REQUIREMENTS_MANAGEMENT_NAMESPACE + "Requirement";
//    public static String TYPE_TEST_CASE             = QUALITY_MANAGEMENT_NAMESPACE + "TestCase";
//    public static String TYPE_TEST_EXECUTION_RECORD = QUALITY_MANAGEMENT_NAMESPACE + "TestExecutionRecord";
//    public static String TYPE_TEST_PLAN             = QUALITY_MANAGEMENT_NAMESPACE + "TestPlan";
//    public static String TYPE_TEST_RESULT           = QUALITY_MANAGEMENT_NAMESPACE + "TestResult";
//    public static String TYPE_TEST_SCRIPT           = QUALITY_MANAGEMENT_NAMESPACE + "TestScript";

    

    
    
    public static String PATH_CHANGE_REQUEST = "changeRequest";

//    public static String USAGE_LIST = CHANGE_MANAGEMENT_NAMESPACE + "list";
    
    public static final String HDR_OSLC_VERSION = "OSLC-Core-Version";
    
    public static final String NEXT_PAGE = "org.eclipse.lyo.oslc4j.bugzilla.NextPage";
}
