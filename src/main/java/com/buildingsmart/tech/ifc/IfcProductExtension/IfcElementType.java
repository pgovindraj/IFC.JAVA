// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("08323994-8b0a-4268-8051-2fe6ad76a2b9")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcElementType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProduct
{
	@JacksonXmlProperty(isAttribute=true, localName = "ElementType")
	@Description("The type denotes a particular type that indicates the object further. The use has to be established at the level of instantiable subtypes. In particular it holds the user defined type, if the enumeration of the attribute 'PredefinedType' is set to USERDEFINED.")
	@Guid("c885a317-562b-4996-824d-45153b4fd48d")
	private String elementType;


	public IfcElementType()
	{
	}

	public IfcElementType(String globalId)
	{
		super(globalId);
	}

	public String getElementType() {
		return this.elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}


}
