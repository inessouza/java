package exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Faça um programa que peça dez números inteiros, calcule e mostre
		// a quantidade de números pares e quantidade de números ímpares:
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		int quantPares = 0;
		int quantImpares = 0;
		
		for (int i = 0; i < 10; i ++) {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();
			
			if (numero % 2 == 0) {
				quantPares = quantPares + 1;
			} else {
				quantImpares = quantImpares + 1;
			}
		
		}
		
		System.out.println("Quantidade de números pares: " + quantPares);
		System.out.println("Quantidade de números ímpares: " + quantImpares);
		
		scanner.close();
	}
}