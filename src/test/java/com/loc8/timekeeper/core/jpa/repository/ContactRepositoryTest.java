package com.loc8.timekeeper.core.jpa.repository;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.loc8.timekeeper.core.TimekeeperCoreApplication;
import com.loc8.timekeeper.core.jpa.domain.Contact;




@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TimekeeperCoreApplication.class)
public class ContactRepositoryTest
{

	@Test
	public void contextLoads()
	{

	}

	@Autowired 
	private ContactRepository contactRepository;
	        
	
	@Test
	public void addContact()
	{
		Contact contact =new Contact();
		contact.setName("Sidath");
		contact=contactRepository.save(contact);
		assertThat(contact.getId(), is(notNullValue()));
	}

	public ContactRepository getProjectRepository()
	{
		return this.contactRepository;
	}
}
