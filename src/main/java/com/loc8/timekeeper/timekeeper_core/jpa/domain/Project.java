package com.loc8.timekeeper.timekeeper_core.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO) private String uuid;

	private String name;

	protected Project()
	{
	}

	public Project(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return String.format("Project[uuid=%s, Name='%s']", uuid, name);
	}

}
