// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

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
import com.buildingsmart.tech.ifc.IfcProcessExtension.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProcess;
import com.buildingsmart.tech.ifc.IfcProcessExtension.IfcProcedureTypeEnum;

@Guid("a91157ae-e871-49c4-bbff-a0b9224d6a3a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProcedureType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProcess
{
	@Description("Identifies the predefined types of a procedure from which       the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("d373b84f-93fb-46fc-be52-d46907ae3f8b")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcProcedureTypeEnum predefinedType;


	public IfcProcedureType()
	{
	}

	public IfcProcedureType(String globalId, IfcProcedureTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcProcedureTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcProcedureTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

