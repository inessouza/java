package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Faça um programa que peça a temperatura em graus Celsius, transforme e mostre a temperatura em graus Farenheit.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------- CONVERSOR DE TEMPERATURA ---------");
		System.out.print("\n Digite a temperatura em graus Celsius: ");
		
		double celsius = scanner.nextDouble();
		
		double farenheit = celsius * 1.8 + 32;
		
		System.out.println("\n A temperatura em graus Farenheit é: " + farenheit);
		
		scanner.close();
	}
}