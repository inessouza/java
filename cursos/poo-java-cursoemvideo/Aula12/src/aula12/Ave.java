package aula12;

public class Ave extends Animal {
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Comendo Frutas");
	}

	@Override
	public void alimentar() {
		System.out.println("Som de Ave");
	}

	@Override
	public void emitirSom() {
		System.out.println("Construindo Ninho");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}
