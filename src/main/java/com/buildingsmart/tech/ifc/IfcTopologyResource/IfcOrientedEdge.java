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
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcEdge;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex;

@Guid("a0cbcd65-91d4-42a9-ba31-58d592875aa7")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOrientedEdge extends IfcEdge
{
	@Description("Edge entity used to construct this oriented edge.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c7122e72-f5c7-4ed0-97e7-f3feadf775d9")
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeElement")
	private IfcEdge edgeElement;

	@Description("BOOLEAN, If TRUE the topological orientation as used coincides with the orientation from start vertex to end vertex of the edge element. If FALSE otherwise.")
	@DataMember(Order = 1)
	@Required()
	@Guid("6fa9df70-e436-49e6-860f-f18263e0e214")
	@JacksonXmlProperty(isAttribute=true, localName = "Orientation")
	private Boolean orientation;


	public IfcOrientedEdge()
	{
	}

	public IfcOrientedEdge(IfcVertex edgeStart, IfcVertex edgeEnd, IfcEdge edgeElement, Boolean orientation)
	{
		super(edgeStart, edgeEnd);
		this.edgeElement = edgeElement;
		this.orientation = orientation;
	}

	public IfcEdge getEdgeElement() {
		return this.edgeElement;
	}

	public void setEdgeElement(IfcEdge edgeElement) {
		this.edgeElement = edgeElement;
	}

	public Boolean getOrientation() {
		return this.orientation;
	}

	public void setOrientation(Boolean orientation) {
		this.orientation = orientation;
	}

	public IfcVertex getEdgeStart() {
		return null;
	}

	public IfcVertex getEdgeEnd() {
		return null;
	}


}

