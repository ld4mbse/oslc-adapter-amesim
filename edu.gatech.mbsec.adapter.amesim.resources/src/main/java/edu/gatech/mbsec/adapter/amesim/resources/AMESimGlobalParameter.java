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
@OslcName("GlobalParameter")
@OslcResourceShape(title = "GlobalParameter Resource Shape", describes = Constants.TYPE_AMESIM_GLOBALPARAMETER)
public class AMESimGlobalParameter extends AbstractResource{

	public AMESimGlobalParameter() throws URISyntaxException {
		super();
	}
	public AMESimGlobalParameter(URI about) throws URISyntaxException {
		super(about);
	}

	private String uniqueName;

	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}

	@OslcDescription("Description of GlobalParameter::uniqueName TBD")
	@OslcName("uniqueName")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/GlobalParameter/uniqueName")
	@OslcTitle("uniqueName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getUniqueName() {
		 return uniqueName;
	}
	private String title;

	public void setTitle(String title) {
		this.title = title;
	}

	@OslcDescription("Description of GlobalParameter::title TBD")
	@OslcName("title")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/GlobalParameter/title")
	@OslcTitle("title")
	@OslcValueType(ValueType.XMLLiteral)
	public String getTitle() {
		 return title;
	}
//	private AMESimParameterType type;
//
//	public void setType(AMESimParameterType type) {
//		this.type = type;
//	}
//
//	@OslcDescription("Description of GlobalParameter::type TBD")
//	@OslcName("type")
//	@OslcOccurs(Occurs.ZeroOrOne)
//	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/GlobalParameter/type")
//	@OslcTitle("type")
//	public AMESimParameterType getType() {
//		 return type;
//	}
	private String value;

	public void setValue(String value) {
		this.value = value;
	}

	@OslcDescription("Description of GlobalParameter::value TBD")
	@OslcName("value")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/GlobalParameter/value")
	@OslcTitle("value")
	@OslcValueType(ValueType.XMLLiteral)
	public String getValue() {
		 return value;
	}
	private String defaultValue;

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@OslcDescription("Description of GlobalParameter::defaultValue TBD")
	@OslcName("defaultValue")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/GlobalParameter/defaultValue")
	@OslcTitle("defaultValue")
	@OslcValueType(ValueType.XMLLiteral)
	public String getDefaultValue() {
		 return defaultValue;
	}
	private String minimalValue;

	public void setMinimalValue(String minimalValue) {
		this.minimalValue = minimalValue;
	}

	@OslcDescription("Description of GlobalParameter::minimalValue TBD")
	@OslcName("minimalValue")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/GlobalParameter/minimalValue")
	@OslcTitle("minimalValue")
	@OslcValueType(ValueType.XMLLiteral)
	public String getMinimalValue() {
		 return minimalValue;
	}
	private String maximalValue;

	public void setMaximalValue(String maximalValue) {
		this.maximalValue = maximalValue;
	}

	@OslcDescription("Description of GlobalParameter::maximalValue TBD")
	@OslcName("maximalValue")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/GlobalParameter/maximalValue")
	@OslcTitle("maximalValue")
	@OslcValueType(ValueType.XMLLiteral)
	public String getMaximalValue() {
		 return maximalValue;
	}
	private String unit;

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@OslcDescription("Description of GlobalParameter::unit TBD")
	@OslcName("unit")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://www.lmsintl.com/LMS-Imagine-Lab-AMESim/GlobalParameter/unit")
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

}