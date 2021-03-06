// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

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
import com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcPresentationLayerWithStyle;
import com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLayeredItem;

@Guid("1021fba4-3bfe-4e0a-b0b5-662a3498c052")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcPresentationLayerWithStyle.class, name = "IfcPresentationLayerWithStyle"))
public class IfcPresentationLayerAssignment
{
	@Description("Name of the layer.")
	@DataMember(Order = 0)
	@Required()
	@Guid("87af29d2-be1e-4b15-b9ad-c509d2b4f7fa")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("Additional description of the layer.")
	@DataMember(Order = 1)
	@Guid("8a982d79-1717-4d47-928c-6f0d31346142")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("The set of layered items, which are assigned to this layer.")
	@DataMember(Order = 2)
	@Required()
	@Guid("e05d7922-970e-4100-b3e7-bd5a77d73c09")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcLayeredItem")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "AssignedItems")
	private Set<IfcLayeredItem> assignedItems;

	@Description("An (internal) identifier assigned to the layer.")
	@DataMember(Order = 3)
	@Guid("c3bbf33f-c067-4501-bfe8-2c9da90c9b22")
	@JacksonXmlProperty(isAttribute=true, localName = "Identifier")
	private String identifier;


	public IfcPresentationLayerAssignment()
	{
	}

	public IfcPresentationLayerAssignment(String name, IfcLayeredItem[] assignedItems)
	{
		this.name = name;
		this.assignedItems = new HashSet<>(Arrays.asList(assignedItems));
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<IfcLayeredItem> getAssignedItems() {
		return this.assignedItems;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}


}

