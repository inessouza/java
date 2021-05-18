package aula5a;

public class Aula5 {

	public static void main(String[] args) {
		ContaBanco contaBanco = new ContaBanco();
		contaBanco.setNumConta(1111);
		contaBanco.setDono("Antônio");
		contaBanco.abrirConta("CC");
		
		ContaBanco contaBanco2 = new ContaBanco();
		contaBanco2.setNumConta(2222);
		contaBanco2.setDono("Vivian");
		contaBanco2.abrirConta("CP");
		
		contaBanco.depositar(100);
		contaBanco2.depositar(500);
		
		contaBanco2.sacar(650);
		
		contaBanco2.fecharConta();
		
		contaBanco.status();
		contaBanco2.status();
	}
}
