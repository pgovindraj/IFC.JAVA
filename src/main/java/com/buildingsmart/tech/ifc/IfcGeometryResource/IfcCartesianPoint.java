// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2ddee6ae-615d-41ff-baa2-ba51d50e78c2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCartesianPoint extends IfcPoint implements IfcTrimmingSelect
{
	@Description("The first, second, and third coordinate of the point location. If placed in a two or three dimensional rectangular Cartesian coordinate system, Coordinates[1] is the X coordinate, Coordinates[2] is the Y coordinate, and Coordinates[3] is the Z coordinate.")
	@DataMember(Order = 0)
	@Required()
	@Guid("4a8b21fa-0aa6-4d2a-b0ce-55d5777e3b0f")
	@MinLength(1)
	@MaxLength(3)
	@JacksonXmlProperty(isAttribute = false, localName = "Double")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Coordinates")
	private List<Double> coordinates;


	public IfcCartesianPoint()
	{
	}

	public IfcCartesianPoint(Double[] coordinates)
	{
		this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
	}

	public List<Double> getCoordinates() {
		return this.coordinates;
	}

	public int getDim() {
		return 0;
	}


}

