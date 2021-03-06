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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSweptAreaSolid;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;

@Guid("3c76b659-a30a-44af-a964-3f20d2e22949")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceCurveSweptAreaSolid extends IfcSweptAreaSolid
{
	@Description("The curve used to define the sweeping operation. The solid is generated by sweeping the <em>SELF\\IfcSweptAreaSolid.SweptArea</em> along the <em>Directrix</em>.")
	@DataMember(Order = 0)
	@Required()
	@Guid("49b50318-7752-47d8-95a2-b909aa00bad8")
	@JacksonXmlProperty(isAttribute=false, localName = "Directrix")
	private IfcCurve directrix;

	@Description("The parameter value on the <em>Directrix</em> at which the sweeping operation commences. If no value is provided the start of the sweeping operation is at the start of the <em>Directrix</em>.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to OPTIONAL with upward compatibility for file-based exchange.</blockquote>")
	@DataMember(Order = 1)
	@Guid("3b7320f4-3ba7-4832-acde-ad54018261d6")
	@JacksonXmlProperty(isAttribute=true, localName = "StartParam")
	private double startParam;

	@Description("The parameter value on the <em>Directrix</em> at which the sweeping operation ends. If no value is provided the end of the sweeping operation is at the end of the <em>Directrix</em>.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to OPTIONAL with upward compatibility for file-based exchange.</blockquote>")
	@DataMember(Order = 2)
	@Guid("07f28201-d83f-4d2b-9102-dba02a68c213")
	@JacksonXmlProperty(isAttribute=true, localName = "EndParam")
	private double endParam;

	@Description("The surface containing the <em>Directrix</em>.")
	@DataMember(Order = 3)
	@Required()
	@Guid("89366c6f-97ce-4ee1-8b33-eeda99031116")
	@JacksonXmlProperty(isAttribute=false, localName = "ReferenceSurface")
	private IfcSurface referenceSurface;


	public IfcSurfaceCurveSweptAreaSolid()
	{
	}

	public IfcSurfaceCurveSweptAreaSolid(IfcProfileDef sweptArea, IfcCurve directrix, IfcSurface referenceSurface)
	{
		super(sweptArea);
		this.directrix = directrix;
		this.referenceSurface = referenceSurface;
	}

	public IfcCurve getDirectrix() {
		return this.directrix;
	}

	public void setDirectrix(IfcCurve directrix) {
		this.directrix = directrix;
	}

	public double getStartParam() {
		return this.startParam;
	}

	public void setStartParam(double startParam) {
		this.startParam = startParam;
	}

	public double getEndParam() {
		return this.endParam;
	}

	public void setEndParam(double endParam) {
		this.endParam = endParam;
	}

	public IfcSurface getReferenceSurface() {
		return this.referenceSurface;
	}

	public void setReferenceSurface(IfcSurface referenceSurface) {
		this.referenceSurface = referenceSurface;
	}


}

