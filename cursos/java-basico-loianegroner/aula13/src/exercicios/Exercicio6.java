package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Faça um programa que peça um raio de um círculo, calcule e mostre a sua área:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = scanner.nextDouble();
		
		final double pi = 3.1415;
		double area = pi * raio * raio;
		
		System.out.println("A área do círculo é " + area);
		
		scanner.close();
	}
}