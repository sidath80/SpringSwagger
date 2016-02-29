package com.loc8.timekeeper.core.jpa.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.loc8.timekeeper.core.jpa.domain.TimeSheetStatus;

public interface TimeSheetStatusRepository extends CrudRepository<TimeSheetStatus, Long>
{
	List<TimeSheetStatus> findByName(String name);
}
