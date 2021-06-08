package exercícios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um programa que peça dois números e imprima o maior deles:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite outro número: ");
		int numero2 = scanner.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O maior número é: " + numero1);
		} else {
			System.out.println("O maior número é: " + numero2);
		}
		scanner.close();
	}
}
