package exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Faça um programa que pergunte quanto a pessoa ganha por hora e o número de horas trabalhadas no mês.
		// Calcule e mostre o total do seu salário referido no mês, sabendo-se que são descontados 11% para o Imposto de Renda,
		// 8% para o INSS e 5% para o sindicato, faça um programa que informe: 
		// a) Salário bruto
		// b) Quanto pagou ao INSS
		// c) Quanto pagou ao Sindicato
		// d) Salário líquido
		// e) Calcule os descontos e o salário líquido
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- FOLHA DE PAGAMENTO -----");
		
		System.out.println("Digite o valor da hora trabalhada: ");
		double valorHora = scanner.nextDouble();
		
		System.out.println("Digite o número de horas trabalhdas no mês: ");
		int horasTrabalhadas = scanner.nextInt();
		
		double salarioBruto = horasTrabalhadas * valorHora;
		
		double pagInss = salarioBruto * 8 / 100;
		double pagSindicato = salarioBruto * 5 / 100;
		double pagIR = salarioBruto * 11 / 100;
		
		double salarioLiquido = salarioBruto - pagInss - pagSindicato - pagIR;
		
		System.out.println("Salário Bruto: R$" + salarioBruto);
		System.out.println("Desconto INSS: R$" + pagInss);
		System.out.println("Desconto Sindicato: R$" + pagSindicato);
		System.out.println("Desconto Imposto de Renda R$: " + pagIR);
		
		System.out.println("SALÁRIO LÍQUIDO: R$" + salarioLiquido);
		
		scanner.close();
	}
}
