package com.loc8.timekeeper.timekeeper_core.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class TimeSheetEntryType extends AbstractEntity
{
	private String name;

	@ManyToOne @PrimaryKeyJoinColumn 
	private AllowanceType allowanceType;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public AllowanceType getAllowanceType()
	{
		return allowanceType;
	}

	public void setAllowanceType(AllowanceType allowanceType)
	{
		this.allowanceType = allowanceType;
	}

}
