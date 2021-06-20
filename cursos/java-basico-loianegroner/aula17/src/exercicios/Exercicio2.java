package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que leia um nome de usuário e a sua senha
		// e não aceite a senha igual ao nome do usuário, mostrando uma
		// mensagem de erro e voltando a pedir informações:
		
		Scanner scanner = new Scanner(System.in);
		
		boolean informacoesValidas = false;
		do {
			System.out.println("Digite o nome do usuário: ");
			String nome = scanner.nextLine();
			
			System.out.println("Digite a senha: ");
			String senha = scanner.nextLine();
			
			if (nome.equalsIgnoreCase(senha)) {
				informacoesValidas = false;
				System.out.println("Senha igual a usuário, digite novamente.");
			} else {
				informacoesValidas = true;
				System.out.println("Senha e Usuários Válidos");
			}
		} while (!informacoesValidas);
		
		scanner.close();
	}
}
