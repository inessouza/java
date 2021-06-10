package exercícios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// As organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
		// e lhe contrataram para desenvolver um programa que calculará os reajustes:
		
		// 1) Faça um programa que recebe o salário de um colaborador e o reajuste seguindo o seguinte
		// critério, baseado no salário Antigo:
		// a) Salários até R$280,00 (incluindo): Aumento de 20%		
		// b) Salários entre R$280,00 e R$700,00: Aumento de 15%
		// b) Salários entre R$700,00 e R$1500,00: Aumento de 10%
		// c) Salários de R$1500,00 em diante: Aumento de 5%.
		
		// Após o aumento ser ralizado, informe na tela:
		// - Salário antes do reajuste
		// - Percentual de aumento aplicado
		// - Valor do aumento
		// - Novo salário, após o aumento
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- SITEMA DE REAJUSTES -----");
		System.out.print("\nDigite o salário do colaborador: ");
		double salarioAntigo = scanner.nextDouble();
		
		int percentual = 0;
		if(salarioAntigo <= 280.00) {
			percentual = 20;
			
		} else if (salarioAntigo > 280.00 && salarioAntigo <= 700.00) {
			percentual = 15;
			
		} else if (salarioAntigo > 700.00 && salarioAntigo <= 1500.00) {
			percentual = 10;
			
		} else if (salarioAntigo > 1500.00) {
			percentual = 5;
		}
		
		double valorAumento = (salarioAntigo / 100) * percentual;
		double salarioNovo = salarioAntigo + valorAumento;
		
		System.out.println("\n----- SALÁRIO APÓS REAJUSTE -----");
		System.out.println("\nSalário Antigo: R$" + salarioAntigo);
		System.out.println("Percentual de Aumento: " + percentual + "%");
		System.out.println("Valor do Aumento: R$" + valorAumento);
		System.out.println("Salário Reajustado: R$" + salarioNovo);
		
		scanner.close();
	}
}