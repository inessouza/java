package exceptions.nullpointer.ex01;

public class Address {
	public String street;
	public String locality;
	
	public Address(String street, String locality) {
		this.street = street;
		this.locality = locality;
	}
	
	public String getAllAdress() {
		return street + " , " + locality;
	}
}