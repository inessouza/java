package exercicios;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		// Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia.
		// Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que 
		// peça um número inteiro e determine se ele é ou não um número primo:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println("Número não é primo!");
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println("Número é primo!");
		}
		scanner.close();
	}
}