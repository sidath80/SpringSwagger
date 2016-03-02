package com.loc8.timekeeper.core.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loc8.timekeeper.core.jpa.domain.Contact;
import com.loc8.timekeeper.core.jpa.repository.ContactRepository;

import io.swagger.annotations.ApiOperation;

@RestController
public class ContactRestController
{

	private static final Logger LOGGER = Logger.getLogger(ContactRestController.class);
	
	@Autowired 
	private ContactRepository contactRepository;

	// -------------------Retrieve All Contacts----------------------
	@ApiOperation(value = "listAllContacts", nickname = "List of All Contacts")
	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public ResponseEntity<List<Contact>> listAllContacts()
	{
		LOGGER.debug("listAllContacts");
		List<Contact> contacts = contactRepository.findAll();
		if (contacts.isEmpty())
		{
			return new ResponseEntity<List<Contact>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
	}
}
