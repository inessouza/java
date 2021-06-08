package exercícios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Faça um programa que leia três números e mostre o maior deles.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite outro número: ");
		int numero2 = scanner.nextInt();
		
		System.out.println("Digite mais um número: ");
		int numero3 = scanner.nextInt();
		
		if ((numero1 > numero2) && (numero1 > numero3)) {
			System.out.println("\nO maior número é: " + numero1);
		} else if ((numero2 > numero1) && (numero2 > numero3)) {
			System.out.println("\nO maior número é: " + numero2);
		} else {
			System.out.println("\nO maior número é: " + numero3);
		}
	
		scanner.close();
	}
}