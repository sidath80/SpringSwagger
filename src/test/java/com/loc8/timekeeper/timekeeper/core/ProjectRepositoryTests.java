package com.loc8.timekeeper.timekeeper.core;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.loc8.timekeeper.timekeeper_core.TimekeeperCoreApplication;
import com.loc8.timekeeper.timekeeper_core.jpa.domain.Project;
import com.loc8.timekeeper.timekeeper_core.jpa.repository.ProjectRepository;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TimekeeperCoreApplication.class)
public class ProjectRepositoryTests
{

	@Test
	public void contextLoads()
	{

	}

	@Autowired 
	private ProjectRepository repository;
	
	@Test
	public void addProject()
	{
		Project project =new Project("Test_UUID_Project_one");
		project=repository.save(project);
		assertThat(project.getId(), is(notNullValue()));
	}

	public ProjectRepository getProjectRepository()
	{
		return this.repository;
	}

}
