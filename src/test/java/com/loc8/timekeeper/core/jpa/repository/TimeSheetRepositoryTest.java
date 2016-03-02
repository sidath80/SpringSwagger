package com.loc8.timekeeper.core.jpa.repository;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;

import com.loc8.timekeeper.core.TimekeeperCoreApplication;
import com.loc8.timekeeper.core.jpa.domain.Contact;
import com.loc8.timekeeper.core.jpa.domain.TimeSheet;
import com.loc8.timekeeper.core.jpa.domain.TimeSheetStatus;




@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TimekeeperCoreApplication.class)
@SqlGroup({
    @Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, 
    		scripts = "classpath:beforeTimeSheetRepositoryTestRun.sql"),
    @Sql(executionPhase = ExecutionPhase.AFTER_TEST_METHOD, 
    		scripts = "classpath:afterTimeSheetRepositoryTestRun.sql") })
@WebAppConfiguration
public class TimeSheetRepositoryTest
{

	@Test
	public void contextLoads()
	{

	}

	@Autowired 
	private TimeSheetRepository timeSheetRepository;
	
	@Autowired 
	private ContactRepository contactRepository;
	
	@Autowired 
	private TimeSheetStatusRepository timeSheetStatusRepository;
	
	        
	@Test
	public void addTimeSheet()
	{
		List<Contact> contacts =contactRepository.findByName("test-contact");
		List<TimeSheetStatus> timeSheetStatuses =timeSheetStatusRepository.findByName("ACTIVE");
		
		if (contacts != null && !contacts.isEmpty())
		{
			TimeSheet timeSheet = new TimeSheet();
			timeSheet.setName("Sidath_TimeSheet");
			timeSheet.setEmployee(contacts.get(0));
			if(timeSheetStatuses != null && !timeSheetStatuses.isEmpty())
			{
				timeSheet.setStatus(timeSheetStatuses.get(0));
			}
			timeSheet = timeSheetRepository.save(timeSheet);
			assertThat(timeSheet.getId(), is(notNullValue()));
		}
	}

	public TimeSheetRepository getProjectRepository()
	{
		return this.timeSheetRepository;
	}

}
