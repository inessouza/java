package ex01;

import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		
		// String pessoas[] = new String[3]; // Se criar pessoas em um vetor comum e também pessoas em um vetor ArrayList, ocorrerá conflito
		
		/* ArrayList:
		 * 		Permite o dinamismo do Array/Vetor de forma que o seu tamanho possa ser ajustado 
		 * 		Dentro '<' e '>' fica o tipo;
		 * 		O ArrayList faz parte da família List. 
		 */
		
		ArrayList<String> pessoas = new ArrayList<String>();
		
		pessoas.add("Fulano A"); pessoas.add("Fulano B");
		pessoas.add("Fulano C"); pessoas.add("Fulano D");
		pessoas.add("Fulano E"); pessoas.add("Fulano F");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println((i+1)+"ª Pessoa: "+pessoas.get(i));
		}
	}
}
