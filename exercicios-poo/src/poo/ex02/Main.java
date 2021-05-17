package poo.ex02;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.marca = "Honda";
		carro.modelo = "HR-V";
		carro.ano = 2021;
		carro.cor = "Grafite";
		carro.mudarCor("Vermelha");
		carro.ligarCarro(true);
		carro.desligarCarro(false);
	}
}
