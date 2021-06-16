package exercícios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// Uma fruteira está vendendo frutas com a seguinte tabela de preços:
		//
		//                    Até 5kg              |              Acima de 5kg
		// Morango		   R$2,50 por Kg           |              R$2,20 por Kg
		// Maçã            R$ 1,80 por kg          |              R$1,50 por Kg
		//
		// Se o cliente quiser comprar mais de 8Kg em frutas ou o valor total da
		// compra ultrapassar R$25,00, receberá ainda um desconto de 10% sobre 
		// este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos
		// e a quantidade (em Kg) de maçãs adquiridas e escreva o valor a ser pago
		// pelo cliente: 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de Kg de morango: ");
		Double quantidadeMorango = scanner.nextDouble();
		
		System.out.print("Digite a quantidade de Kg de maçã: ");
		Double quantidadeMaca = scanner.nextDouble();
		
		double precoKgMorango = 0;
		
		
		if (quantidadeMorango <= 5) {
			precoKgMorango = 2.50;
		} else {
			precoKgMorango = 2.20;
		} 
		
		double precoKgMaca = 0;
		if (quantidadeMaca <= 5) {
			precoKgMaca = 1.80;
		} else {
			precoKgMaca = 1.50;
		}
		
		double precoTotalMorango = quantidadeMorango * precoKgMorango;
		double precoTotalMaca = quantidadeMaca * precoKgMaca;
		
		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;
		
		if ((quantidadeMorango + quantidadeMaca) > 8 || precoParcial > 25.00) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}
		
		System.out.println("O valor a ser pago será: " + precoTotal);
		scanner.close();
	}
}