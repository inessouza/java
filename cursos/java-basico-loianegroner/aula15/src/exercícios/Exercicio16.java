package exercícios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// Faça um programa que calcule as raízes de uma equação do segundo grau,
		// na fórmula ax2 + bx + c. O programa deverá pedir os valores de a, b e c 
		// e fazer as consistências, informando ao usuário nas seguintes situações:
		//
		// a) Se o usuário informar o valor de A igual a zero, a equação não é do 
		// segundo grau e o programa não deve pedir os demais valores, sendo encerrado;
		// b) Se o delta calculado for negativo, a equação não possui raízes reais.
		// Informe ao usuário e encerre o programa.
		// c) Se o delta calculado for igual a zero a equação possui apenas uma raíz
		// real. Informe ao usuário;
		// d) Se o delta for positivo, a equação possui duas raízes reais. 
		// Informe ao usuário;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int a = scanner.nextInt();	
		
		if (a == 0) {
			System.out.print("Não é equação de segundo grau!");
		} else {
			System.out.print("Digite o valor de B: ");
			int b = scanner.nextInt();
			
			System.out.print("Digite o valor de C: ");
			int c = scanner.nextInt();
			
			double delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("\nDelta Negativo!");
			} else {
				
				System.out.println("\nO valor de delta é: " + delta);
				
				double x1 = ((- b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((- b) - Math.sqrt(delta)) / (2*a);
				
				System.out.println("\nx1 = " + x1);
				System.out.println("x2 = " + x2);
			}
			scanner.close();
		} 
	}
}