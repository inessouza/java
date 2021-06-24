package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Faça um programa que receba dois números	inteiros e gere os
		// números inteiros que estão no intervalo compreendido por eles:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		for (int i = numero1; i <= numero2; i++) {
			System.out.println(i);
		}
		scanner.close();
	}
}