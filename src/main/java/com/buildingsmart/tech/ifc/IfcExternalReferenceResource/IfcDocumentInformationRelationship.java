// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("79f322fe-2390-4be9-ac5e-2c79ccbfc1d5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDocumentInformationRelationship extends IfcResourceLevelRelationship
{
	@Description("The document that acts as the parent, referencing or original document in a relationship.")
	@DataMember(Order = 0)
	@Required()
	@Guid("aa89e7a7-4654-4e52-af82-fda6e179130a")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingDocument")
	private IfcDocumentInformation relatingDocument;

	@Description("The document that acts as the child, referenced or replacing document in a relationship.")
	@DataMember(Order = 1)
	@Required()
	@Guid("785f2826-b24e-4a4e-ba65-203c8c439d34")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcDocumentInformation")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RelatedDocuments")
	private Set<IfcDocumentInformation> relatedDocuments;

	@Description("Describes the type of relationship between documents. This could be sub-document, replacement etc. The interpretation has to be established in an application context.")
	@DataMember(Order = 2)
	@Guid("b23740b1-d36a-4d3d-88df-c8e7e0d1efbf")
	@JacksonXmlProperty(isAttribute=true, localName = "RelationshipType")
	private String relationshipType;


	public IfcDocumentInformationRelationship()
	{
	}

	public IfcDocumentInformationRelationship(IfcDocumentInformation relatingDocument, IfcDocumentInformation[] relatedDocuments)
	{
		this.relatingDocument = relatingDocument;
		this.relatedDocuments = new HashSet<>(Arrays.asList(relatedDocuments));
	}

	public IfcDocumentInformation getRelatingDocument() {
		return this.relatingDocument;
	}

	public void setRelatingDocument(IfcDocumentInformation relatingDocument) {
		this.relatingDocument = relatingDocument;
	}

	public Set<IfcDocumentInformation> getRelatedDocuments() {
		return this.relatedDocuments;
	}

	public String getRelationshipType() {
		return this.relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}


}

