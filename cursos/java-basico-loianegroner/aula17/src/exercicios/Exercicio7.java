package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Faça um programa que leia cinco números e informe o número maior:
		
		Scanner scanner = new Scanner(System.in);
		
		int numero; 
		int maiorNumero = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}	
		}
		
		System.out.println("O maior número digitado foi: " + maiorNumero);
		scanner.close();
	}
}