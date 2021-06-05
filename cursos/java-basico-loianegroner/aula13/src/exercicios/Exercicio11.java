package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Faça um programa que peça dois números inteiros e um número real. Calcule e mostre:
		// a) O produto do dobro do primeiro com metade do segundo
		// b) A soma do triplo do primeiro com o terceiro
		// c) O terceiro elevado ao cubo
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número Inteiro: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite outro número Inteiro: ");
		int numero2 = scanner.nextInt();
		
		System.out.println("Digite um número Real: ");
		double numero3 = scanner.nextDouble();
		
		int produto = (numero1 * 2) * (numero2 / 2);
		
		double soma = (numero1 * 3) + numero3;
		
		double cuboTerceiro = Math.pow(numero3, 3);
		
		System.out.println("\nResultado A: " + produto);
		System.out.println("Resultado B: " + soma);
		System.out.println("Resultado C: " + cuboTerceiro);
		
		scanner.close();
	}
}