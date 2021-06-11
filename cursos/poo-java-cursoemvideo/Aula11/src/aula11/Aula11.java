package aula11;

public class Aula11 {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno("Claudio", 16, "M", 1111, "Informática");
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		
		Professor p1 = new Professor("Alvaro", 35, "M", "Professor de Informática", 3500.00);
		p1.receberAumento();
		System.out.println(p1.toString());
		
		/*Bolsista b1 = new Bolsista("Jubileu", 16, "M", 1112, "Informática", 50.5);
		b1.pagarMensalidade();
		b1.getBolsa();
		System.out.println(b1.toString());
		
		Tecnico t1 = new Tecnico("Marcelo", 32, "M", "Técnico");
		System.out.println(t1.toString()); */
	}
}