// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPropertyTemplate;

@Guid("e9e318da-ceb2-4700-9c42-17311e5549b1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcComplexPropertyTemplate extends IfcPropertyTemplate
{
	@DataMember(Order = 0)
	@Guid("5aaf3e71-89c0-4dc0-be2d-2bcd73ca28e4")
	@JacksonXmlProperty(isAttribute=true, localName = "UsageName")
	private String usageName;

	@DataMember(Order = 1)
	@Guid("a22e2074-7fd6-45ce-a86e-7368cce1b211")
	@JacksonXmlProperty(isAttribute=true, localName = "TemplateType")
	private IfcComplexPropertyTemplateTypeEnum templateType;

	@Description("Reference to a set of property templates. It should only be provided, if the <em>PropertyType</em> is set to <small>COMPLEX</small>.")
	@DataMember(Order = 2)
	@Guid("060702e5-aeda-4f68-904b-8f9c880cd575")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertyTemplate")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasPropertyTemplates")
	private Set<IfcPropertyTemplate> hasPropertyTemplates;


	public IfcComplexPropertyTemplate()
	{
	}

	public IfcComplexPropertyTemplate(String globalId)
	{
		super(globalId);
	}

	public String getUsageName() {
		return this.usageName;
	}

	public void setUsageName(String usageName) {
		this.usageName = usageName;
	}

	public IfcComplexPropertyTemplateTypeEnum getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(IfcComplexPropertyTemplateTypeEnum templateType) {
		this.templateType = templateType;
	}

	public Set<IfcPropertyTemplate> getHasPropertyTemplates() {
		return this.hasPropertyTemplates;
	}


}

