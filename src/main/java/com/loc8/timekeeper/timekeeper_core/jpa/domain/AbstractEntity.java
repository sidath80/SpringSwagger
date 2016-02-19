package com.loc8.timekeeper.timekeeper_core.jpa.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity
{

	@Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;

	public Long getId()
	{
		return id;
	}

	@Override
	public int hashCode()
	{
		return id == null ? 0 : id.hashCode();
	}

}
