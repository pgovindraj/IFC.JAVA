// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionCircuit;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem;

@Guid("08d5a5d6-3a9a-42d2-8411-5f268929c1fe")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcDistributionCircuit.class, name = "IfcDistributionCircuit"))
public class IfcDistributionSystem extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem
{
	@Description("Long name for a distribution system, used for informal purposes. It should be used, if available, in conjunction with the inherited <em>Name</em> attribute.  <blockquote class=\"note\">NOTE&nbsp; In many scenarios the <em>Name</em> attribute refers to the short name or number of a distribution system or branch circuit, and the <em>LongName</em> refers to a descriptive name.  </blockquote>")
	@DataMember(Order = 0)
	@Guid("595fb1c1-bd79-44fe-8bb4-98094a918348")
	@JacksonXmlProperty(isAttribute=true, localName = "LongName")
	private String longName;

	@Description("Predefined types of distribution systems.")
	@DataMember(Order = 1)
	@Guid("d0f9b35a-a5aa-40b0-9ef3-8d4ca8c027dc")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcDistributionSystemEnum predefinedType;


	public IfcDistributionSystem()
	{
	}

	public IfcDistributionSystem(String globalId)
	{
		super(globalId);
	}

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public IfcDistributionSystemEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDistributionSystemEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

