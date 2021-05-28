package ex05;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		System.out.println("Faça um algoritmo que leia um número N, "
				+ "some todos os números inteiros de 1 a N, e mostre \r\n" 
				+ "o resultado obtido.");
		
		int n; 
		int soma = 0;
		
		System.out.println("\nDigite um número: ");
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {		
			soma = soma + i;
		}
		
		System.out.println("\n A soma dos valores inteiros de 1 a " + n + " é: " + soma);
		scanner.close();
	}
}
