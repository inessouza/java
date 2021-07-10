package ex05;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		ContactDAO contactDAO = new ContactDAO();
		Optional<Contact> result = contactDAO.searchByName("Pedro");
		
		Contact contact = result.orElseGet(Main:: createContact); // Supplier represented by Method Reference Will call a Lambda 
		System.out.println(contact.getName());
	}
	
	// 'orElse()' will don't create a new object independent if 'result' is an object, 
	// then the memory will accumulated inutillited objects

	public static Contact createContact() {
		System.out.println("Created an object in memory");
		return new Contact("Juninho");
	}
}