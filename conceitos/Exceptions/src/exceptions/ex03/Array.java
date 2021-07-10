package exceptions.ex03;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

        System.out.println("\t\t Exercício Exceptions ");

        // criação da array
        int[] array = new int[5];

        // inserção dos valores. Pode ser feito em loop
        array[0] = 0;
        array[1] = 10;
        array[2] = 20;
        array[3] = 30;
        array[4] = 40;

        // Criando a variável que receberá o índice
        int numeroIndice = 0;

        // O objeto que vai receber o valor que contém o número do índice
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o numero do índice do array: ");
        numeroIndice = scanner.nextInt(); 
        
        try {
            System.out.println(array[numeroIndice]);
        } catch(ArrayIndexOutOfBoundsException error) {

            System.out.println(error.getMessage());

            System.out.println("Atenção! Digite novamente e que seja um valor abaixo de 5: ");
            numeroIndice = scanner.nextInt();

            while(numeroIndice > 4) {
                System.out.println("Atenção! Digite novamente e que seja um valor abaixo de 5: ");
                numeroIndice = scanner.nextInt();
            }

            System.out.println(array[numeroIndice]);
        }
        scanner.close();
    }
}