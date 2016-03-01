package com.loc8.timekeeper.core.jpa.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TimeSheets")
public class TimeSheet extends AbstractEntity
{

	private String name;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private Contact employee;

	private Timestamp startDate;
	private Timestamp endDate;
	
	@ManyToOne
	private TimeSheetStatus status;
		
	@OneToMany(mappedBy = "timesheet", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<TimeSheetEntry> timeSheetEntries  = new HashSet<TimeSheetEntry>();

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Contact getEmployee()
	{
		return employee;
	}

	public void setEmployee(Contact employee)
	{
		this.employee = employee;
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

	public TimeSheetStatus getStatus()
	{
		return status;
	}

	public void setStatus(TimeSheetStatus status)
	{
		this.status = status;
	}

	public Set<TimeSheetEntry> getTimeSheetEntries()
	{
		return timeSheetEntries;
	}

	public void setTimeSheetEntries(Set<TimeSheetEntry> timeSheetEntries)
	{
		this.timeSheetEntries = timeSheetEntries;
	}
	
	

}
