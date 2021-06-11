package aula11;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.matricula = matricula;
		this.curso = curso;	
	}
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno: " + this.nome);
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return  "\nAtributos: Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo + ", Matrícula: " + matricula + ", Curso: " + curso;
	}
}