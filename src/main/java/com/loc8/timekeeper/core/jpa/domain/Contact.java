package com.loc8.timekeeper.core.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.util.Assert;

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
		Assert.hasText(name);
		this.name = name;
	}

}
