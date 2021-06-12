package exercícios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// Faça um programa que peça os 3 lados de um triangulo. O programa deverá informar
		// se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, 
		// se o mesmo é: equilátero, isósceles ou escaleno:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do primeiro lado do triângulo: ");
		double lado1 = scanner.nextDouble();
		
		System.out.println("Digite o tamanho do segundo lado do triângulo: ");
		double lado2 = scanner.nextDouble();
		
		System.out.println("Digite o tamanho do terceiro lado do triângulo: ");
		double lado3 = scanner.nextDouble();
		
		if (((lado1 + lado2) > lado3) ||
			((lado1 + lado3) > lado2) ||
				((lado2 + lado3) > lado1)) {
			
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Este triângulo é Equilátero!");
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) { 
				System.out.println("Este triângulo é Isósceles!");
			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System.out.println("Este triângulo é Escaleno!");
			}
			
		} else {
				System.out.println("Não forma um triângulo");
				}
		
		scanner.close();
	}
}