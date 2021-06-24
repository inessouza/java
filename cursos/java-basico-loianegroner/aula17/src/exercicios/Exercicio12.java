package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Desenvolva um gerador de tabuada, capaz de gerar a tabuada
		// de qualquer número inteiro entre 1 a 10. O usuário deve informar
		// de qual número ele deseja ver a tabuada:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número o qual você deseja ver a tabuada: ");
		int numero = scanner.nextInt();
		
		int produto = 0;
		for (int i = 1; i <= 10; i++) {
			produto = numero * i;
			System.out.println(numero + " X " + i + " = " + produto);
		}
		scanner.close();
	}
}