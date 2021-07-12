package exceptions.nullpointer.ex01;

public class Main {

	public static void main(String[] args) {
		//Objeto não tem uma referência
		Address address = null;
		
		// Será gerado um nullpointer exception porque o objeto é nulo
		System.out.println(address.getAllAdress());
	}
}