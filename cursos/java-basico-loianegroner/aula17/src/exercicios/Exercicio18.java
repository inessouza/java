package exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// Faça um programa que peça um número inteiro e determine
		// se ele é ou não um número primo: 
		
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