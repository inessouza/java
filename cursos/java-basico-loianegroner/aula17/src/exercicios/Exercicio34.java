package exercicios;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		// Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. Faça um programa que calcule o valor de H com N termos.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de N: ");
		int n = scanner.nextInt();
		
		double soma = 0;
		
		for (int i = 1; i <= n; i++) {
			soma += 1 / i;
		}
		System.out.println("Soma: " + soma);
		
		scanner.close();
	}
}