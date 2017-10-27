package services;

import java.util.List;

import org.springframework.stereotype.Service;

import it.relatech.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Override
	public Contact saveOrUpdateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> listContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteContact(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contact findByTel(String tel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ContactExist(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact getContactById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactByNomeAndCognome(String nome, String cognome) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
