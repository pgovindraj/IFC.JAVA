// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0f127537-4dfb-420f-bcea-6637237ef8e4")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcCircleHollowProfileDef.class, name = "IfcCircleHollowProfileDef"))
public class IfcCircleProfileDef extends IfcParameterizedProfileDef
{
	@Description("The radius of the circle.")
	@DataMember(Order = 0)
	@Required()
	@Guid("e32b7f94-4b79-4078-93cc-014e7f4dcc2f")
	@JacksonXmlProperty(isAttribute=false, localName = "Radius")
	private double radius; //IfcPositiveLengthMeasure


	public IfcCircleProfileDef()
	{
	}

	public IfcCircleProfileDef(IfcProfileTypeEnum profileType, double radius)
	{
		super(profileType);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


}

