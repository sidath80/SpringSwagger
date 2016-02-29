package com.loc8.timekeeper.core.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.loc8.timekeeper.core.jpa.domain.TimeSheetEntryType;

public interface TimeSheetEntryTypeRepository  extends CrudRepository<TimeSheetEntryType, Long>
{

}
