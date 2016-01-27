package edu.gatech.mbse.oslc4jamesim.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.Link;

@OslcNamespace(Constants.AMESIM_NAMESPACE)
@OslcName("Line")
@OslcResourceShape(title = "Line Resource Shape", describes = Constants.TYPE_AMESIM_LINE)
public class AMESimLine extends AbstractResource{

	public AMESimLine() throws URISyntaxException {
		super();
	}
	public AMESimLine(URI about) throws URISyntaxException {
		super(about);
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@OslcDescription("Description of Line::name TBD")
	@OslcName("name")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8282/oslc4jamesim/services/rdfvocabulary#Line_name")
	@OslcTitle("name")
	@OslcValueType(ValueType.XMLLiteral)
	public String getName() {
		 return name;
	}
	private String subModelName;

	public void setSubModelName(String subModelName) {
		this.subModelName = subModelName;
	}

	@OslcDescription("Description of Line::subModelName TBD")
	@OslcName("subModelName")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8282/oslc4jamesim/services/rdfvocabulary#Line_subModelName")
	@OslcTitle("subModelName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSubModelName() {
		 return subModelName;
	}
	private String subModelInstanceNumber;

	public void setSubModelInstanceNumber(String subModelInstanceNumber) {
		this.subModelInstanceNumber = subModelInstanceNumber;
	}

	@OslcDescription("Description of Line::subModelInstanceNumber TBD")
	@OslcName("subModelInstanceNumber")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8282/oslc4jamesim/services/rdfvocabulary#Line_subModelInstanceNumber")
	@OslcTitle("subModelInstanceNumber")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSubModelInstanceNumber() {
		 return subModelInstanceNumber;
	}
	private String subModelDirectory;

	public void setSubModelDirectory(String subModelDirectory) {
		this.subModelDirectory = subModelDirectory;
	}

	@OslcDescription("Description of Line::subModelDirectory TBD")
	@OslcName("subModelDirectory")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8282/oslc4jamesim/services/rdfvocabulary#Line_subModelDirectory")
	@OslcTitle("subModelDirectory")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSubModelDirectory() {
		 return subModelDirectory;
	}
	private String sourceComponentName;

	public void setSourceComponentName(String sourceComponentName) {
		this.sourceComponentName = sourceComponentName;
	}

	@OslcDescription("Description of Line::sourceComponentName TBD")
	@OslcName("sourceComponentName")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8282/oslc4jamesim/services/rdfvocabulary#Line_sourceComponentName")
	@OslcTitle("sourceComponentName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSourceComponentName() {
		 return sourceComponentName;
	}
	private String targetComponentName;

	public void setTargetComponentName(String targetComponentName) {
		this.targetComponentName = targetComponentName;
	}

	@OslcDescription("Description of Line::targetComponentName TBD")
	@OslcName("targetComponentName")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8282/oslc4jamesim/services/rdfvocabulary#Line_targetComponentName")
	@OslcTitle("targetComponentName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getTargetComponentName() {
		 return targetComponentName;
	}
	private int sourcePortIndex;

	public void setSourcePortIndex(int sourcePortIndex) {
		this.sourcePortIndex = sourcePortIndex;
	}

	@OslcDescription("Description of Line::sourcePortIndex TBD")
	@OslcName("sourcePortIndex")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8282/oslc4jamesim/services/rdfvocabulary#Line_sourcePortIndex")
	@OslcTitle("sourcePortIndex")
	public int getSourcePortIndex() {
		 return sourcePortIndex;
	}
	private int targetPortIndex;

	public void setTargetPortIndex(int targetPortIndex) {
		this.targetPortIndex = targetPortIndex;
	}

	@OslcDescription("Description of Line::targetPortIndex TBD")
	@OslcName("targetPortIndex")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8282/oslc4jamesim/services/rdfvocabulary#Line_targetPortIndex")
	@OslcTitle("targetPortIndex")
	public int getTargetPortIndex() {
		 return targetPortIndex;
	}
	private URI      serviceProvider;

	public void setServiceProvider(final URI serviceProvider)
	{		this.serviceProvider = serviceProvider;
	}

	@OslcDescription("The scope of a resource is a URI for the resource's OSLC Service Provider.")
	@OslcPropertyDefinition(OslcConstants.OSLC_CORE_NAMESPACE + "serviceProvider")
	@OslcRange(OslcConstants.TYPE_SERVICE_PROVIDER)
	@OslcTitle("Service Provider")	
	public URI getServiceProvider()
	{
		return serviceProvider;
	}

	// ********* rdfType *********
	private URI[] rdfTypes = new URI[2];

	public void setRdfTypes(final URI[] rdfTypes) {
		this.rdfTypes = rdfTypes;
	}

	@OslcDescription("Additional resource type URIs ")
	@OslcName("type")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition(OslcConstants.RDF_NAMESPACE + "type")
	public URI[]  getRdfTypes() {
		 URI[] rdfTypes = {URI.create("http://eclipse.org/MBSE/Connection")};
		 return rdfTypes;
	}

}