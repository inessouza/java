package ex01;

public class Loop {
	
	public static void main(String[] args) {
		
		String[] professores = {"Joao", "Maria"};
		String[] alunos = {"Vitor", "Marina", "Jose", "Vivian", "Marcelo", "Cloud", "Daniel", "Luna", "Isis", "Felipe"};
		
		// (declara indice = 0; enquanto for verdadeira ; incremento do indice)
		
		for(int i = 0; i <= 1; i++) {
			System.out.println("O professor é: " + professores[i]);
			
			for(int j = 0; j <=9; j++) {
				System.out.println("\tO aluno(a) " +alunos[j]);
				
				
				/* 0 min:
	             * 
	             *         1s
	             *         2s
	             *         3s
	             *         4s
	             *         5s
	             *         .
	             *         .
	             *         .
	             *         59s
	             * 
	             * 1 min:
	             * 
	             * 
	             * 
	             * 
	             * 
	             */
			}
		}
	}

}
