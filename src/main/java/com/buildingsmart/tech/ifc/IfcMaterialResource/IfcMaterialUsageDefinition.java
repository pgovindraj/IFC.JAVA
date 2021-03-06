// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

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
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayerSetUsage;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSetUsage;

@Guid("c49fa2f9-55a1-4a45-9f3c-ca8a7106f785")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcMaterialLayerSetUsage.class, name = "IfcMaterialLayerSetUsage"), @JsonSubTypes.Type(value = IfcMaterialProfileSetUsage.class, name = "IfcMaterialProfileSetUsage")})
public abstract class IfcMaterialUsageDefinition implements IfcMaterialSelect
{
	@Description("Use of the <em>IfcMaterialUsageDefinition</em> subtypes within the material association of an element occurrence. The association is established by the <em>IfcRelAssociatesMaterial</em> relationship.")
	@InverseProperty(InverseProp = "RelatingMaterial", Range = "IfcRelAssociatesMaterial")
	@Guid("20912e32-b48d-4caa-9d16-c7b6f378f8a0")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssociatesMaterial")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "AssociatedTo")
	private Set<IfcRelAssociatesMaterial> associatedTo;


	public IfcMaterialUsageDefinition()
	{
	}

	public Set<IfcRelAssociatesMaterial> getAssociatedTo() {
		return this.associatedTo;
	}


}

