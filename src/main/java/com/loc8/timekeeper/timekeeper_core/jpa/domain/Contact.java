package com.loc8.timekeeper.timekeeper_core.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Contact extends AbstractEntity
{

	private String name;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Contact mnager;

	public String getName()
	{
		return name;
	}

	public Contact getMnager()
	{
		return mnager;
	}

	public void setMnager(Contact mnager)
	{
		this.mnager = mnager;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
