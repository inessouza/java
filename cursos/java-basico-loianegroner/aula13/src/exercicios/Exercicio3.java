package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um programa que peça dois números e imprima a soma: 
		
		Scanner scanner = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Digite um número: ");
		numero1 = scanner.nextInt();
		
		System.out.println("Digite outro número: ");
		numero2 = scanner.nextInt();
		
		System.out.println("A soma dos números digitados é: " + (numero1 + numero2));
		
		scanner.close();
	}
}