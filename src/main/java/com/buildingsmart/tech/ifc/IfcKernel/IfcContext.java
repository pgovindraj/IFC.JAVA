// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2ef4dae0-8e0d-4c3e-a179-bf7d2f279492")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes( @JsonSubTypes.Type(value = com.buildingsmart.tech.ifc.IfcKernel.IfcProject.class, name = "IfcProject"))
public abstract class IfcContext extends IfcObjectDefinition
{
	@JacksonXmlProperty(isAttribute=true, localName = "ObjectType")
	@Description("The object type denotes a particular type that indicates the object further. The use has to be established at the level of instantiable subtypes.   <blockquote class=\"note\">  NOTE&nbsp; Subtypes of <em>IfcContext</em> do not introduce a <em>PredefinedType</em> attribute, therefore the usage of <em>ObjectType</em> is not bound to the selection of USERDEFINED within the <em>PredefinedType</em> enumaration.  </blockquote>")
	@Guid("bb969c4a-579c-4aa1-be1f-9fb4bd873fad")
	private String objectType;

	@JacksonXmlProperty(isAttribute=true, localName = "LongName")
	@Description("Long name for the context as used for reference purposes.")
	@Guid("14b49397-1ce3-4799-8ead-ec46f5364256")
	private String longName;

	@JacksonXmlProperty(isAttribute=true, localName = "Phase")
	@Description("Current project phase, or life-cycle phase of this project. Applicable values have to be agreed upon by view definitions or implementer agreements.")
	@Guid("2f21a5c2-8ff3-40c7-9331-101a0cca4c61")
	private String phase;

	@Description("Context of the representations used within the context. When the context is a project and it includes shape representations for its components, one or several geometric representation contexts need to be included that define e.g. the world coordinate system, the coordinate space dimensions, and/or the precision factor.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to be optional. Change made with upward compatibility for file based exchange.</blockquote>")
	@MinLength(1)
	@Guid("e9ef241b-a738-4ab4-b2cd-7041784d5749")
	private Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext> representationContexts = new HashSet<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext>();

	@JacksonXmlProperty(isAttribute=false, localName = "UnitsInContext")
	@Description("Units globally assigned to measure types used within the context.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to be optional. Change made with upward compatibility for file based exchange.</blockquote>")
	@Guid("59787a75-222f-48ec-a8d6-73733cf7c004")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitAssignment unitsInContext;

	@JacksonXmlProperty(isAttribute=false, localName = "IsDefinedBy")
	@Description("Set of relationships to property set definitions attached to this context. Those statically or dynamically defined properties contain alphanumeric information content that further defines the context.   <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; The data type has been changed from <em>IfcRelDefines</em> to <em>IfcRelDefinesByProperties</em> with upward compatibility for file based exchange.  </blockquote>")
	@Guid("7e8b25d6-0e9c-4e04-bc16-e08eea08f8ec")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByProperties> isDefinedBy = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByProperties>();

	@JacksonXmlProperty(isAttribute=false, localName = "Declares")
	@Description("Reference to the <em>IfcRelDeclares</em> relationship that assigns the uppermost entities of includes hierarchies to this context instance.  <blockquote class=\"note\">NOTE&nbsp; The spatial hiearchy is assigned to <em>IfcProject</em> using the <em>IfcRelAggregates</em> relationship. This is a single exception due to compatibility reasons with earlier releases.</blockquote>")
	@Guid("cd34747d-186f-4fe1-9267-19625144c9e6")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDeclares> declares = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDeclares>();


	public IfcContext()
	{
	}

	public IfcContext(String globalId)
	{
		super(globalId);
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getPhase() {
		return this.phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public Set<com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext> getRepresentationContexts() {
		return this.representationContexts;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitAssignment getUnitsInContext() {
		return this.unitsInContext;
	}

	public void setUnitsInContext(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitAssignment unitsInContext) {
		this.unitsInContext = unitsInContext;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByProperties> getIsDefinedBy() {
		return this.isDefinedBy;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDeclares> getDeclares() {
		return this.declares;
	}


}
