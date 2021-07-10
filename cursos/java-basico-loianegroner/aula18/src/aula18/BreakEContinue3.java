package aula18;

import java.util.Scanner;

public class BreakEContinue3 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		int num = scanner.nextInt();
		
		System.out.print("Entre com um limite: ");
		int max = scanner.nextInt();
		
		for (int i = num; i <= max; i++) {
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}
		scanner.close();		
	}
}