package com.loc8.timekeeper.core.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.loc8.timekeeper.core.jpa.domain.TimeSheet;

public interface TimeSheetRepository extends CrudRepository<TimeSheet, Long>
{
	List<TimeSheet> findByName(String name);
}
