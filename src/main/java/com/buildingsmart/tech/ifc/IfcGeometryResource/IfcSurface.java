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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedSurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcElementarySurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSweptSurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;

@Guid("831d6ea9-533c-4e2e-89ce-3769c22c7190")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBoundedSurface.class, name = "IfcBoundedSurface"), @JsonSubTypes.Type(value = IfcElementarySurface.class, name = "IfcElementarySurface"), @JsonSubTypes.Type(value = IfcSweptSurface.class, name = "IfcSweptSurface")})
public abstract class IfcSurface extends IfcGeometricRepresentationItem implements com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcGeometricSetSelect, com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcSurfaceOrFaceSurface
{

	public IfcSurface()
	{
	}

	public int getDim() {
		return 0;
	}


}

