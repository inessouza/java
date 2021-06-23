package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Faça um programa que leia cinco números e informe 
		// a soma e a média dos números: 
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		int media;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();
			soma = soma + numero;
		}
		
		media = soma / 5;
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média dos números é: " + media);
		
		scanner.close();
	}
}