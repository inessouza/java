package aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		// For "normal"
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de I: " + i);
		}
		
		for (int i = 5; i > 0; i--) {
			System.out.println("Valor de I: " + i);
		}
		
		// For com mais de uma variável
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("I = " + i + "; J = " + j);
		}
		
		// For com partes ausentes
		int count = 0;
		for ( ; count < 10 ; ) {
			System.out.println("Valor de Count: " + count);
			count += 2;
		}
		
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("Valor de Cont: " + cont);
		}
		
		// For sem corpo
		// Apenas um exemplo, pois usar chaves para definir o bloco é uma boa prática de programação

		int soma = 0;
		for (int i = 0; i < 5; soma += i++);
		System.out.println("O valor da soma é " + soma);		
	}
}