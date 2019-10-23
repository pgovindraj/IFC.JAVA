// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("db89d737-4bde-4aef-bb04-156d8b2c8097")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelServicesBuildings extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingSystem")
	@Description("System that services the Buildings.")
	@Required()
	@Guid("ef4ac800-94ab-4c07-9262-b7e44d13f6a3")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem relatingSystem;

	@Description("Spatial structure elements (including site, building, storeys) that are serviced by the system.  <blockquote class=\"change-ifc2x\">    IFC2x CHANGE&nbsp; The data type has been changed from <em>IfcBuilding</em> to <em>IfcSpatialStructureElement</em> with upward compatibility for file based exchange.  </blockquote>  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; The data type has been changed from <em>IfcSpatialStructureElement</em> to <em>IfcSpatialElement</em> with upward compatibility for file based exchange.  </blockquote>")
	@Required()
	@MinLength(1)
	@Guid("9e2d6247-93c2-4b4c-87e7-0a35aec4c0e1")
	private Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElement> relatedBuildings = new HashSet<com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElement>();


	public IfcRelServicesBuildings()
	{
	}

	public IfcRelServicesBuildings(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem relatingSystem, com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElement[] relatedBuildings)
	{
		super(globalId);
		this.relatingSystem = relatingSystem;
		this.relatedBuildings = new HashSet<>(Arrays.asList(relatedBuildings));
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem getRelatingSystem() {
		return this.relatingSystem;
	}

	public void setRelatingSystem(com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem relatingSystem) {
		this.relatingSystem = relatingSystem;
	}

	public Set<com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElement> getRelatedBuildings() {
		return this.relatedBuildings;
	}


}
