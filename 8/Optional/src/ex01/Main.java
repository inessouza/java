package ex01;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		ContactDAO contactDAO = new ContactDAO();
		Optional<Contact> result = contactDAO.searchByName("Pedro");
		
		if(result.isPresent()) {
			Contact contact = result.get(); // Received an object | Declarative Code
			contact.setName("Frank");
			System.out.println(contact.getName());
			System.out.println(result.get().getName()); // Imperative Code
		}
	}
}