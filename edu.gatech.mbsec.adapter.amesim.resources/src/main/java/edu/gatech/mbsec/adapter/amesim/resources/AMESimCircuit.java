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
@OslcName("Circuit")
@OslcResourceShape(title = "Circuit Resource Shape", describes = Constants.TYPE_AMESIM_CIRCUIT)
public class AMESimCircuit extends AbstractResource{

	public AMESimCircuit() throws URISyntaxException {
		super();
	}
	public AMESimCircuit(URI about) throws URISyntaxException {
		super(about);
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@OslcDescription("Description of Circuit::name TBD")
	@OslcName("name")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Circuit/name")
	@OslcTitle("name")
	@OslcValueType(ValueType.XMLLiteral)
	public String getName() {
		 return name;
	}
	// ********* component *********
	private final Set<Link> components = new HashSet<Link>();

	public void setComponents(final Link[] components) {
		this.components.clear();
		if (components != null)
		{
			this.components.addAll(Arrays.asList(components));
		}
	}

	@OslcDescription("Description of Circuit::component TBD")
	@OslcName("component")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Circuit/component")
	@OslcTitle("component")
	@OslcReadOnly(false)
	public Link[]  getComponents() {
		 return components.toArray(new Link[components.size()]);
	}

	// ********* line *********
	private final Set<Link> lines = new HashSet<Link>();

	public void setLines(final Link[] lines) {
		this.lines.clear();
		if (lines != null)
		{
			this.lines.addAll(Arrays.asList(lines));
		}
	}

	@OslcDescription("Description of Circuit::line TBD")
	@OslcName("line")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Circuit/line")
	@OslcTitle("line")
	@OslcReadOnly(false)
	public Link[]  getLines() {
		 return lines.toArray(new Link[lines.size()]);
	}

	// ********* globalParameter *********
	private final Set<Link> globalParameters = new HashSet<Link>();

	public void setGlobalParameters(final Link[] globalParameters) {
		this.globalParameters.clear();
		if (globalParameters != null)
		{
			this.globalParameters.addAll(Arrays.asList(globalParameters));
		}
	}

	@OslcDescription("Description of Circuit::globalParameter TBD")
	@OslcName("globalParameter")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Circuit/globalParameter")
	@OslcTitle("globalParameter")
	@OslcReadOnly(false)
	public Link[]  getGlobalParameters() {
		 return globalParameters.toArray(new Link[globalParameters.size()]);
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
		 URI[] rdfTypes = {URI.create("http://eclipse.org/MBSE/Model")};
		 return rdfTypes;
	}

}