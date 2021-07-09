package exercicios;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		// Faça um programa que mostre os n termos da Série a seguir:
		// S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m
		// Imprima no final a soma da série:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		int n = scanner.nextInt();
		double soma = 0;
		
		for (int i = 1, j = 1; i <= n; i++, j+=2) {
			System.out.print(i + "/" + j + " + ");
			
			soma += i / j;
		}
		System.out.println("\nSoma: " + soma);
		scanner.close();
	}
}