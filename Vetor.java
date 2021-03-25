package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.print("Quantos numeros voce vai digitar? ");
		num = sc.nextInt();

		double[] vet = new double[num];

		for (int i = 0; i < num; i++) {
			System.out.println("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		System.out.println();
		System.out.println("NUMEROS DIGITADOS: ");
		for (int i = 0; i < num; i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}

		sc.close();
	}

}
