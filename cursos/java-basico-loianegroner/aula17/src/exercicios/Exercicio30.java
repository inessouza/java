package exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		// Desenvolva um programa que faça a tabuada de um número qualquer inteiro que
		// será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1
		// e terminar em 10, o valor inicial e o final devem ser informados também pelo usuário:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número o qual você deseja ver a tabuada: ");
		int numero = scanner.nextInt();
		
		int inicio;
		int fim;
		boolean invalido = false;
		int produto = 0;
		
		do {
			System.out.print("Digite o número inicial da tabuada: ");
			inicio = scanner.nextInt();
			
			System.out.print("Digite o número final da tabuada: ");
			fim = scanner.nextInt();
			
			if (fim > inicio) {
				invalido = true;
			}
			
		} while (!invalido);
		
		System.out.println("Tabuada do: " + numero);
		System.out.println("Começar por: " + inicio);
		System.out.println("Terminar em: " + fim);
		
		for (int i = inicio; i <= fim; i++) {
			produto = numero * i;
			System.out.println(numero + " X " + i + " = " + produto);
		}
		scanner.close();
	}
}