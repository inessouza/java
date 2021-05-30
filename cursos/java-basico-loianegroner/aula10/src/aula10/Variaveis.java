package aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		// Convenção Java: 
		int idade = 32;
		String nome = "Inês";
		String nomeDoMeuCachorro = "Totó";
		
		// aceitas, mas não são utilizadas:
		int _idade;
		int $idade;
		
		// variáveis que não são da convenção java: 
		
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
	
		System.out.println("Nome: " + nome + " Idade: " + idade);
		
		// Má prática:
		int a = 10;
		String b = "Loiane";
		
		// Sempre temos que dar nomes as variáveis que tenham significado.
	}

}
