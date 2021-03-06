// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcHalfSpaceSolid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve;

@Guid("65e9d30b-d646-47b9-a5b5-e3d5e4d6323c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPolygonalBoundedHalfSpace extends IfcHalfSpaceSolid
{
	@Description("<p>Definition of the position coordinate system for the bounding polyline <STRIKE>and the base surface</STRIKE>.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("512ffcfa-0a74-4a77-a54d-02c512a55ac9")
	@JacksonXmlProperty(isAttribute=false, localName = "Position")
	private IfcAxis2Placement3D position;

	@Description("Two-dimensional <strike>polyline</strike> bounded curve, defined in the xy plane of the position coordinate system.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The attribute type has been changed from <em>IfcPolyline</em> to its supertype <em>IfcBoundedCurve</em> with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("4e5eaaf9-5a26-4560-a6b2-29a59c914215")
	@JacksonXmlProperty(isAttribute=false, localName = "PolygonalBoundary")
	private IfcBoundedCurve polygonalBoundary;


	public IfcPolygonalBoundedHalfSpace()
	{
	}

	public IfcPolygonalBoundedHalfSpace(IfcSurface baseSurface, Boolean agreementFlag, IfcAxis2Placement3D position, IfcBoundedCurve polygonalBoundary)
	{
		super(baseSurface, agreementFlag);
		this.position = position;
		this.polygonalBoundary = polygonalBoundary;
	}

	public IfcAxis2Placement3D getPosition() {
		return this.position;
	}

	public void setPosition(IfcAxis2Placement3D position) {
		this.position = position;
	}

	public IfcBoundedCurve getPolygonalBoundary() {
		return this.polygonalBoundary;
	}

	public void setPolygonalBoundary(IfcBoundedCurve polygonalBoundary) {
		this.polygonalBoundary = polygonalBoundary;
	}


}

