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
@OslcName("Port")
@OslcResourceShape(title = "Port Resource Shape", describes = Constants.TYPE_AMESIM_PORT)
public class AMESimPort extends AbstractResource{

	public AMESimPort() throws URISyntaxException {
		super();
	}
	public AMESimPort(URI about) throws URISyntaxException {
		super(about);
	}

	private String id;

	public void setId(String id) {
		this.id = id;
	}

	@OslcDescription("Description of Port::id TBD")
	@OslcName("id")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Port/id")
	@OslcTitle("id")
	@OslcValueType(ValueType.XMLLiteral)
	public String getId() {
		 return id;
	}
	private String type;

	public void setType(String type) {
		this.type = type;
	}

	@OslcDescription("Description of Port::type TBD")
	@OslcName("type")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Port/type")
	@OslcTitle("type")
	@OslcValueType(ValueType.XMLLiteral)
	public String getType() {
		 return type;
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
		 URI[] rdfTypes = {URI.create("http://eclipse.org/MBSE/Port")};
		 return rdfTypes;
	}

}