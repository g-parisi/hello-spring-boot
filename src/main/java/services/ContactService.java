package services;

import java.util.List;

import it.relatech.model.Contact;

public interface ContactService {
	
	Contact saveOrUpdateContact(Contact contact);
	
	Contact findOne(int id);
	
	List<Contact> listContact();
	
	void deleteContact(int id);
	
	Contact findByTel(String tel);
	
	boolean ContactExist(Contact contact);

	Contact getContactById(int id);

	Contact getContactByNomeAndCognome(String nome, String cognome);
	

}
