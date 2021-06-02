package ex03;

import java.util.ArrayList;

public class ArrayListMethodMain {

	public static void main(String[] args) {
		ArrayList<String> lista = new  ArrayList<String>();
		
		// Inserir dados na lista 
		
		inserirDados(lista, "Fulano A"); // [], "Fulano A"
		System.out.println(lista); 		 // ["Fulano A"]
		inserirDados(lista, "Fulano B"); // ["Fulano A"] , "Fulano B"
		System.out.println(lista); 		 // ["Fulano A", "Fulano B"]
		
		// Remover dados da lista 
		removerDados(lista, "Fulano B"); // ["Fulano A", "Fulano B"], "Fulano B"
		System.out.println(lista);		 // ["Fulano A"]
		
		removerDados(lista, "Fulano A"); // ["Fulano A"], "Fulano A"
		System.out.println(lista);		 // []
		
	}									 
	
	public static void inserirDados(ArrayList<String> lista, String nome) {
		
		lista.add(nome);
		
	}
	
	public static void removerDados(ArrayList<String> lista, String nome) {
		lista.remove(nome);
	}
}
