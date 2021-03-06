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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;

@Guid("f5ea20e7-98db-4aeb-b0f8-03ac3e6d947c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOffsetCurve2D extends IfcCurve
{
	@Description("The curve that is being offset.")
	@DataMember(Order = 0)
	@Required()
	@Guid("99888d7b-4079-40f5-9de9-5f4048ee8964")
	@JacksonXmlProperty(isAttribute=false, localName = "BasisCurve")
	private IfcCurve basisCurve;

	@Description("The distance of the offset curve from the basis curve. distance may be positive, negative or zero. A positive value of distance defines an offset in the direction which is normal to the curve in the sense of an anti-clockwise rotation through 90 degrees from the tangent vector T at the given point. (This is in the direction of orthogonal complement(T).)")
	@DataMember(Order = 1)
	@Required()
	@Guid("4214b648-a464-4af2-ba65-3c2ac259bd4a")
	@JacksonXmlProperty(isAttribute=true, localName = "Distance")
	private double distance;

	@Description("An indication of whether the offset curve self-intersects; this is for information only.")
	@DataMember(Order = 2)
	@Required()
	@Guid("7b9a922b-dd34-4353-b3d4-a230b9dc5dcb")
	@JacksonXmlProperty(isAttribute=true, localName = "SelfIntersect")
	private Boolean selfIntersect;


	public IfcOffsetCurve2D()
	{
	}

	public IfcOffsetCurve2D(IfcCurve basisCurve, double distance, Boolean selfIntersect)
	{
		this.basisCurve = basisCurve;
		this.distance = distance;
		this.selfIntersect = selfIntersect;
	}

	public IfcCurve getBasisCurve() {
		return this.basisCurve;
	}

	public void setBasisCurve(IfcCurve basisCurve) {
		this.basisCurve = basisCurve;
	}

	public double getDistance() {
		return this.distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Boolean getSelfIntersect() {
		return this.selfIntersect;
	}

	public void setSelfIntersect(Boolean selfIntersect) {
		this.selfIntersect = selfIntersect;
	}


}

