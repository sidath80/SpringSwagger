package com.loc8.timekeeper.core.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Contact extends AbstractEntity
{

	@JsonProperty(required = true)
    @ApiModelProperty(notes = "The name of the Contact", required = true)
	private String name;
	
	@JsonProperty(required = true)
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
