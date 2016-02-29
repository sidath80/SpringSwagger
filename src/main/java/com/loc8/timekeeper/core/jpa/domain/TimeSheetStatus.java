package com.loc8.timekeeper.core.jpa.domain;

import javax.persistence.Entity;

@Entity
public class TimeSheetStatus extends AbstractEntity
{

	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
