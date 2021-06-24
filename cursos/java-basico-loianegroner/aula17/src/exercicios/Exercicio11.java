package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Faça um programa que receba dois números	inteiros, gere os números inteiros 
		// que estão no intervalo compreendido por eles e mostre a soma destes números:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		int soma = 0;
		for (int i = numero1; i <= numero2; i++) {
			soma = soma + i;			
		}
		
		System.out.println(soma);
		scanner.close();
	}
}