// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedMgmtElements;

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
import com.buildingsmart.tech.ifc.IfcSharedMgmtElements.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcControl;

@Guid("893d5903-b4b9-47a6-b246-30c5ec310142")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProjectOrder extends com.buildingsmart.tech.ifc.IfcKernel.IfcControl
{
	@Description("Predefined generic type for a project order that is specified in an enumeration. There may be a property set given specificly for the predefined types.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been made optional.</blockquote>")
	@DataMember(Order = 0)
	@Guid("6ceee77b-7d56-4a99-a3c8-e0c2298be9ce")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcProjectOrderTypeEnum predefinedType;

	@Description("The current status of a project order.Examples of status values that might be used for a project order status include:  <ul>  <li>PLANNED</li>  <li>REQUESTED</li>  <li>APPROVED</li>  <li>ISSUED</li>  <li>STARTED</li>  <li>DELAYED</li>  <li>DONE</li>  </ul>")
	@DataMember(Order = 1)
	@Guid("f98e043a-2c58-46e0-b878-56b709b5bab9")
	@JacksonXmlProperty(isAttribute=true, localName = "Status")
	private String status;

	@Description("A detailed description of the project order describing the work to be completed.")
	@DataMember(Order = 2)
	@Guid("f531fcc3-faf7-4b0e-8ee9-41c2e6ab71f6")
	@JacksonXmlProperty(isAttribute=true, localName = "LongDescription")
	private String longDescription;


	public IfcProjectOrder()
	{
	}

	public IfcProjectOrder(String globalId)
	{
		super(globalId);
	}

	public IfcProjectOrderTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProjectOrderTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}


}

