package ex08;

public class ArrayMethodMain {

	public static void main(String[] args) { // static deixa o método exclusivo para a Classe
		
		/* Vetor do tipo int[]/double quando não inicializados tem o valor = 0
		/* Vetor do tipo String[] quando não inicializados tem o valor = null
		 * Vetor do tipo boolean[] quando não inicializados tem o valor = false
		 */
		
		String[] pessoasPrincipal = new String[5];
		
		inserirDados(pessoasPrincipal, "Fulano A"); // [null, null, null, null, null] , "Fulano A"
		System.out.println(pessoasPrincipal[0]);   // ["Fulano A", null, null, null, null]
		inserirDados(pessoasPrincipal, "Fulano B"); // ["Fulano A", null, null, null, null] "Fulano B"
		System.out.println(pessoasPrincipal[1]);   // ["Fulano A", "Fulano B", null, null, null] 
		inserirDados(pessoasPrincipal, "Fulano C"); // ["Fulano A", "Fulano B", null, null, null] "Fulano C"
		System.out.println(pessoasPrincipal[2]);   // ["Fulano A", "Fulano B", "Fulano C", null, null] 
		inserirDados(pessoasPrincipal, "Fulano D"); // ["Fulano A", "Fulano B", null, null, null] "Fulano D"
		System.out.println(pessoasPrincipal[3]); // ["Fulano A", "Fulano B", "Fulano C", "Fulano D", null] 
		inserirDados(pessoasPrincipal, "Fulano E"); // ["Fulano A", "Fulano B", "Fulano C", null, null] "Fulano D"
		System.out.println(pessoasPrincipal[4]); // ["Fulano A", "Fulano B", "Fulano C", "Fulano D", null] 
		inserirDados(pessoasPrincipal, "Fulano F");
		
		
		/*for(String pessoa : pessoasPrincipal) {
			System.out.println(pessoa);
		}*/
		

	}
	
	public static void inserirDados(String[] pessoasLocal, String nome) {

		for(int i = 0; i < pessoasLocal.length; i++) {
			if(pessoasLocal[i]  == null) {
				pessoasLocal[i] = nome;
				break; // interrompe o que está ocorrendo no loop
			
			} 
			if(pessoasLocal[4] != null) { // (pessoasLocal[pessoasLocal.length - 1] != null)
				System.out.println("O vetor está cheio!");
				break;
			}
		}		
	}
}
