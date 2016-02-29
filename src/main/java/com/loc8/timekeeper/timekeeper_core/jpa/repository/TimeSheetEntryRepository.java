package com.loc8.timekeeper.timekeeper_core.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.loc8.timekeeper.timekeeper_core.jpa.domain.TimeSheetEntry;

public interface TimeSheetEntryRepository extends CrudRepository<TimeSheetEntry, Long>
{

}
