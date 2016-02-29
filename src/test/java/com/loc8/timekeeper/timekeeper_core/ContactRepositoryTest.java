package com.loc8.timekeeper.timekeeper_core;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.loc8.timekeeper.timekeeper_core.jpa.domain.Contact;
import com.loc8.timekeeper.timekeeper_core.jpa.repository.ContactRepository;



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
