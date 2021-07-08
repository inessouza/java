package exercicios;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// O Departamento Estadual de Metereologia lhe contratou para desenvolver um programa
		// que leia um conjunto indeterminado de de temperaturas, e informe ao final a menor e
		// a maior temperatura informada, bem como a média das temperaturas:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de temperaturas: ");
		int quantidadeTemperaturas = scanner.nextInt();
		
		double temperatura;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for(int i = 1; i <= quantidadeTemperaturas; i++) {
			System.out.print("Digite a " + i + "ª temperatura: ");
			temperatura = scanner.nextDouble();
			
			soma += temperatura;
			
			if (temperatura > maior) {
				maior = temperatura;
			}
			
			if (temperatura < menor) {
				menor = temperatura;
			}
		}
		
		System.out.println("Média: " + (soma / quantidadeTemperaturas));
		System.out.println("Menor Temperatura: " + menor);
		System.out.println("Maior Temperatura: " + maior);
		
		scanner.close();
	}
}