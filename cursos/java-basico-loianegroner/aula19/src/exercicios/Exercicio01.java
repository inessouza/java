package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// 1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho
		//  e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]. 
		
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b = new int[5];
		
		for (int i = 0; i <= 4; i++) {
		System.out.print("Digite um valor: ");
			a[i] = scanner.nextInt();
			b[i] = a[i];
		}
		
		String palavra = "";
		String palavraB = "";
		
		for (int i = 0; i <= 4; i++) {
			if (i == 0) {
				palavra = palavra + " " + Integer.toString(a[i]);
				palavraB = palavraB + " " + Integer.toString(b[i]);
			}
			palavra = palavra + " | " + Integer.toString(a[i]);			
			palavraB = palavraB + " | " + Integer.toString(b[i]);
			// System.out.println(palavra);
		}
		System.out.println("\nA: [" + palavra + " ]");
		System.out.println("B: [" + palavraB + " ]");
			
		scanner.close();
	}
}