package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.Contact;
import in.ashokit.service.ContactService;

@RestController
public class ContactOperationsController {
	
@Autowired	
private ContactService service;
	
	@GetMapping("/edit")
	public String editContact(@RequestParam("cid")Integer contactId, Model model) {
		Contact contactObj = service.getContactById(contactId);
		
		model.addAttribute("contact", contactObj);
		
		
		return "contact";
		
	}
	
	@GetMapping("/delete")
	public String deleteContact(@RequestParam("cid") Integer contactId, Model model) {
	
	boolean isDeleted = service.deleteContactById(contactId);
	
	if(isDeleted) {
		model.addAttribute("succMsg","contact Deleted Successfully");
	}
	else {
		model.addAttribute("failMsg","contact Deletion failed");
			}
	return "redirect:view-contacts";
	
   }

}
