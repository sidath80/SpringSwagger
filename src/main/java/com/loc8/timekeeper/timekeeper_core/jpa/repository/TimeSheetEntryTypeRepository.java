package com.loc8.timekeeper.timekeeper_core.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.loc8.timekeeper.timekeeper_core.jpa.domain.TimeSheetEntryType;

public interface TimeSheetEntryTypeRepository  extends CrudRepository<TimeSheetEntryType, Long>
{

}
