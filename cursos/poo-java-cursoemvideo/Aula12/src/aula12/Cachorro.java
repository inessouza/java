package aula12;

public class Cachorro extends Mamifero{
	
	@Override
	public void locomover() {
		System.out.println("Andando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Latindo");
	}
}