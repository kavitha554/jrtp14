package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.model.Contact;
import in.ashokit.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;

	@Override
	public boolean saveOrUpdateContact(Contact contact) {
		
		Contact saveObj = repo.save(contact);
		
		return saveObj.getContactId() != null;
	}

	@Override
	public List<Contact> getAllContacts() {
		return repo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional <Contact> findById = repo.findById(contactId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean deleteContactById(Integer ContactId) {
		boolean isDeleted = false;
		
		try {
			repo.deleteById(ContactId);
			isDeleted = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}
	

}
