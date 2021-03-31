package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.Contact;
import in.ashokit.service.ContactService;

@Controller
public class ContactInfoController {

	@Autowired
	private ContactService service;
	/**
	 * This method is used to display contact form
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/load-form")
	public String loadForm(Model model) {
		
		Contact cobj = new Contact();	
		model.addAttribute("contact", cobj);	
		return "contact";
		
	}
	
	@PostMapping("/saveContact")
	public String handleSubmitBtn(Contact contact, Model model) {
		boolean isSaved = service.saveOrUpdateContact(contact);
		
		if(isSaved) {
			model.addAttribute("succMsg", "contact saved");
		}else {
			model.addAttribute("failMsg", "contact save failed");
		}
		return "contact";
	}
	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/view-contacts")
	public String handleViewsContactHyperLink(Model model) {
		List<Contact> allContacts = service.getAllContacts();
		model.addAttribute("contacts", allContacts);
		
		return "contacts-display";
	}
}
