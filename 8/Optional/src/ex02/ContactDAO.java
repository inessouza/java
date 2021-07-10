package ex02;

import java.util.Optional;

public class ContactDAO {
	public Optional<Contact> searchByName(String name) {
		return Optional.ofNullable(new Contact(name)); // Required an object or null
		//return Optional.of(null); // Required an object
	}
}