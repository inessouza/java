package exercícios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Faça um programa para o cálculo de uma folha de pagamento,
		// sabendo que todos os descontos são do Imposto de Renda que 
		// depende do salário bruto (conforme tabela abaixo) e 3% para 
		// o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, 
		// mas não é descontado (é a empresa que deposita). O Salário 
		// Líquido corresponde ao Salário Bruto menos os descontos. 
		// O programa deverá pedir ao usuário o valor da sua hora e a 
		// quantidade de horas trabalhadas no mês:
		
		///// Desconto do IR: 
		// a) Salário Bruto até 900 (inclusive) - isento
		// b) Salário Bruto até 1500 (inclusive) - desconto de 5%
		// c) Salário Bruto até 2500 (inclusive) - desconto de 10%
		// d) Salário Bruto acima de 2500 - desconto de 20%. 
		
		//  Mostrar na tela estas salário bruto, líquido e descontos:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----------- FOLHA DE PAGAMENTO -----------");
		System.out.print("\nDigite o valor da hora trabalhada: ");
		double valorHora = scanner.nextDouble();
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		double horasTrabalhadas = scanner.nextDouble();
		
		double salarioBruto = horasTrabalhadas * valorHora;
		
		int IR = 0;
		if (salarioBruto > 900 && salarioBruto <= 1500) {
			IR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			IR = 10;
		} else if (salarioBruto > 2500) {
			IR = 20;
		}
		
		double descontoIR = (salarioBruto / 100) * IR; 
		double inss = (salarioBruto / 100) * 10;
		double sindicato = (salarioBruto / 100) * 3;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = descontoIR + inss + sindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("\nSalário Bruto: R$" + salarioBruto);
		System.out.println("(-) IR (" + IR + "%): R$" + descontoIR);
		System.out.println("(-) INSS (10%): R$" + inss);
		System.out.println("(-) Sindicato (3%): R$ " + sindicato);
		System.out.println("FGTS (11%): R$" + fgts);
		System.out.println("Total de Descontos: R$" + totalDescontos);
		System.out.println("Salário Líquido: R$" + salarioLiquido);
		
		scanner.close();
	}
}