package exercícios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Faça um programa que pergunte em que turno você estuda.
		// Peça para digitar: M - Matutino, V - Vespertino ou N - Noturno.
		// Imprima a mensagem "Bom Dia!", "Boa Tarde!", "Boa Noite!" ou "Valor Inválido:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Em qual turno você estuda? Digite M para Matutino, V para Vespertino ou N para Noturno: ");
		String turno = scanner.nextLine();
		
		if(turno.equalsIgnoreCase("M")) {
			System.out.println("Bom Dia!");
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa Tarde!");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor Inválido!");
		}
		scanner.close();
	}
}