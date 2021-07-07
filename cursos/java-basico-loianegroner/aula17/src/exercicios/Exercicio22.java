package exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// Faça um programa que calcule o valor total investido por um colecionador
		// em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário 
		// deverá informar a quantidade de CDs e o valor para em cada um:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número de CDs: ");
		int cds = scanner.nextInt();
		
		double preco;
		double soma = 0;
		
		for (int i = 1; i <= cds; i++) {
			System.out.print("Informe o valor do " + i + "º CD: ");
			preco = scanner.nextDouble();
			
			soma = soma + preco;
		}
		
		double media = soma / cds;
		
		System.out.println("Média de gasto com cada CD: R$" + media);
		
		scanner.close();
	}
}