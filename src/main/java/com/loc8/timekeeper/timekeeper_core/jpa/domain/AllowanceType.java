package com.loc8.timekeeper.timekeeper_core.jpa.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class AllowanceType extends AbstractEntity
{

	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@OrderColumn(name="allowance_id")
	private Set<Allowance> allowances  = new HashSet<Allowance>();

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Set<Allowance> getAllowances()
	{
		return allowances;
	}

	public void setAllowances(Set<Allowance> allowances)
	{
		this.allowances = allowances;
	}
	
}
