// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b0708265-0f85-4d96-a7f6-caf74b3bb754")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundingBox extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem
{
	@Description("Location of the bottom left corner (having the minimum values).")
	@DataMember(Order = 0)
	@Required()
	@Guid("2cf15f87-1f5d-450a-8cc2-6561dde29597")
	@JacksonXmlProperty(isAttribute=false, localName = "Corner")
	private IfcCartesianPoint corner;

	@Description("Length attribute (measured along the edge parallel to the X Axis)")
	@DataMember(Order = 1)
	@Required()
	@Guid("ac286f3a-4c71-42ad-bca4-e89e98d10b7e")
	@JacksonXmlProperty(isAttribute=false, localName = "XDim")
	private double xDim; //IfcPositiveLengthMeasure

	@Description("Width attribute (measured along the edge parallel to the Y Axis)")
	@DataMember(Order = 2)
	@Required()
	@Guid("941f838c-8426-4b28-a96a-ea74f02966e4")
	@JacksonXmlProperty(isAttribute=false, localName = "YDim")
	private double yDim; //IfcPositiveLengthMeasure

	@Description("Height attribute (measured along the edge parallel to the Z Axis).")
	@DataMember(Order = 3)
	@Required()
	@Guid("2a330725-d6a9-4a8d-b1db-a105d8b900d5")
	@JacksonXmlProperty(isAttribute=false, localName = "ZDim")
	private double zDim; //IfcPositiveLengthMeasure


	public IfcBoundingBox()
	{
	}

	public IfcBoundingBox(IfcCartesianPoint corner, double xDim, double yDim, double zDim)
	{
		this.corner = corner;
		this.xDim = xDim;
		this.yDim = yDim;
		this.zDim = zDim;
	}

	public IfcCartesianPoint getCorner() {
		return this.corner;
	}

	public void setCorner(IfcCartesianPoint corner) {
		this.corner = corner;
	}

	public double getXDim() {
		return this.xDim;
	}

	public void setXDim(double xDim) {
		this.xDim = xDim;
	}

	public double getYDim() {
		return this.yDim;
	}

	public void setYDim(double yDim) {
		this.yDim = yDim;
	}

	public double getZDim() {
		return this.zDim;
	}

	public void setZDim(double zDim) {
		this.zDim = zDim;
	}

	public int getDim() {
		return 0;
	}


}

