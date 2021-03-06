// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

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
import com.buildingsmart.tech.ifc.IfcTopologyResource.*;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcLoop;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex;

@Guid("492ce60a-9294-46dd-85f5-c8937e2f84fe")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVertexLoop extends IfcLoop
{
	@Description("The vertex which defines the entire loop.")
	@DataMember(Order = 0)
	@Required()
	@Guid("d3ccd855-0f95-427e-85ca-6fb0a46737fa")
	@JacksonXmlProperty(isAttribute=false, localName = "LoopVertex")
	private IfcVertex loopVertex;


	public IfcVertexLoop()
	{
	}

	public IfcVertexLoop(IfcVertex loopVertex)
	{
		this.loopVertex = loopVertex;
	}

	public IfcVertex getLoopVertex() {
		return this.loopVertex;
	}

	public void setLoopVertex(IfcVertex loopVertex) {
		this.loopVertex = loopVertex;
	}


}

