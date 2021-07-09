package exercicios;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		// O cardápio de uma lanchonete é o seguinte: 
		// Especificação     |     Código     |     Preço
		// Cachorro Quente   |      100       |      1,20
		// Bauru Simples     |      101       |	     1,30
		// Bauru com Ovo     |      102       |      1,50
		// Hambúrguer        |      103       |      1,20
		// Cheeseburguer     |      104       |      1,30
		// Refrigerante      |      105       |      1,00
		
		// Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre
		// o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente
		// deve informar quando o pedido deve ser encerrado.
		
		Scanner scanner = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int codigo, quantidade;
		double total = 0;
		String saida = "";
		
		do {
			System.out.print("Digite o código e a quantidade ou Digite 0 0 para sair:");
			codigo = scanner.nextInt();
			quantidade = scanner.nextInt();
		
		if (codigo == 0 && quantidade == 0) {
			naoTerminar = false;
			saida += "Total a pagar: " + total;
		} else {
			if (codigo == 100) {
				saida += "Cachorro Quente -> 1,20 * " + quantidade;
				saida += " = " + (1.2 * quantidade) + "\n";
				total += 1.20 * quantidade;
			} else if (codigo == 101) {
				saida += "Bauru Simples -> 1,30 * " + quantidade;
				saida += " = " + (1.3 * quantidade) + "\n";
				total += 1.30 * quantidade;
			} else if (codigo == 102) {
				saida += "Bauru com Ovo -> 1,50 * " + quantidade;
				saida += " = " + (1.5 * quantidade) + "\n";
				total += 1.50 * quantidade;
			} else if (codigo == 103) {
				saida += "Hambúrguer -> 1,20 * " + quantidade;
				saida += " = " + (1.2 * quantidade) + "\n";
				total += 1.20 * quantidade;
			} else if (codigo == 104) {
				saida += "Cheeseburguer -> 1,30 * " + quantidade;
				saida += " = " + (1.3 * quantidade) + "\n";
				total += 1.30 * quantidade;
			} else if (codigo == 105) {
				saida += "Refrigerante -> 1,00 * " + quantidade;
				saida += " = " + (1 * quantidade) + "\n";
				total += 1 * quantidade;
			}
		}
			
		} while(naoTerminar);
		
		System.out.println(saida);
		scanner.close();
	}
}