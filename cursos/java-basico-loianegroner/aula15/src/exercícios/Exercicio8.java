package exercícios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Faça um programa que pergunte o preço de três produtos e informe qual produto comprar,
		// sabendo que a decisão é sempre pelo mais barato.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o preço do primeiro produto: ");
		double produto1 = scanner.nextDouble();
		
		System.out.println("Digite o preço do segundo produto: ");
		double produto2 = scanner.nextDouble();
		
		System.out.println("Digite o preço do terceiro produto: ");
		double produto3 = scanner.nextDouble();
		
		if ((produto1 < produto2) && (produto1 < produto3)) {
			System.out.println("O primeiro produto é o mais barato, é este que você deve comprar!");
		} else if ((produto2 < produto1) && (produto2 < produto3)) {
			System.out.println("O segundo produto é o mais barato, é este que você deve comprar!");
		} else {
			System.out.println("O terceiro produto é o mais barato, é este que você deve comprar!");
		}
		
		scanner.close();
	}
}