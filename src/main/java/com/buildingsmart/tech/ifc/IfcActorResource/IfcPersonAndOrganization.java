// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcActorResource;

import java.util.List;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("52b0207c-cc6a-42c8-a632-c3d63a70b2a5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPersonAndOrganization implements IfcActorSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("The person who is related to the organization.")
	@DataMember(Order = 0)
	@Required()
	@Guid("02df37f6-0641-446d-a277-937e200b8a23")
	@JacksonXmlProperty(isAttribute=false, localName = "ThePerson")
	private IfcPerson thePerson;

	@Description("The organization to which the person is related.")
	@DataMember(Order = 1)
	@Required()
	@Guid("2d901b29-feea-479c-95e0-a3a68bbb5975")
	@JacksonXmlProperty(isAttribute=false, localName = "TheOrganization")
	private IfcOrganization theOrganization;

	@Description("Roles played by the person within the context of an organization.  These may differ from the roles in <em>ThePerson.Roles</em> which may be asserted without organizational context.")
	@DataMember(Order = 2)
	@Guid("56c46a00-0a80-42b4-977c-40d83aa30982")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcActorRole")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Roles")
	private List<IfcActorRole> roles;


	public IfcPersonAndOrganization()
	{
	}

	public IfcPersonAndOrganization(IfcPerson thePerson, IfcOrganization theOrganization)
	{
		this.thePerson = thePerson;
		this.theOrganization = theOrganization;
	}

	public IfcPerson getThePerson() {
		return this.thePerson;
	}

	public void setThePerson(IfcPerson thePerson) {
		this.thePerson = thePerson;
	}

	public IfcOrganization getTheOrganization() {
		return this.theOrganization;
	}

	public void setTheOrganization(IfcOrganization theOrganization) {
		this.theOrganization = theOrganization;
	}

	public List<IfcActorRole> getRoles() {
		return this.roles;
	}


}

