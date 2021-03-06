// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcPort;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcDistributionElement;

@Guid("ade898d9-502a-402f-b2b5-25e8a097c9e9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelConnectsPortToElement extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Reference to an Port that is connected by the objectified relationship.")
	@DataMember(Order = 0)
	@Required()
	@Guid("222980d1-b080-42e0-b7b3-eb3b93435142")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingPort")
	private IfcPort relatingPort;

	@Description("Reference to an <em>IfcDistributionElement</em> that has ports assigned.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Data type restricted to <em>IfcDistributionElement</em>.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("9169b986-1fba-4dbd-b53a-9d8e770368f5")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatedElement")
	private IfcDistributionElement relatedElement;


	public IfcRelConnectsPortToElement()
	{
	}

	public IfcRelConnectsPortToElement(String globalId, IfcPort relatingPort, IfcDistributionElement relatedElement)
	{
		super(globalId);
		this.relatingPort = relatingPort;
		this.relatedElement = relatedElement;
	}

	public IfcPort getRelatingPort() {
		return this.relatingPort;
	}

	public void setRelatingPort(IfcPort relatingPort) {
		this.relatingPort = relatingPort;
	}

	public IfcDistributionElement getRelatedElement() {
		return this.relatedElement;
	}

	public void setRelatedElement(IfcDistributionElement relatedElement) {
		this.relatedElement = relatedElement;
	}


}

