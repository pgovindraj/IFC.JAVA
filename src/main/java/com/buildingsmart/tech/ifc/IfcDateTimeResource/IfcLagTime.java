// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

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
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcSchedulingTime;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTimeOrRatioSelect;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskDurationEnum;

@Guid("ebde4676-fd2c-4f52-8985-79f623317d88")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLagTime extends IfcSchedulingTime
{
	@Description("Value of the time lag selected as being either a ratio or a      time measure.")
	@DataMember(Order = 0)
	@Required()
	@Guid("2887dc71-f136-4c8b-9da9-5b34af397d8d")
	@JacksonXmlProperty(isAttribute=true, localName = "LagValue")
	private IfcTimeOrRatioSelect lagValue;

	@Description("The allowed types of task duration that specify the lag time      measurement (work time or elapsed time).")
	@DataMember(Order = 1)
	@Required()
	@Guid("9a00390a-a0d3-4bba-9267-7512fae616c3")
	@JacksonXmlProperty(isAttribute=true, localName = "DurationType")
	private IfcTaskDurationEnum durationType;


	public IfcLagTime()
	{
	}

	public IfcLagTime(IfcTimeOrRatioSelect lagValue, IfcTaskDurationEnum durationType)
	{
		this.lagValue = lagValue;
		this.durationType = durationType;
	}

	public IfcTimeOrRatioSelect getLagValue() {
		return this.lagValue;
	}

	public void setLagValue(IfcTimeOrRatioSelect lagValue) {
		this.lagValue = lagValue;
	}

	public IfcTaskDurationEnum getDurationType() {
		return this.durationType;
	}

	public void setDurationType(IfcTaskDurationEnum durationType) {
		this.durationType = durationType;
	}


}

