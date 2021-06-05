package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que peça um número e então mostre a mensagem O número informado foi [numero]:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int numero = scanner.nextInt();
		
		System.out.println("O número informado foi: " + numero);
		
		scanner.close();
	}
}