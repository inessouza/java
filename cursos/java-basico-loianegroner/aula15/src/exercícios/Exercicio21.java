package exercícios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		// Álcool:
		// a) até 20 litros, desconto de 3% por litro;
		// b) acima de 20 litros, desconto de 5% por litro
		// Gasolina: 
		// c) até 20 litros, desconto de 4% por litro
		// d) acima de 20 litros, desconto de 6% por litro.
		// Escreva um algoritmo que leia o número de litros vendidos,
		// o tipo de combustível (codificado da seguinte forma: A - álcool
		// G - Gasolia), calcule e imprima o valor a ser pago pelo cliente,
		// sabendo-se que o preço do litro da gasolina é R$2,50, o preço do
		// litro do álcool é R$1,90:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos litros você deseja comprar? ");
		double litros = scanner.nextDouble();
		
		System.out.println("Você deseja comprar álcool ou gasolina? Digite A para álcool ou G para gasolina: ");
		String combustivel = scanner.next();
		
		final double precoAlcool = 1.90;
		final double precoGasolina = 2.50; 
		int desconto = 0;
		double total = 0;
		double totalDesconto = 0;
		
		if (combustivel.equalsIgnoreCase("A")) {
			if (litros <= 20) {
				desconto = 3;
			} else {
				desconto = 5;
			}
			
			total = litros * precoAlcool;
			
		} else if (combustivel.equalsIgnoreCase("G")) {
			if (litros <= 20) {
				desconto = 4;
			} else {
				desconto = 6;
			}
			
			total = litros * precoGasolina;
		}
		
		totalDesconto = (total / 100) * desconto;	
		
		double precoPagamento = total - totalDesconto;
		
		System.out.println("Valor a ser pago: " + precoPagamento);
		
		scanner.close();
	}
}