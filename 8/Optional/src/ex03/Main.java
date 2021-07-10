package ex03;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		ContactDAO contactDAO = new ContactDAO();
		Optional<Contact> result = contactDAO.searchByName("Pedro");
		
		Contact contact = result.orElse(new Contact("Juninho"));
		
		System.out.println(contact.getName());
	}
}