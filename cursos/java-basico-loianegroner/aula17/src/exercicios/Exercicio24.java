package exercicios;

public class Exercicio24 {

	public static void main(String[] args) {
		// O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
		// implantar a metodologia da tabelinha, que já é um sucesso na sua loja
		// de 1,99. Você foi contratado para desenvolver o programa que monta a 
		// tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão 
		// informado pelo usuário:
		
		System.out.println("Preço do pão: R$ 0,18");
		System.out.println("Lojas Quase Dois - Tabela de Preços");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (0.18 * i));
		}
	}
}