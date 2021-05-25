package ex05;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.println("\t\t Exercício Array ");
		
		int soma = 0;
        
        int quantPosicoes = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n\t Digite a quantidade de posições do array: ");
        quantPosicoes = scanner.nextInt();

        int[] array = new int[quantPosicoes];
        
        int i = 0;
        
        while(i < quantPosicoes) {
        	System.out.println("\n\tDigite a "+(i+1)+"ª posição do Array: ");
        	array[i] = scanner.nextInt();
        	i++;
        }
        
        System.out.println("\n Posições Registradas: ");
		i = 0;
		while (i < quantPosicoes) {
			System.out.println("Valor da " +(i+1)+ "ª posição: " +array[i]);
			soma = soma + array[i];
			i++;
		}

		System.out.println("Soma dos valores registrados: "+ soma);
	}
}
