package com.loc8.timekeeper.core.jpa.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class TimeSheetEntry extends AbstractEntity
{

	private String name;
	
	private Timestamp startDate;
	
	private Timestamp endDate;

	@ManyToOne @PrimaryKeyJoinColumn 
	private TimeSheetEntryType timeSheetEntryType;

	@ManyToOne private TimeSheet timesheet;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Timestamp getStartDate()
	{
		return startDate;
	}

	public void setStartDate(Timestamp startDate)
	{
		this.startDate = startDate;
	}

	public Timestamp getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Timestamp endDate)
	{
		this.endDate = endDate;
	}

	public TimeSheetEntryType getTimeSheetEntryType()
	{
		return timeSheetEntryType;
	}

	public void setTimeSheetEntryType(TimeSheetEntryType timeSheetEntryType)
	{
		this.timeSheetEntryType = timeSheetEntryType;
	}

	public TimeSheet getTimesheet()
	{
		return timesheet;
	}

	public void setTimesheet(TimeSheet timesheet)
	{
		this.timesheet = timesheet;
	}

}
