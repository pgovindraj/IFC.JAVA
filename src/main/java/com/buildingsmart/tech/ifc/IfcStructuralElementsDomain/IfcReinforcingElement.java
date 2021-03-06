// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralElementsDomain;

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
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingBar;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingMesh;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcTendon;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcTendonAnchor;
import com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponent;

@Guid("ca6074f0-a8aa-4b5b-a402-931d20010f8b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcReinforcingBar.class, name = "IfcReinforcingBar"), @JsonSubTypes.Type(value = IfcReinforcingMesh.class, name = "IfcReinforcingMesh"), @JsonSubTypes.Type(value = IfcTendon.class, name = "IfcTendon"), @JsonSubTypes.Type(value = IfcTendonAnchor.class, name = "IfcTendonAnchor")})
public abstract class IfcReinforcingElement extends com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponent
{
	@Description("Deprecated.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute deprecated.  Use material association at <em>IfcReinforcingElementType</em> instead.</blockquote>")
	@DataMember(Order = 0)
	@Guid("cc4f684c-9582-4577-b0f1-3dceb69e65f9")
	@JacksonXmlProperty(isAttribute=true, localName = "SteelGrade")
	private String steelGrade;


	public IfcReinforcingElement()
	{
	}

	public IfcReinforcingElement(String globalId)
	{
		super(globalId);
	}

	public String getSteelGrade() {
		return this.steelGrade;
	}

	public void setSteelGrade(String steelGrade) {
		this.steelGrade = steelGrade;
	}


}

