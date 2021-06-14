package exercícios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// Faça um programa que peça um número inteiro e determine se ele é impar ou par:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par!");
		} else {
			System.out.println("O número " + numero + " é impar!");
		}
		
		scanner.close();
	}
}