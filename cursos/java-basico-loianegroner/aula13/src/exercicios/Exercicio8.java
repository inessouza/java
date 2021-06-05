package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Faça um programa que pergunte quanto uma pessoa ganha 
		// por hora e o número de horas trabalhadas no mês. 
		// Calcule e mostre o total do salário no referido mês:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora trabalhada: ");
		double hora = scanner.nextDouble();
		
		System.out.println("Digite o total de horas trabalhadas no mês: ");
		double totalHoras = scanner.nextDouble();
		
		double salario = hora * totalHoras;
		
		System.out.println("O salário deste mês será: R$"+salario);
		
		scanner.close();
	}
}