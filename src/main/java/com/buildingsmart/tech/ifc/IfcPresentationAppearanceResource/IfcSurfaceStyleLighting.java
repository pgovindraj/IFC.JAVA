// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

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
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb;

@Guid("5c51bae3-8ace-443a-9e9b-d416bb389d95")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceStyleLighting extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcSurfaceStyleElementSelect
{
	@Description("The degree of diffusion of the transmitted light. In the case of completely transparent materials there is no diffusion. The greater the diffusing power, the smaller the direct component of the transmitted light, up to the point where only diffuse light is produced. A value of 1 means totally diffuse for that colour part of the light.  <blockquote class=\"note\">NOTE&nbsp; The factor can be measured physically and has three ratios for the red, green and blue part of the light.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("ef4c74ec-f03f-4567-a490-c9c5a67e7c49")
	@JacksonXmlProperty(isAttribute=false, localName = "DiffuseTransmissionColour")
	private IfcColourRgb diffuseTransmissionColour;

	@Description("The degree of diffusion of the reflected light. In the case of specular surfaces there is no diffusion. The greater the diffusing power of the reflecting surface, the smaller the specular component of the reflected light, up to the point where only diffuse light is produced. A value of 1 means totally diffuse for that colour part of the light.   <blockquote class=\"note\">NOTE&nbsp; The factor can be measured physically and has three ratios for the red, green and blue part of the light.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("0379917f-0cc5-464f-800d-f7bb8344e052")
	@JacksonXmlProperty(isAttribute=false, localName = "DiffuseReflectionColour")
	private IfcColourRgb diffuseReflectionColour;

	@Description("Describes how the light falling on a body is totally or partially transmitted.   <blockquote class=\"note\">The factor can be measured physically and has three ratios for the red, green and blue part of the light.</blockquote>")
	@DataMember(Order = 2)
	@Required()
	@Guid("d7953e7b-4523-44fa-b6ec-ed820e7701df")
	@JacksonXmlProperty(isAttribute=false, localName = "TransmissionColour")
	private IfcColourRgb transmissionColour;

	@Description("A coefficient that determines the extent that the light falling onto a surface is fully or partially reflected.   <blockquote class=\"note\">NOTE&nbsp; The factor can be measured physically and has three ratios for the red, green and blue part of the light.</blockquote>")
	@DataMember(Order = 3)
	@Required()
	@Guid("9727ff89-6fb4-4540-a342-02dc3cbc547c")
	@JacksonXmlProperty(isAttribute=false, localName = "ReflectanceColour")
	private IfcColourRgb reflectanceColour;


	public IfcSurfaceStyleLighting()
	{
	}

	public IfcSurfaceStyleLighting(IfcColourRgb diffuseTransmissionColour, IfcColourRgb diffuseReflectionColour, IfcColourRgb transmissionColour, IfcColourRgb reflectanceColour)
	{
		this.diffuseTransmissionColour = diffuseTransmissionColour;
		this.diffuseReflectionColour = diffuseReflectionColour;
		this.transmissionColour = transmissionColour;
		this.reflectanceColour = reflectanceColour;
	}

	public IfcColourRgb getDiffuseTransmissionColour() {
		return this.diffuseTransmissionColour;
	}

	public void setDiffuseTransmissionColour(IfcColourRgb diffuseTransmissionColour) {
		this.diffuseTransmissionColour = diffuseTransmissionColour;
	}

	public IfcColourRgb getDiffuseReflectionColour() {
		return this.diffuseReflectionColour;
	}

	public void setDiffuseReflectionColour(IfcColourRgb diffuseReflectionColour) {
		this.diffuseReflectionColour = diffuseReflectionColour;
	}

	public IfcColourRgb getTransmissionColour() {
		return this.transmissionColour;
	}

	public void setTransmissionColour(IfcColourRgb transmissionColour) {
		this.transmissionColour = transmissionColour;
	}

	public IfcColourRgb getReflectanceColour() {
		return this.reflectanceColour;
	}

	public void setReflectanceColour(IfcColourRgb reflectanceColour) {
		this.reflectanceColour = reflectanceColour;
	}


}

