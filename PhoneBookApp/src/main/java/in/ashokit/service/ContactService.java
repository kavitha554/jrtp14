package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Component;

import in.ashokit.model.Contact;

public interface ContactService {
	
	public boolean saveOrUpdateContact(Contact contact);
	
     List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public boolean deleteContactById(Integer ContactId);

}
