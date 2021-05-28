package ex04;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		System.out.println("1. Faça um algoritmo que imprima todos os números inteiros de 1 a N (fornecido pelo usuário). ");
		
		int n; 
		
		System.out.println("\nDigite um número: ");
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
