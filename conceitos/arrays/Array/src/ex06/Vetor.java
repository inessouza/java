package ex06;

public class Vetor {

	public static void main(String[] args) {
		int A[] = new int[6]; // 0, 1, 2, 3, 4, 5
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = -7;
		
		int soma = A[0] + A[1] + A[5];
		
		A[4] = 100;
		
		System.out.println(
				"\n Posição 0: " + A[0] + 
				"\n Posição 1: " + A[1] + 
				"\n Posição 2: " + A[2] +
				"\n Posição 3: " + A[3] +
				"\n Posição 4: " + A[4] +
				"\n Posição 5: " + A[5]
		);
	}
}
