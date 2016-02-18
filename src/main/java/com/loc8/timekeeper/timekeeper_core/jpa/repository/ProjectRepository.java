package com.loc8.timekeeper.timekeeper_core.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.loc8.timekeeper.timekeeper_core.jpa.domain.Project;

public interface ProjectRepository extends CrudRepository<Project, Long>
{
	List<Project> findByName(String name);
}
