package exceptions.ex01;

public class Array {
	
	public static void main(String [] args) {
		// tamanho 4 de 0 até 3, ou seja, é n-1
		
		System.out.println("\t\tInício");
		
		try {
		int[] vetor = new int[4];
		
		vetor[4] = 1;
		
		System.out.println("Essa parte não aparecerá!");
		
		} catch(ArrayIndexOutOfBoundsException objetoErro) {
			
			System.out.println("\nEssa parte aparece. O erro será tratado daqui pra frente! ");
			
			System.out.println(objetoErro.getMessage());
		}
	}
}