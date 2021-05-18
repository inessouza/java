package excecoes.ex02;

import java.util.Scanner;

public class ErroCalculo {
	
	/* Tratamento do ArithmeticException
	 * 
	 * dividendo / divisor
	 *    2 / 2       =         1
	 *    
	 *    2 / 0       = infinito ou indeterminado
	 */	
	
	public static void main(String [] args) {
		
		System.out.println("\t\t Divisor de números");
		
		int dividendo;
		int divisor;
		int verificador = 1;
		
		Scanner entradaTipoInteiro = new Scanner(System.in);
		
		
			while(verificador == 1) {
				
				
				try {
				System.out.print("Digite o dividendo: ");
				dividendo = entradaTipoInteiro.nextInt();
				
				System.out.print("\nDigite o divisor: ");
				divisor = entradaTipoInteiro.nextInt();
				
				System.out.println("\n" +dividendo+ " / " +divisor+ " = "+(dividendo/divisor));
				
				System.out.print("\n Deseja continuar com a divisão?"
						+ "\n Caso Sim, digite 1"
						+ "\n Caso Não, digite qualquer número: ");
				
				verificador = entradaTipoInteiro.nextInt();
				
		
			}catch(ArithmeticException erro) {
			
				System.out.println("\n Mensagem de Erro"+erro.getMessage());
				System.out.println("\n Ops! Zero não pode ser o divisor! Por gentileza tente novamente!");
			
			}
		
		}
		
		System.out.print("\n\n Muito obrigado por utilizar a nossa aplicação!");
	}
}
