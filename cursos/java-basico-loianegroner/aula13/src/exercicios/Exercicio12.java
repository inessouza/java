package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- CALCULADORA DE PESO IDEAL -----");
		System.out.print("Digite a sua altura: ");
		double altura = scanner.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("O seu peso ideal é: " + pesoIdeal);
		
		scanner.close();
	}
}