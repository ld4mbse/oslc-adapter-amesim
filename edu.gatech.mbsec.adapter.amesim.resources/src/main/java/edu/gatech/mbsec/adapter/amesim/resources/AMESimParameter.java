package edu.gatech.mbsec.adapter.amesim.resources;

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
@OslcName("Parameter")
@OslcResourceShape(title = "Parameter Resource Shape", describes = Constants.TYPE_AMESIM_PARAMETER)
public class AMESimParameter extends AbstractResource{

	public AMESimParameter() throws URISyntaxException {
		super();
	}
	public AMESimParameter(URI about) throws URISyntaxException {
		super(about);
	}

	private String value;

	public void setValue(String value) {
		this.value = value;
	}

	@OslcDescription("Description of Parameter::value TBD")
	@OslcName("value")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Parameter/value")
	@OslcTitle("value")
	@OslcValueType(ValueType.XMLLiteral)
	public String getValue() {
		 return value;
	}
	private String dataPath;

	public void setDataPath(String dataPath) {
		this.dataPath = dataPath;
	}

	@OslcDescription("Description of Parameter::dataPath TBD")
	@OslcName("dataPath")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Parameter/dataPath")
	@OslcTitle("dataPath")
	@OslcValueType(ValueType.XMLLiteral)
	public String getDataPath() {
		 return dataPath;
	}
	private String title;

	public void setTitle(String title) {
		this.title = title;
	}

	@OslcDescription("Description of Parameter::title TBD")
	@OslcName("title")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Parameter/title")
	@OslcTitle("title")
	@OslcValueType(ValueType.XMLLiteral)
	public String getTitle() {
		 return title;
	}
	private String unit;

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@OslcDescription("Description of Parameter::unit TBD")
	@OslcName("unit")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Parameter/unit")
	@OslcTitle("unit")
	@OslcValueType(ValueType.XMLLiteral)
	public String getUnit() {
		 return unit;
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
		 URI[] rdfTypes = {URI.create("http://eclipse.org/MBSE/Parameter")};
		 return rdfTypes;
	}

}