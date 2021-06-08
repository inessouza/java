package exercícios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("Este número é negativo!");
		} else if (numero == 0) {
			System.out.println("Zero é neutro!");
		} else {
			System.out.println("Este número é positivo!");
		}
		scanner.close();
	}
}