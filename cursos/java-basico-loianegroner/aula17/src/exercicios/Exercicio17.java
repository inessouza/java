package exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
		// Exemplo: 5!= 5.4.3.2.1 = 120
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numeroInteiro = scanner.nextInt();
		
		System.out.print(numeroInteiro + "! = ");
		
		int fatorial = 1;
		for(int i = numeroInteiro; i > 0; i--) {
			fatorial *= i;
			System.out.print(i + " ");
		}
		System.out.println("\nResultado: " + fatorial);
	}
}