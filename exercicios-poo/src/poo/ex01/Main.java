package poo.ex01;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Honda", "HR-V", 2021, "Grafite");
		carro.status();
		
		Carro carro2 = new Carro("Ford", "Focus", 2022, "Preto");
		carro2.status();
	}
}
