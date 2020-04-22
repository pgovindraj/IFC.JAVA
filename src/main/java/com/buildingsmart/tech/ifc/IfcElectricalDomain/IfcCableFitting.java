// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFitting;

@Guid("a981fcc0-253f-4511-8e27-f490e28f4ada")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableFitting extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowFitting
{
	@Description("<p>Identifies the predefined types of cable fitting from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Guid("acc5a78e-537d-4725-bbec-f998f3e31f25")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCableFittingTypeEnum predefinedType;


	public IfcCableFitting()
	{
	}

	public IfcCableFitting(String globalId)
	{
		super(globalId);
	}

	public IfcCableFittingTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableFittingTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

