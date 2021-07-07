package exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de R$1,99
		// e agora possui uma loja de conveniências. Faça um programa que implemente uma
		// caixa registradora rudimentar. O programa deverá receber um número desconhecido
		// de valores referentes aos preços das mercadorias. Um valor zero deve ser informado 
		// pelo operador para indicar o final da compra. O programa deve então mostrar o total 
		// da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular
		// e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto 
		// inicial, para registrar a próxima compra:
		
		Scanner scanner = new Scanner(System.in);
		
		// System.out.print("\tLojas Tabajara");
		
		boolean sair = false;
		String continuarCompra;
		int quantidadeProdutos;
		double preco;
		double total;
		String saida;
		double valorCliente, troco;
		
		do {
			
			System.out.print("Deseja informar uma nova compra? S/N ");
			continuarCompra = scanner.next();
			
			if (continuarCompra.equalsIgnoreCase("S")) {
				
				saida = "\tLojas Tabajara\n";
				
				System.out.print("Digite a quantidade de produtos: ");
				quantidadeProdutos = scanner.nextInt();
				
				total = 0;
				
				for (int i = 1; i <= quantidadeProdutos; i++) {
					System.out.print("Informe o preço do " + i + "º produto: ");
					preco = scanner.nextDouble();
					total += preco;
					saida += "Produto " + i + ": R$ " + preco + "\n";
				}
				
				saida += "Total R$" + total; 
				
				System.out.println("Total R$" + total);
				
				System.out.println("Digite o valor fornecido pelo cliente: ");
				valorCliente = scanner.nextDouble();
				
				saida += "\nDinheiro R$" + valorCliente + "\n";
				
				troco = valorCliente - total;	
				
				saida += "Troco: R$" + troco;
				
				System.out.println(saida);
				
			} else {
				sair = true; 
			}
			
		} while (!sair);
		
		scanner.close();
	}
}