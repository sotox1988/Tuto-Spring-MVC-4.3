package com.udemy.backendninja.component;

import org.springframework.stereotype.Component;

import com.udemy.backendninja.entity.Contact;
import com.udemy.backendninja.model.ContactModel;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactConverter.
 */
@Component("contactConverter")
public class ContactConverter {
	
	/**
	 * Convert contact model 2 contact.
	 *
	 * @param contactModel the contact model
	 * @return the contact
	 */
	public Contact convertContactModel2Contact(ContactModel contactModel) {

		Contact contact = new Contact();
		contact.setId(contactModel.getId());
		contact.setFirtsname(contactModel.getFirtsname());
		contact.setLastname(contactModel.getLastname());
		contact.setTelephone(contactModel.getTelephone());
		contact.setCity(contactModel.getCity());
		
		return contact;
		
	}
	
	/**
	 * Convert contact 2 contact model.
	 *
	 * @param contact the contact
	 * @return the contact model
	 */
	public ContactModel convertContact2ContactModel(Contact contact) {
		
		ContactModel contactModel = new ContactModel();
		contactModel.setId(contact.getId());
		contactModel.setFirtsname(contact.getFirtsname());
		contactModel.setLastname(contact.getLastname());
		contactModel.setTelephone(contact.getTelephone());
		contactModel.setCity(contact.getCity());
		
		return contactModel;
		
	}

}
