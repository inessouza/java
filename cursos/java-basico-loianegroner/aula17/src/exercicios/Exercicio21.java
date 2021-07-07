package exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// Faça um programa que calcule o número médio de alunos por turma.
		// Para isto, peça a quantidade de turmas e a quantidade de alunos 
		// para cada turma. As turmas não poderão ter mais de 40 alunos:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número de turmas: ");
		int turmas = scanner.nextInt();
		
		int alunos;
		int soma = 0;
		boolean invalido = true;
		
		for (int i = 1; i <= turmas; i++) {
			
			invalido = true;
			do {
				System.out.print("Digite o número de alunos da " + i + "ª turma: ");
				alunos = scanner.nextInt();
				
				if (alunos <= 40) {
					invalido = false;
			
				} else {
					System.out.println("Número de alunos invalido! Digite novamente.");
				}
			} while (invalido);
			
			soma = soma + alunos;
		}
		
		double media = soma / turmas;
		
		System.out.println("Média: " + media);
		scanner.close();
	}
}