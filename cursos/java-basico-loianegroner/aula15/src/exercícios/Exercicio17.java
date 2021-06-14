package exercícios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// Faça um programa que peça um número correspondente a um determinado
		// ano e em seguida informe se este ano é ou não bissexto:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = scanner.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("O ano de " + ano + " é bissexto!");
		} else {
			System.out.println("O ano de " + ano + " não é bissexto!");
		}
		
		scanner.close();
	}
}