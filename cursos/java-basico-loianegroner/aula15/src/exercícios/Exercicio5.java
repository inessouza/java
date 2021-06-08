package exercícios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Faça um programa para a leitura de duas notas parciais de um aluno.
		// O programa deve calcular a média alcançada por aluno e apresentar:
		// - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		// - A mensagem "Reprovado" se a média for menor do que sete;
		// - A mensagem"Aprovado com Distinção", se a média for igual a dez.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("\nSua média é: " + media);
		
		if (media == 10) {
			System.out.println("\nAprovado com Distinção. Parabéns!");
		} else if (media < 7) {
			System.out.println("\nReprovado!");
		} else if (media >= 7) {
			System.out.println("\nAprovado!");
		}
		scanner.close();
	}
}