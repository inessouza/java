package ex02;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		System.out.println("\t\t Cadastro de Alunos");
		
		String[] alunos = new String[5];
		
		Scanner teclado = new Scanner(System.in);
		
		// System.out.println(alunos.length);
		
		int i = 0;
		for(String indice : alunos) {
			System.out.println("Digite o "+(i+1)+"º aluno(a):");
			alunos[i] = teclado.nextLine();
			i++;
		}		
		
		i=0;
		System.out.println("\n\t\tOs alunos(as) cadastrados");
		
		for(String indice : alunos) {
			System.out.println((i+1)+"º aluno(a): "+indice);
		}
	}	
}