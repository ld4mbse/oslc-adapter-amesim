
@OslcSchema ({
    @OslcNamespaceDefinition(prefix = OslcConstants.DCTERMS_NAMESPACE_PREFIX,             namespaceURI = OslcConstants.DCTERMS_NAMESPACE),
    @OslcNamespaceDefinition(prefix = OslcConstants.OSLC_CORE_NAMESPACE_PREFIX,           namespaceURI = OslcConstants.OSLC_CORE_NAMESPACE),
    @OslcNamespaceDefinition(prefix = OslcConstants.OSLC_DATA_NAMESPACE_PREFIX,           namespaceURI = OslcConstants.OSLC_DATA_NAMESPACE),
    @OslcNamespaceDefinition(prefix = OslcConstants.RDF_NAMESPACE_PREFIX,                 namespaceURI = OslcConstants.RDF_NAMESPACE),
    @OslcNamespaceDefinition(prefix = OslcConstants.RDFS_NAMESPACE_PREFIX,                namespaceURI = OslcConstants.RDFS_NAMESPACE),
//    @OslcNamespaceDefinition(prefix = Constants.CHANGE_MANAGEMENT_NAMESPACE_PREFIX,       namespaceURI = Constants.CHANGE_MANAGEMENT_NAMESPACE),   
//    @OslcNamespaceDefinition(prefix = Constants.FOAF_NAMESPACE_PREFIX,                    namespaceURI = Constants.FOAF_NAMESPACE),
//    @OslcNamespaceDefinition(prefix = Constants.QUALITY_MANAGEMENT_PREFIX,                namespaceURI = Constants.QUALITY_MANAGEMENT_NAMESPACE),
//    @OslcNamespaceDefinition(prefix = Constants.REQUIREMENTS_MANAGEMENT_PREFIX,           namespaceURI = Constants.REQUIREMENTS_MANAGEMENT_NAMESPACE),
//    @OslcNamespaceDefinition(prefix = Constants.SOFTWARE_CONFIGURATION_MANAGEMENT_PREFIX, namespaceURI = Constants.SOFTWARE_CONFIGURATION_MANAGEMENT_NAMESPACE),
    @OslcNamespaceDefinition(prefix = Constants.MBSE_PREFIX, namespaceURI = Constants.MBSE_NAMESPACE),
    @OslcNamespaceDefinition(prefix = Constants.AMESIM_CIRCUIT_PREFIX, namespaceURI = Constants.AMESIM_CIRCUIT_NAMESPACE),
    @OslcNamespaceDefinition(prefix = Constants.AMESIM_COMPONENT_PREFIX, namespaceURI = Constants.AMESIM_COMPONENT_NAMESPACE),
    @OslcNamespaceDefinition(prefix = Constants.AMESIM_LINE_PREFIX, namespaceURI = Constants.AMESIM_LINE_NAMESPACE),
    @OslcNamespaceDefinition(prefix = Constants.AMESIM_PORT_PREFIX, namespaceURI = Constants.AMESIM_PORT_NAMESPACE),
    @OslcNamespaceDefinition(prefix = Constants.AMESIM_PARAMETER_PREFIX, namespaceURI = Constants.AMESIM_PARAMETER_NAMESPACE),
    @OslcNamespaceDefinition(prefix = Constants.AMESIM_GLOBALPARAMETER_PREFIX, namespaceURI = Constants.AMESIM_GLOBALPARAMETER_NAMESPACE)
})
package edu.gatech.mbse.oslc4jamesim.resources;

import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespaceDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcSchema;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;


