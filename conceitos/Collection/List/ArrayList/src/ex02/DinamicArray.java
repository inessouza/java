package ex02;

import java.util.ArrayList;

public class DinamicArray {

	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<String>();
		
		alunos.add("Aluno 1"); alunos.add("Aluno 2");
		alunos.add("Aluno 3"); alunos.add("Aluno 4");
		alunos.add("Aluno 5");
		
		for(int i = 0; i < alunos.size(); i++) {
			
			System.out.println((i+1)+ "º Aluno: "+alunos.get(i));
		}
		
		alunos.remove("Aluno 2");
		alunos.remove("Aluno 3");
		alunos.remove("Aluno 4");
		alunos.remove("Aluno 5");
		
			System.out.println("Aluno que sobrou: " +alunos.get(0));
	}
}