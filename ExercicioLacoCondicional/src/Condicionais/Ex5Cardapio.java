package Condicionais;

import java.util.Scanner;

public class Ex5Cardapio {

	public void exibirMenu() {
		System.out.println("===== CARDÁPIO =====");
		System.out.println("1 - Cachorro Quente - R$ 10.00");
		System.out.println("2 - X-Salada        - R$ 15.00");
		System.out.println("3 - X-Bacon         - R$ 18.00");
		System.out.println("4 - Bauru           - R$ 12.00");
		System.out.println("5 - Refrigerante    - R$ 8.00");
		System.out.println("6 - Suco de laranja - R$ 13.00");
	}
	public static void main(String[] args) {
		// Instanciando objetos da classe scanner e metodo exibir menu
		Scanner leia = new Scanner(System.in);
		Ex5Cardapio cardapio = new Ex5Cardapio();
		// Declarando variavel
		int produto, qtde;
		double valorTotal;
		// Imprimindo cardápio
		cardapio.exibirMenu();
		// Escolhendo o produto
		System.out.println("Escolha um produto:");
		produto=leia.nextInt();
		System.out.println("Quantidade deste produto:");
		qtde=leia.nextInt();
		//Implementando switch do menu
		switch (produto) {
		case 1: {
			valorTotal=10*qtde;
			System.out.printf("Produto:Cachorro quente\nValor total: R$ %.2f%n",valorTotal);
			break;
		}
		case 2: {
			valorTotal=15*qtde;
			System.out.printf("Produto:X-Salada\nValor total: R$ %.2f%n",valorTotal);
			break;
		}
		case 3: {
			valorTotal=18*qtde;
			System.out.printf("Produto:X-Bacon \nValor total: R$ %.2f%n",valorTotal);
			break;
		}
		case 4: {
			valorTotal=12*qtde;
			System.out.printf("Produto:Bauru \nValor total: R$ %.2f%n",valorTotal);
			break;
		}
		case 5: {
			valorTotal=8*qtde;
			System.out.printf("Produto:Refrigerante\nValor total: R$ %.2f%n",valorTotal);
			break;
		}case 6: {
			valorTotal=13*qtde;
			System.out.printf("Produto:Suco de laranja \nValor total: R$ %.2f%n",valorTotal);
			break;
		}		
		default:
			System.out.println("Opção inválida!");		
		}
		//fechando scanner
		leia.close();
	}
}
