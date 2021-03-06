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
import com.buildingsmart.tech.ifc.IfcDateTimeResource.*;
import com.buildingsmart.tech.ifc.IfcProcessExtension.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcControl;

@Guid("d05923c3-37a8-444a-b811-bf0709bab84f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWorkCalendar extends com.buildingsmart.tech.ifc.IfcKernel.IfcControl
{
	@Description("Set of times periods that are regarded as an initial set-up      of working times. Exception times can then further restrict      these working times.")
	@DataMember(Order = 0)
	@Guid("f600c372-69d7-44f2-ad5a-450a9dd1e34a")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcWorkTime")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "WorkingTimes")
	private Set<IfcWorkTime> workingTimes;

	@Description("Set of times periods that define exceptions (non-working      times) for the given working times including the base      calendar, if provided.")
	@DataMember(Order = 1)
	@Guid("2a68f57c-be31-4ee2-acee-aa80e15467f6")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcWorkTime")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ExceptionTimes")
	private Set<IfcWorkTime> exceptionTimes;

	@Description("Identifies the predefined types of a work calendar from which       the type required may be set.      <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added</blockquote>")
	@DataMember(Order = 2)
	@Guid("4343392e-ed01-4af4-931f-7be994806a87")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcWorkCalendarTypeEnum predefinedType;


	public IfcWorkCalendar()
	{
	}

	public IfcWorkCalendar(String globalId)
	{
		super(globalId);
	}

	public Set<IfcWorkTime> getWorkingTimes() {
		return this.workingTimes;
	}

	public Set<IfcWorkTime> getExceptionTimes() {
		return this.exceptionTimes;
	}

	public IfcWorkCalendarTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcWorkCalendarTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

