package ex08;

public class Array {

	public static void main(String[] args) {
		String alunos[] = new String[5];
		
		alunos[0] = "Aluno 1";
		alunos[1] = "Aluno 2";
		alunos[2] = "Aluno 3";
		alunos[3] = "Aluno 4";
		alunos[4] = "Aluno 5";
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("\n Alunos em Ordem de Cadastro: "+alunos[i]);
		}
		
		for(int i = 4; i >= 0; i--){ // alunos.length-1 outra forma de acessar o último indice do array
            System.out.println("\n Alunos na Ordem Inversa: " +alunos[i]);
        }
	}
}
