package com.loc8.timekeeper.timekeeper_core.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.loc8.timekeeper.timekeeper_core.jpa.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long>
{
	List<Contact> findByName(String name);

}
