package exercícios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// Faça um programa que faça cinco perguntas para uma pessoa 
		// sobre um crime. As perguntas são:
		// a) Telefonou para a vítima?
		// b) Esteve no local do crime?
		// c) Mora perto da vítima?
		// d) Devia para a vítima?
		// e) Já trabalhou com a vítima?
		
		// O programa deve no final emitir uma classificação sobre a 
		// participação da pessoa no crime. Se a pessoa responder 
		// positivamente a 2 questões ela deve ser classificada como
		// "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
		// Caso contrário, ele será classificado como "Inocente".
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- INVESTIGADOR DIGITAL -----");
		System.out.print("\nTelefonou para a vítima? ");
		String resposta1 = scanner.next();
		
		System.out.print("Esteve no local do crime? ");
		String resposta2 = scanner.next();
		
		System.out.print("Mora perto da vítima? ");
		String resposta3 = scanner.next();
		
		System.out.print("Devia para a vítima? ");
		String resposta4 = scanner.next();
		
		System.out.print("Já trabalhou com a vítima? ");
		String resposta5 = scanner.next();
				
		int soma = 0;
		
		if (resposta1.equalsIgnoreCase("Sim")) {
			soma++;
		} if (resposta2.equalsIgnoreCase("Sim")) {
			soma++;
		} if (resposta3.equalsIgnoreCase("Sim")) {
			soma++;
		} if (resposta4.equalsIgnoreCase("Sim")) {
			soma++;
		} if (resposta5.equalsIgnoreCase("Sim")) {
			soma++;
		}
		
		if (soma == 2) {
			System.out.println("\nEsta pessoa é suspeita!");
		} else if (soma == 3 || soma == 4) {
			System.out.println("\nEsta pessoa é cumplice!");
		} else if (soma == 5) {
			System.out.println("\nEsta pessoa é o assassino!");
		} else if (soma == 0 || soma == 1) {
			System.out.println("\nEsta pessoa é inocente!");
		}
		
		scanner.close();
	}
}