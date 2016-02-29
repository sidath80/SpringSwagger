package com.loc8.timekeeper.timekeeper_core;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.loc8.timekeeper.timekeeper_core.jpa.domain.TimeSheet;
import com.loc8.timekeeper.timekeeper_core.jpa.domain.TimeSheetEntry;
import com.loc8.timekeeper.timekeeper_core.jpa.repository.TimeSheetEntryRepository;
import com.loc8.timekeeper.timekeeper_core.jpa.repository.TimeSheetRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TimekeeperCoreApplication.class)
public class TimeSheetEntryRepositoryTest
{

	@Test
	public void contextLoads()
	{

	}

	@Autowired 
	private TimeSheetEntryRepository timeSheetEntryRepository;
	
	@Autowired 
	private TimeSheetRepository timeSheetRepository;
	
	  
	
	public void addTimeSheetEntry()
	{
		List<TimeSheet> timeSheets =timeSheetRepository.findByName("Sidath_TimeSheet");
		
		TimeSheetEntry timeSheetEntry = new TimeSheetEntry();
		timeSheetEntry.setName("Entry-01");
		timeSheetEntry.setTimesheet(timeSheets.get(0));
		timeSheetEntry = timeSheetEntryRepository.save(timeSheetEntry);
		assertThat(timeSheetEntry.getId(), is(notNullValue()));

	}

	public TimeSheetEntryRepository getProjectRepository()
	{
		return this.timeSheetEntryRepository;
	}

}
