package exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// Faça um programa que calcule e mostre a média aritmética de N notas:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o total de notas para calculo da média: ");
		int notas = scanner.nextInt();
		
		double soma = 0;
		double media;
		double nota;
		
		for(int i = 0; i < notas; i++) {
			System.out.print("Digite a " + (i+1) + "ª nota: ");
			nota = scanner.nextDouble();
			
			soma += nota;
		}
		
		media = soma / notas;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
		scanner.close();
	}
}