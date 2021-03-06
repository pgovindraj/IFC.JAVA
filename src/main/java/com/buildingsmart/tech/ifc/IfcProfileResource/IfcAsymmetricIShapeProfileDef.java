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
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a97ad274-6a1b-4db7-b4a9-46725be04471")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAsymmetricIShapeProfileDef extends IfcParameterizedProfileDef
{
	@Description("Extent of the bottom flange, defined parallel to the x axis of the position coordinate system.")
	@DataMember(Order = 0)
	@Required()
	@Guid("39940baf-a873-43ec-9cc3-b7e2398aa04c")
	@JacksonXmlProperty(isAttribute=false, localName = "BottomFlangeWidth")
	private double bottomFlangeWidth; //IfcPositiveLengthMeasure

	@Description("Total extent of the depth, defined parallel to the y axis of the position coordinate system.")
	@DataMember(Order = 1)
	@Required()
	@Guid("b7d473cd-17c8-4879-9f2c-f1ee6a62c153")
	@JacksonXmlProperty(isAttribute=false, localName = "OverallDepth")
	private double overallDepth; //IfcPositiveLengthMeasure

	@Description("Thickness of the web of the I-shape. The web is centred on the x-axis and the y-axis of the position coordinate system.")
	@DataMember(Order = 2)
	@Required()
	@Guid("0242c06a-0329-4364-a496-285cbe77d83f")
	@JacksonXmlProperty(isAttribute=false, localName = "WebThickness")
	private double webThickness; //IfcPositiveLengthMeasure

	@Description("Flange thickness of the bottom flange.")
	@DataMember(Order = 3)
	@Required()
	@Guid("7d3c1e36-4f3a-43a2-8e07-a5de53359a2c")
	@JacksonXmlProperty(isAttribute=false, localName = "BottomFlangeThickness")
	private double bottomFlangeThickness; //IfcPositiveLengthMeasure

	@Description("The fillet between the web and the bottom flange.  0 if sharp-edged, omitted if unknown.")
	@DataMember(Order = 4)
	@Guid("65f2415f-cc1a-40ca-b017-080cbf0a9777")
	@JacksonXmlProperty(isAttribute=false, localName = "BottomFlangeFilletRadius")
	private double bottomFlangeFilletRadius; //IfcNonNegativeLengthMeasure

	@Description("Extent of the top flange, defined parallel to the x axis of the position coordinate system.")
	@DataMember(Order = 5)
	@Required()
	@Guid("f33b2498-9ce9-410d-be0c-52b58ab7d57a")
	@JacksonXmlProperty(isAttribute=false, localName = "TopFlangeWidth")
	private double topFlangeWidth; //IfcPositiveLengthMeasure

	@Description("Flange thickness of the top flange. This attribute is formally optional for historic reasons only. Whenever the flange thickness is known, it shall be provided by value.")
	@DataMember(Order = 6)
	@Guid("3390a6a3-6070-47d2-a75f-2d359b3c6ea5")
	@JacksonXmlProperty(isAttribute=false, localName = "TopFlangeThickness")
	private double topFlangeThickness; //IfcPositiveLengthMeasure

	@Description("The fillet between the web and the top flange.  0 if sharp-edged, omitted if unknown.")
	@DataMember(Order = 7)
	@Guid("084b5c7a-a7ff-4a3e-aedf-11d993da5b5d")
	@JacksonXmlProperty(isAttribute=false, localName = "TopFlangeFilletRadius")
	private double topFlangeFilletRadius; //IfcNonNegativeLengthMeasure

	@Description("Radius of the upper edges of the bottom flange.  0 if sharp-edged, omitted if unknown.")
	@DataMember(Order = 8)
	@Guid("8a9baaa0-a040-4a21-8a63-d9c19b1f1b79")
	@JacksonXmlProperty(isAttribute=false, localName = "BottomFlangeEdgeRadius")
	private double bottomFlangeEdgeRadius; //IfcNonNegativeLengthMeasure

	@Description("Slope of the upper faces of the bottom flange.  Non-zero in case of of tapered bottom flange, 0 in case of parallel bottom flange, omitted if unknown.")
	@DataMember(Order = 9)
	@Guid("921600ed-fb99-48dd-a978-52712fa5b418")
	@JacksonXmlProperty(isAttribute=true, localName = "BottomFlangeSlope")
	private double bottomFlangeSlope;

	@Description("Radius of the lower edges of the top flange.  0 if sharp-edged, omitted if unknown.")
	@DataMember(Order = 10)
	@Guid("15799c29-5d34-492e-8919-fe0f0f0159c6")
	@JacksonXmlProperty(isAttribute=false, localName = "TopFlangeEdgeRadius")
	private double topFlangeEdgeRadius; //IfcNonNegativeLengthMeasure

	@Description("Slope of the lower faces of the top flange.  Non-zero in case of of tapered top flange, 0 in case of parallel top flange, omitted if unknown.")
	@DataMember(Order = 11)
	@Guid("655eed3b-029f-4cc3-be85-4ded814194bb")
	@JacksonXmlProperty(isAttribute=true, localName = "TopFlangeSlope")
	private double topFlangeSlope;


	public IfcAsymmetricIShapeProfileDef()
	{
	}

	public IfcAsymmetricIShapeProfileDef(IfcProfileTypeEnum profileType, double bottomFlangeWidth, double overallDepth, double webThickness, double bottomFlangeThickness, double topFlangeWidth)
	{
		super(profileType);
		this.bottomFlangeWidth = bottomFlangeWidth;
		this.overallDepth = overallDepth;
		this.webThickness = webThickness;
		this.bottomFlangeThickness = bottomFlangeThickness;
		this.topFlangeWidth = topFlangeWidth;
	}

	public double getBottomFlangeWidth() {
		return this.bottomFlangeWidth;
	}

	public void setBottomFlangeWidth(double bottomFlangeWidth) {
		this.bottomFlangeWidth = bottomFlangeWidth;
	}

	public double getOverallDepth() {
		return this.overallDepth;
	}

	public void setOverallDepth(double overallDepth) {
		this.overallDepth = overallDepth;
	}

	public double getWebThickness() {
		return this.webThickness;
	}

	public void setWebThickness(double webThickness) {
		this.webThickness = webThickness;
	}

	public double getBottomFlangeThickness() {
		return this.bottomFlangeThickness;
	}

	public void setBottomFlangeThickness(double bottomFlangeThickness) {
		this.bottomFlangeThickness = bottomFlangeThickness;
	}

	public double getBottomFlangeFilletRadius() {
		return this.bottomFlangeFilletRadius;
	}

	public void setBottomFlangeFilletRadius(double bottomFlangeFilletRadius) {
		this.bottomFlangeFilletRadius = bottomFlangeFilletRadius;
	}

	public double getTopFlangeWidth() {
		return this.topFlangeWidth;
	}

	public void setTopFlangeWidth(double topFlangeWidth) {
		this.topFlangeWidth = topFlangeWidth;
	}

	public double getTopFlangeThickness() {
		return this.topFlangeThickness;
	}

	public void setTopFlangeThickness(double topFlangeThickness) {
		this.topFlangeThickness = topFlangeThickness;
	}

	public double getTopFlangeFilletRadius() {
		return this.topFlangeFilletRadius;
	}

	public void setTopFlangeFilletRadius(double topFlangeFilletRadius) {
		this.topFlangeFilletRadius = topFlangeFilletRadius;
	}

	public double getBottomFlangeEdgeRadius() {
		return this.bottomFlangeEdgeRadius;
	}

	public void setBottomFlangeEdgeRadius(double bottomFlangeEdgeRadius) {
		this.bottomFlangeEdgeRadius = bottomFlangeEdgeRadius;
	}

	public double getBottomFlangeSlope() {
		return this.bottomFlangeSlope;
	}

	public void setBottomFlangeSlope(double bottomFlangeSlope) {
		this.bottomFlangeSlope = bottomFlangeSlope;
	}

	public double getTopFlangeEdgeRadius() {
		return this.topFlangeEdgeRadius;
	}

	public void setTopFlangeEdgeRadius(double topFlangeEdgeRadius) {
		this.topFlangeEdgeRadius = topFlangeEdgeRadius;
	}

	public double getTopFlangeSlope() {
		return this.topFlangeSlope;
	}

	public void setTopFlangeSlope(double topFlangeSlope) {
		this.topFlangeSlope = topFlangeSlope;
	}


}

