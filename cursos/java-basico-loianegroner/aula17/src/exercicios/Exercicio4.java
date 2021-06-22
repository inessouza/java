package exercicios;

public class Exercicio4 {

	public static void main(String[] args) {
		// Supondo que a população de um pais A seja da ordem de 80000
		// habitantes com uma taxa anual de crescimento de 3% e que a 
		// população de B seja 200000 habitantes com uma taxa de crescimento
		// de 1.5%. Faça um programa que calcule e escreva o número de anos
		// necessários para que a população do país A ultrapasse ou igual a
		// população do pais B, mantidas as taxas de crescimento:
		
		int paisA = 80000;
		int paisB = 200000;
		int anos = 0;
		
		while (paisA < paisB) {
			paisA += (paisA / 100) * 3;
			paisB += (paisB / 100) * 1.5;
			anos++;
		}
		
		System.out.println("País A: " + paisA);
		System.out.println("País B: " + paisB);
		System.out.println("Quantidade de anos: " + anos);
	}
}