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
@OslcName("Component")
@OslcResourceShape(title = "Component Resource Shape", describes = Constants.TYPE_AMESIM_COMPONENT)
public class AMESimComponent extends AbstractResource{

	public AMESimComponent() throws URISyntaxException {
		super();
	}
	public AMESimComponent(URI about) throws URISyntaxException {
		super(about);
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@OslcDescription("Description of Component::name TBD")
	@OslcName("name")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/name")
	@OslcTitle("name")
	@OslcValueType(ValueType.XMLLiteral)
	public String getName() {
		 return name;
	}
	private String subModelName;

	public void setSubModelName(String subModelName) {
		this.subModelName = subModelName;
	}

	@OslcDescription("Description of Component::subModelName TBD")
	@OslcName("subModelName")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/subModelName")
	@OslcTitle("subModelName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSubModelName() {
		 return subModelName;
	}
	private String subModelInstanceNumber;

	public void setSubModelInstanceNumber(String subModelInstanceNumber) {
		this.subModelInstanceNumber = subModelInstanceNumber;
	}

	@OslcDescription("Description of Component::subModelInstanceNumber TBD")
	@OslcName("subModelInstanceNumber")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/subModelInstanceNumber")
	@OslcTitle("subModelInstanceNumber")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSubModelInstanceNumber() {
		 return subModelInstanceNumber;
	}
	private String subModelDirectory;

	public void setSubModelDirectory(String subModelDirectory) {
		this.subModelDirectory = subModelDirectory;
	}

	@OslcDescription("Description of Component::subModelDirectory TBD")
	@OslcName("subModelDirectory")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/subModelDirectory")
	@OslcTitle("subModelDirectory")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSubModelDirectory() {
		 return subModelDirectory;
	}
	private String categoryName;

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@OslcDescription("Description of Component::categoryName TBD")
	@OslcName("categoryName")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/categoryName")
	@OslcTitle("categoryName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCategoryName() {
		 return categoryName;
	}
	private String xCoordinate;

	public void setXCoordinate(String xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	@OslcDescription("Description of Component::xCoordinate TBD")
	@OslcName("xCoordinate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/xCoordinate")
	@OslcTitle("xCoordinate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getXCoordinate() {
		 return xCoordinate;
	}
	private String yCoordinate;

	public void setYCoordinate(String yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	@OslcDescription("Description of Component::yCoordinate TBD")
	@OslcName("yCoordinate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/yCoordinate")
	@OslcTitle("yCoordinate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getYCoordinate() {
		 return yCoordinate;
	}
	private String iconName;

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

	@OslcDescription("Description of Component::iconName TBD")
	@OslcName("iconName")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/iconName")
	@OslcTitle("iconName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getIconName() {
		 return iconName;
	}
	private int numberOfRotations;

	public void setNumberOfRotations(int numberOfRotations) {
		this.numberOfRotations = numberOfRotations;
	}

	@OslcDescription("Description of Component::numberOfRotations TBD")
	@OslcName("numberOfRotations")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/numberOfRotations")
	@OslcTitle("numberOfRotations")
	public int getNumberOfRotations() {
		 return numberOfRotations;
	}
	private boolean isFlipped;

	public void setIsFlipped(boolean isFlipped) {
		this.isFlipped = isFlipped;
	}

	@OslcDescription("Description of Component::isFlipped TBD")
	@OslcName("isFlipped")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/isFlipped")
	@OslcTitle("isFlipped")
	public boolean getIsFlipped() {
		 return isFlipped;
	}
	// ********* parameter *********
	private final Set<Link> parameters = new HashSet<Link>();

	public void setParameters(final Link[] parameters) {
		this.parameters.clear();
		if (parameters != null)
		{
			this.parameters.addAll(Arrays.asList(parameters));
		}
	}

	@OslcDescription("Description of Component::parameter TBD")
	@OslcName("parameter")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/parameter")
	@OslcTitle("parameter")
	@OslcReadOnly(false)
	public Link[]  getParameters() {
		 return parameters.toArray(new Link[parameters.size()]);
	}

	// ********* port *********
	private final Set<Link> ports = new HashSet<Link>();

	public void setPorts(final Link[] ports) {
		this.ports.clear();
		if (ports != null)
		{
			this.ports.addAll(Arrays.asList(ports));
		}
	}

	@OslcDescription("Description of Component::port TBD")
	@OslcName("port")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/port")
	@OslcTitle("port")
	@OslcReadOnly(false)
	public Link[]  getPorts() {
		 return ports.toArray(new Link[ports.size()]);
	}

	// ********* nestedComponent *********
	private final Set<Link> nestedComponents = new HashSet<Link>();

	public void setNestedComponents(final Link[] nestedComponents) {
		this.nestedComponents.clear();
		if (nestedComponents != null)
		{
			this.nestedComponents.addAll(Arrays.asList(nestedComponents));
		}
	}

	@OslcDescription("Description of Component::nestedComponent TBD")
	@OslcName("nestedComponent")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/nestedComponent")
	@OslcTitle("nestedComponent")
	@OslcReadOnly(false)
	public Link[]  getNestedComponents() {
		 return nestedComponents.toArray(new Link[nestedComponents.size()]);
	}

	// ********* nestedLine *********
	private final Set<Link> nestedLines = new HashSet<Link>();

	public void setNestedLines(final Link[] nestedLines) {
		this.nestedLines.clear();
		if (nestedLines != null)
		{
			this.nestedLines.addAll(Arrays.asList(nestedLines));
		}
	}

	@OslcDescription("Description of Component::nestedLine TBD")
	@OslcName("nestedLine")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/Component/nestedLine")
	@OslcTitle("nestedLine")
	@OslcReadOnly(false)
	public Link[]  getNestedLines() {
		 return nestedLines.toArray(new Link[nestedLines.size()]);
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
		 URI[] rdfTypes = {URI.create("http://eclipse.org/MBSE/Block")};
		 return rdfTypes;
	}

}