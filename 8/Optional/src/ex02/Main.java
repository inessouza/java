package ex02;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		ContactDAO contactDAO = new ContactDAO();
		Optional<Contact> result = contactDAO.searchByName("Pedro");
		
		// result.ifPresent(it -> System.out.println(it.getName()));
			
		result.ifPresent(it -> {
			//it.setName("Viny");
			System.out.println(it.getName());
		});
	}
}