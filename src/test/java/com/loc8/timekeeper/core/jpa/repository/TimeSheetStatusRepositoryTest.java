package com.loc8.timekeeper.core.jpa.repository;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.loc8.timekeeper.core.TimekeeperCoreApplication;
import com.loc8.timekeeper.core.jpa.domain.TimeSheetStatus;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TimekeeperCoreApplication.class)
@WebAppConfiguration
public class TimeSheetStatusRepositoryTest
{

	@Test
	public void contextLoads()
	{

	}

	@Autowired 
	private TimeSheetStatusRepository timeSheetStatusRepository;
	
	  
	
	@Test
	public void addTimeSheet()
	{

		TimeSheetStatus timeSheetStatus = new TimeSheetStatus();
		timeSheetStatus.setName("TEST");
		timeSheetStatus = timeSheetStatusRepository.save(timeSheetStatus);
		assertThat(timeSheetStatus.getId(), is(notNullValue()));

	}

	public TimeSheetStatusRepository getProjectRepository()
	{
		return this.timeSheetStatusRepository;
	}

}
