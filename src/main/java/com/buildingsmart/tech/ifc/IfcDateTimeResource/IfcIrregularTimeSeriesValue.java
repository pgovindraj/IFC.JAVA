// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d5d6da22-1509-418b-8dea-278c3dc7e2d8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIrregularTimeSeriesValue
{
	@Description("The specification of the time point.")
	@DataMember(Order = 0)
	@Required()
	@Guid("70b6fcf0-2c15-4753-ab4b-d93840eeffd5")
	@JacksonXmlProperty(isAttribute=true, localName = "TimeStamp")
	private String timeStamp;

	@Description("A list of time-series values. At least one value is required.")
	@DataMember(Order = 1)
	@Required()
	@Guid("5d205088-4f1b-4a4d-a27a-f36529a1c467")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ListValues")
	private List<IfcValue> listValues;


	public IfcIrregularTimeSeriesValue()
	{
	}

	public IfcIrregularTimeSeriesValue(String timeStamp, IfcValue[] listValues)
	{
		this.timeStamp = timeStamp;
		this.listValues = new ArrayList<>(Arrays.asList(listValues));
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public List<IfcValue> getListValues() {
		return this.listValues;
	}


}

