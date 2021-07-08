package exercicios;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		// Encontrar números primos é uma tarefa difícil. Faça um programa que gere
		// uma lista de números primos existentes entre 1 e um número inteiro que o  
		// usuário informar:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		boolean primo = true;
		
		for (int i = 1; i <= numero; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.println(i);
			}
			scanner.close();
		}
	}
}