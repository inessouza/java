package exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Faça um programa que peça dois números, base e expoente,
		// calcule e mostre o primeiro número elevado ao segundo número:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a base: ");
		int base = scanner.nextInt();
		
		System.out.print("Digite a potência: ");
		int potencia = scanner.nextInt();
		
		int resultado = base;
		
		for (int i = 1; i < potencia; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
	}
}