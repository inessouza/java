package poo.ex03;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setMarca("Honda");
		System.out.println(carro.getMarca());
		
		carro.setModelo("HR-V");
		System.out.println(carro.getModelo());
		
		carro.setAno(2021);
		System.out.println(carro.getAno());
		
		carro.setCor("Vermelho");
		System.out.println(carro.getCor());
		
		//carro.status();
	}
}
