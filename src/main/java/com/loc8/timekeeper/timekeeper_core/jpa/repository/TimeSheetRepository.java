package com.loc8.timekeeper.timekeeper_core.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.loc8.timekeeper.timekeeper_core.jpa.domain.TimeSheet;

public interface TimeSheetRepository extends CrudRepository<TimeSheet, Long>
{
	List<TimeSheet> findByName(String name);
}
