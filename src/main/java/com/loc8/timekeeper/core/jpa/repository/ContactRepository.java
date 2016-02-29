package com.loc8.timekeeper.core.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.loc8.timekeeper.core.jpa.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long>
{
	List<Contact> findByName(String name);

}
