package it.relatech.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import it.relatech.model.Contact;
import services.ContactService;


@RestController
@RequestMapping
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	private final Logger logger = (Logger) LoggerFactory.getLogger(ContactController.class);
	
	@GetMapping("/getModel")
	public Contact getContactModel() {
		return new Contact();
	}
	
	@PostMapping("/save")
	public ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
		try {
			Contact savedContact = contactService.saveOrUpdateContact(contact);
			logger.info("Contact saved: " + savedContact);
			return new ResponseEntity<Contact>(savedContact, HttpStatus.CREATED);
		} catch (Exception e) {
			logger.error("Error: " + e);
			return new ResponseEntity<Contact>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Contact> getContactById(@PathVariable("id") int id){
		try {
			Contact contact = contactService.getContactById(id);
			logger.info("Get Contact By id: " + contact);
			return new ResponseEntity<Contact>(contact, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error: " + e);
			return new ResponseEntity<Contact>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/getList")
	public ResponseEntity<List<Contact>> getListContact(){
		try {
			List<Contact> ListContact = contactService.listContact();
			return new ResponseEntity<List<Contact>>(ListContact, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error: " + e);
			return new ResponseEntity<List<Contact>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/getByNomeAndCognome")
	public ResponseEntity<Contact> getContactByNomeAndCognome(@RequestHeader("nome") String nome,
			@RequestHeader("cognome") String cognome) {
		try {
			Contact Contact = contactService.getContactByNomeAndCognome(nome, cognome);
			return new ResponseEntity<Contact>(Contact, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Error: " + e);
			return new ResponseEntity<Contact>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
