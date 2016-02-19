package com.loc8.timekeeper.timekeeper_core.jpa.domain;

import javax.persistence.Entity;
import org.springframework.util.Assert;

@Entity
public class Project extends AbstractEntity
{

	private String name;

	public Project(String name)
	{

		Assert.hasText(name);
		this.name = name;
	}

	protected Project()
	{

	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name;
	}

}
