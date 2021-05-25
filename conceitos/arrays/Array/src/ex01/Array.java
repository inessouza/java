package ex01;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.println("\t\t Cadastro de Alunos");
		
		String[] alunos = new String[5];
		
		Scanner teclado = new Scanner(System.in);
		
		// System.out.println(alunos.length);
		
		for(int i = 0; i < alunos.length; i++) {
			
			System.out.println(" Digite o "+(i+1)+"º aluno: ");
			alunos[i] = teclado.nextLine();
		}
		
		System.out.println("\n\t\tAlunos Cadastrados: ");
		for(int i = 0; i < alunos.length; i++) {
			System.out.println((i+1)+"º aluno(a): " + alunos[i]);
		}
	}
}
