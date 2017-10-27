package it.relatech.repository;

import org.springframework.data.repository.CrudRepository;

import it.relatech.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer>{

	Contact findByTel (String tel);
	
	
}
