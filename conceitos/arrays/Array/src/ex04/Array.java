package ex04;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
			System.out.println("\t\t Cadastro de Alunos");
			
			int quantidadeAlunos = 0;
			Scanner tecladoInt = new Scanner(System.in);
			
			System.out.println("\n Digite a quantidade de alunos: ");
			quantidadeAlunos = tecladoInt.nextInt();
			
			String[] alunos = new String[quantidadeAlunos];
			
			Scanner teclado = new Scanner(System.in);
			
			// System.out.println(alunos.length);
			
			int i = 0;
			
			while(i < quantidadeAlunos) {
				System.out.println("Digite o "+(i+1)+"º aluno: ");
				alunos[i] = teclado.nextLine();
				i++;
;			}
			
			System.out.println("\n\t\t Alunos Registrados");
			i = 0;
			while (i < quantidadeAlunos) {
				System.out.println((i+1)+ "º aluno(a): " +alunos[i]);
				i++;
			}
			
			System.out.println("\n\t\tTotal de alunos registrados: "+i);
			
		}
}
