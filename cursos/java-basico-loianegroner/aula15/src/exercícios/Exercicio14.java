package exercícios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Faça um programa que leia as duas notas parciais obtidas por um aluno
		// numa disciplina ao longo de um semestre e calcule a sua média.
		// A atribuição de conceitos obedece a tabela abaixo:
		
		// Média de Aproveitamento        |        Conceito
		// Entre 9 e 10				      | 		  A
		// Entre 7.5 e 9                  |           B
		// Entre 6 e 7.5                  |           C
		// Entre 4 e 6                    |           D
		// Entre 0 e 4                    |           E
		
		// O algoritmo deve mostrar na tela as notas, a média, o conceito 
		// correspondente e a mensagem "APROVADO" se o conceito for A, B ou C
		// ou "REPROVADO" se o conceito for D ou E:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("\nDigite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String conceito = "";
		if (media >= 9 && media <= 10) {
			conceito = "A";
		} else if (media >= 7.5 && media < 9) {
			conceito = "B";
		} else if (media >= 6 && media < 7.5) {
			conceito = "C";
		} else if (media >= 4 && media < 6) {
			conceito = "D";
		} else if (media >= 0 && media < 4) {
			conceito = "E";
		}
		
		System.out.println("\nPrimeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		
		switch(conceito) {
		case "A": 
		case "B": 
		case "C": System.out.println("APROVADO"); 
		break;
		case "D": 
		case "E": System.out.println("REPROVADO");
		break;
		}
		
		scanner.close();
	}
}
