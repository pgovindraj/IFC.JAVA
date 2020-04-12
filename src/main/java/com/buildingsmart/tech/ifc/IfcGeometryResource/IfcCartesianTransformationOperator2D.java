// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.List;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("8151008e-da2b-4181-80dc-d2cdf2bc502f")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcCartesianTransformationOperator2DnonUniform.class, name = "IfcCartesianTransformationOperator2DnonUniform"))
public class IfcCartesianTransformationOperator2D extends IfcCartesianTransformationOperator
{

	public IfcCartesianTransformationOperator2D()
	{
	}

	public IfcCartesianTransformationOperator2D(IfcCartesianPoint localOrigin)
	{
		super(localOrigin);
	}

	public List<IfcDirection> getU() {
		return null;
	}


}

