package ex01;

import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		System.out.println("Faça uma função que recebe por parâmetro o "
							+ "raio de uma esfera e calcula o\r\n" 
							+ "seu volume (v = 4/3.P .R^3)");
		
		double raio;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		raio = scanner.nextInt();
		
		
		// function return value, but procedure don't return value 
		System.out.println("\nTeste função: " +volume(raio));
	}

	public static double volume(double r) {
		
		final double pi = 3.1415; // final = constant value
		
		double result = (4.0 / 3.0 * pi) * (Math.pow(r, 3));
		
		return result;
	}
}
