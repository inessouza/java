package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um programa que peça uma nota, entre zero e dez.
		// Mostre uma mensagem caso o valor seja inválido e continue
		// pedindo até que o usuário informe um valor válido:
		
		Scanner scanner = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.print("Digite a nota entre zero e dez: ");
			double nota = scanner.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				System.out.println("Valor Inválido! Por favor, digite novamente.");
			}
		
		} while (!notaValida);
		
		scanner.close();
	}
}