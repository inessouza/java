package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário: 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base do quadrado: ");
		int base = scanner.nextInt();
		
		int area = base * base;
		
		int dobro = area * 2;
		
		System.out.println("O dobro da área do quadrado é " + dobro);
		
		scanner.close();
	}
}