package exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Faça um programa que peça o tamanho de uma arquivo para download (em MB) e a velocidade
		// de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo
		// usando este link (em minutos):
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB: ");
		int mb = scanner.nextInt();
		
		System.out.println("Digite a velocidade da Internet: ");
		int velocidade = scanner.nextInt();
		
		int tempoDownload = mb / velocidade;
		
		System.out.println("A estimativa de tempo deste download é: " + tempoDownload + " Minutos");
		
		scanner.close();
	}
}