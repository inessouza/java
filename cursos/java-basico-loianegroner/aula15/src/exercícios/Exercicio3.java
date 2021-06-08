package exercícios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um programa que verifique se a letra digitada é "F" ou "M". 
		// Conforme a letra escrever: F - Feminino, M - Másculino, Sexo Inválido!

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o sexo F ou M: ");
		String letra = scanner.nextLine();
		
		if (letra.equalsIgnoreCase("F")) {
			System.out.println("Sexo F - Feminino");
		} else if (letra.equalsIgnoreCase("M")){
			System.out.println("Sexo M - Másculino");
		} else {
			System.out.println("Sexo Inválido!");
		}
		scanner.close();
	}
}