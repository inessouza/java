package aula11;

public class Tecnico extends Aluno {
	private String registroProfissional;
	
	public Tecnico(String nome, int idade, String sexo, int matricula, String curso, String registroProfissional) {
		super(nome, idade, sexo, matricula, curso);
		this.registroProfissional = registroProfissional;
	}
	
	public void praticar() {
		System.out.println("Praticando!");
	}

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	@Override
	public String toString() {
		return  "\nAtributos: Nome: " + nome + ", Idade:" + idade + ", Sexo: " + sexo + ", Registro: " + registroProfissional;
	}
}