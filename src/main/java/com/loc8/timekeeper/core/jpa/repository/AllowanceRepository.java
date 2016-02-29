package com.loc8.timekeeper.core.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.loc8.timekeeper.core.jpa.domain.Allowance;

public interface AllowanceRepository extends CrudRepository<Allowance, Long>
{

}
