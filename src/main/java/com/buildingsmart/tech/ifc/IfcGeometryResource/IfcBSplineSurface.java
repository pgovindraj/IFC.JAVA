// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineSurfaceWithKnots;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedSurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBSplineSurfaceForm;

@Guid("6cc49723-24d6-446e-b2cc-fef52a6229c4")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcBSplineSurfaceWithKnots.class, name = "IfcBSplineSurfaceWithKnots"))
public abstract class IfcBSplineSurface extends IfcBoundedSurface
{
	@Description("Algebraic degree of basis functions in <em>u</em>.")
	@DataMember(Order = 0)
	@Required()
	@Guid("fa4795fe-5b45-439d-8feb-3e45270923c0")
	@JacksonXmlProperty(isAttribute=true, localName = "UDegree")
	private int uDegree;

	@Description("Algebraic degree of basis functions in <em>v</em>.")
	@DataMember(Order = 1)
	@Required()
	@Guid("519ed324-1b3a-4f12-b23a-87603ec0d73b")
	@JacksonXmlProperty(isAttribute=true, localName = "VDegree")
	private int vDegree;

	@Description("This is a list of lists of control points.")
	@DataMember(Order = 2)
	@Required()
	@Guid("bc33338e-2b58-4a61-b633-ccf5c80fe59b")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCartesianPoint")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ControlPointsList")
	private List<IfcCartesianPoint> controlPointsList;

	@Description("Indicator of special surface types.")
	@DataMember(Order = 3)
	@Required()
	@Guid("1a4a38ca-a512-42d4-94f7-13932a6fc328")
	@JacksonXmlProperty(isAttribute=true, localName = "SurfaceForm")
	private IfcBSplineSurfaceForm surfaceForm;

	@Description("Indication of whether the surface is closed in the <em>u</em> direction; this is for information only.")
	@DataMember(Order = 4)
	@Required()
	@Guid("f2d1928f-a5de-487f-a35f-907192690a47")
	@JacksonXmlProperty(isAttribute=true, localName = "UClosed")
	private Boolean uClosed;

	@Description("Indication of whether the surface is closed in the <em>v</em> direction; this is for information only.")
	@DataMember(Order = 5)
	@Required()
	@Guid("b71632d8-d689-4f75-a1da-1192c00c2f21")
	@JacksonXmlProperty(isAttribute=true, localName = "VClosed")
	private Boolean vClosed;

	@Description("Flag to indicate whether, or not, surface is self-intersecting; this is for information only.")
	@DataMember(Order = 6)
	@Required()
	@Guid("c4e7537e-84c5-49f8-9096-5fb6efa3c248")
	@JacksonXmlProperty(isAttribute=true, localName = "SelfIntersect")
	private Boolean selfIntersect;


	public IfcBSplineSurface()
	{
	}

	public IfcBSplineSurface(int uDegree, int vDegree, IfcCartesianPoint[] controlPointsList, IfcBSplineSurfaceForm surfaceForm, Boolean uClosed, Boolean vClosed, Boolean selfIntersect)
	{
		this.uDegree = uDegree;
		this.vDegree = vDegree;
		this.controlPointsList = new ArrayList<>(Arrays.asList(controlPointsList));
		this.surfaceForm = surfaceForm;
		this.uClosed = uClosed;
		this.vClosed = vClosed;
		this.selfIntersect = selfIntersect;
	}

	public int getUDegree() {
		return this.uDegree;
	}

	public void setUDegree(int uDegree) {
		this.uDegree = uDegree;
	}

	public int getVDegree() {
		return this.vDegree;
	}

	public void setVDegree(int vDegree) {
		this.vDegree = vDegree;
	}

	public List<IfcCartesianPoint> getControlPointsList() {
		return this.controlPointsList;
	}

	public IfcBSplineSurfaceForm getSurfaceForm() {
		return this.surfaceForm;
	}

	public void setSurfaceForm(IfcBSplineSurfaceForm surfaceForm) {
		this.surfaceForm = surfaceForm;
	}

	public Boolean getUClosed() {
		return this.uClosed;
	}

	public void setUClosed(Boolean uClosed) {
		this.uClosed = uClosed;
	}

	public Boolean getVClosed() {
		return this.vClosed;
	}

	public void setVClosed(Boolean vClosed) {
		this.vClosed = vClosed;
	}

	public Boolean getSelfIntersect() {
		return this.selfIntersect;
	}

	public void setSelfIntersect(Boolean selfIntersect) {
		this.selfIntersect = selfIntersect;
	}

	public int getUUpper() {
		return 0;
	}

	public int getVUpper() {
		return 0;
	}

	public IfcCartesianPoint getControlPoints() {
		return null;
	}


}

