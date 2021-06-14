package exercícios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// Faça um programa que leia dois números e em seguida pergunte
		// ao usuário qual operação ele deseja realizar. O resultado da 
		// operação deve ser acompanhado de uma frase que diga se o número
		// é par ou impar e positivo ou negativo:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero1 = scanner.nextDouble();
		
		System.out.println("Digite outro número: ");
		double numero2 = scanner.nextDouble();
		
		System.out.println("Qual operação você deseja realizar? (+ - / *): ");
		String operacao = scanner.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+": resultado = numero1 + numero2;
		break;
		
		case "-": resultado = numero1 - numero2;
		break;
		
		case "/": resultado = numero1 / numero2;
		break;
		
		case "*": resultado = numero1 * numero2;
		break;
		
		default: System.out.println("Operação Inválida!"); 
		valida = false;
		}
		
		if (valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0 ) {
				System.out.println("O número " + resultado + " é positivo!");
			} else {
				System.out.println("O número " + resultado + " é negativo!");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("O número " + resultado + " é par!");
			} else {
				System.out.println("O número " + resultado + " é impar!");
			}
		}	
		scanner.close();
	}
}