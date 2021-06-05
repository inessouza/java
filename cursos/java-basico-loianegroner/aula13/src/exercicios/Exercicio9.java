package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------- CONVERSOR DE TEMPERATURA ---------");
		System.out.print("\n Digite a temperatura em Farenheit: ");
		
		double farenheit = scanner.nextDouble();
		
		double celsius = (farenheit - 32) / 1.8;
		
		System.out.println("A temperatura em Celsius é: " + celsius);
		
		scanner.close();
	}
}