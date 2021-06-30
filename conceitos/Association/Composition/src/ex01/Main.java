package ex01;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(200.00f, 33);
		Seller seller = new Seller(20.00f);
		Buyer buyer = new Buyer(200.00f);
		
		Sale sale = new Sale(product, seller, buyer);		
	}
}