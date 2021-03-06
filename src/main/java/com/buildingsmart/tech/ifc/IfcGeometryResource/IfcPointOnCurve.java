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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPoint;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;

@Guid("48ccc19b-d9f1-4207-af14-8d7c8eafab3b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPointOnCurve extends IfcPoint
{
	@Description("The curve to which point parameter relates.")
	@DataMember(Order = 0)
	@Required()
	@Guid("23610d14-c492-4d05-b307-e083998c52f8")
	@JacksonXmlProperty(isAttribute=false, localName = "BasisCurve")
	private IfcCurve basisCurve;

	@Description("The parameter value of the point location.")
	@DataMember(Order = 1)
	@Required()
	@Guid("5ee320ad-16c4-44d7-a272-c4c6f7d2deb2")
	@JacksonXmlProperty(isAttribute=true, localName = "PointParameter")
	private double pointParameter;


	public IfcPointOnCurve()
	{
	}

	public IfcPointOnCurve(IfcCurve basisCurve, double pointParameter)
	{
		this.basisCurve = basisCurve;
		this.pointParameter = pointParameter;
	}

	public IfcCurve getBasisCurve() {
		return this.basisCurve;
	}

	public void setBasisCurve(IfcCurve basisCurve) {
		this.basisCurve = basisCurve;
	}

	public double getPointParameter() {
		return this.pointParameter;
	}

	public void setPointParameter(double pointParameter) {
		this.pointParameter = pointParameter;
	}

	public int getDim() {
		return 0;
	}


}

