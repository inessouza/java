package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Faça um programa que converta metros para centimetros:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de metros: ");
		int metro = scanner.nextInt();
		
		int centimetros = metro * 100;
		
		System.out.println("A conversão de metros para centímetros é: " + centimetros);
		
		scanner.close();
	}
}