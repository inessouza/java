package aula11;

public class Professor extends Pessoa {
	private String especialidade;
	private double salario;
	
	
	public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.especialidade = especialidade;
		this.salario = salario;
	}

	public void receberAumento() {
		System.out.println("Recebendo aumento");
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return  "\nAtributos: Nome: " + nome + ", Idade:" + idade + ", Sexo:" + sexo + ", Especialidade: " + especialidade + ", Salário: " + salario;
	}
}