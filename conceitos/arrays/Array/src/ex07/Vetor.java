package ex07;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		int Inteiros[] = new int[6];
		
		System.out.println("Crie um programa que lê seis valores inteiros e, em seguida, mostre na tela os valores lidos: ");
		
		Scanner scanner = new Scanner(System.in);
		Inteiros[0] = scanner.nextInt();
		Inteiros[1] = scanner.nextInt();
		Inteiros[2] = scanner.nextInt();
		Inteiros[3] = scanner.nextInt();
		Inteiros[4] = scanner.nextInt();
		Inteiros[5] = scanner.nextInt();
		
		System.out.println("\n Os valores armazenados são: " 
				+ Inteiros[0] + ", " + Inteiros[1] + ", " + Inteiros[2] + ", "
				+ Inteiros[3] + ", " + Inteiros[4] + ", " + Inteiros[5]				
		);
		
		scanner.close();
	}
}