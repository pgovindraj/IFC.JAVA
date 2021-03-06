// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

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
import com.buildingsmart.tech.ifc.IfcHvacDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegment;

@Guid("8f73b81b-667e-4f2e-950f-3ce1fc86dce7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPipeSegment extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegment
{
	@DataMember(Order = 0)
	@Guid("b5e4efe4-d704-4a26-abca-161eaea57343")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcPipeSegmentTypeEnum predefinedType;


	public IfcPipeSegment()
	{
	}

	public IfcPipeSegment(String globalId)
	{
		super(globalId);
	}

	public IfcPipeSegmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcPipeSegmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

