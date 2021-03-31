
package in.ashokit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="CONTACT_DTL")
public class Contact {
	
	@Id
	@GeneratedValue
	@Column(name = "CONTACT_ID")
	public Integer contactId;
	@Column(name = "CONTACT_NAME")
	public String contactName;
	@Column(name = "CONTACT_EMAIL")
	public String contactEmail;
	@Column(name = "CONTACT_NUMBER")
	public String contactNumber;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}	

	
	
}