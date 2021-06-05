package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Faça um programa que peça quatro notas bimestrais e mostre a média:
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();
		System.out.println("Digite a quarta nota: ");
		double nota4 = scanner.nextDouble();
		
		double soma = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média é: " + soma);
		
		scanner.close();
	}
}