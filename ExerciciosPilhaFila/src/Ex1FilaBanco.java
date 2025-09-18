import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1FilaBanco {

	public static void main(String[] args) {
		// Instânciando Scanner
		Scanner sc = new Scanner(System.in);
		// Declarando collections
		Queue<String> fila = new LinkedList<String>();

		// Declarando variaveis
		int opcao;
		String nome;

		do {
			// Exibindo menu
			System.out.println("********************************************");
			System.out.println("   1 - Adicionar Cliente na Fila");
			System.out.println("   2 - Listar todos os Clientes");
			System.out.println("   3 - Retirar Cliente da Fila");
			System.out.println("   4 - Limpar Fila");
			System.out.println("   5 - Buscar na fila");
			System.out.println("   0 - Sair");
			System.out.println("********************************************");
			System.out.print("Entre com a opção desejada: ");
			while (!sc.hasNextInt()) {  // enquanto não for inteiro
	            System.out.println("Entrada inválida! Digite apenas números inteiros.");
	            sc.next(); // descarta o valor inválido
	            System.out.print("Digite um número inteiro: ");
	        }
			opcao=sc.nextInt();

			// Entrando nas opcoes do swith case
			switch (opcao) {

			case 1: {
				System.out.println("Digite seu nome: ");
				nome = sc.next();
				fila.add(nome);
				System.out.println("Cliente adicionado na fila!");
				break;
			}
			case 2: {
				if (fila.isEmpty() == true) {
					System.out.println("Fila está vazia!");
				} else {
					System.out.println("FILA DE CLIENTES");
					for(String cliente:fila) {// quero q exiba sem []e em linhas separadas
						System.out.println(cliente);
					}	
				}
				break;
			}
			case 3: {
				if (fila.isEmpty()) {
					System.out.println("Fila está vazia!");
				} else {
					nome=fila.peek();
					fila.remove();
					System.out.printf("%s foi chamado(a)!\n",nome);
				}
				break;
			}
			case 4: {
				fila.clear();
				System.out.println("Final do dia, limpando a fila!");
				break;
			}
			case 5: {
				System.out.println("Digite o nome que deseja buscar:");
				nome=sc.next();
				
				if(fila.contains(nome)) {
					System.out.println("Você está na fila");
				}else {
					System.out.println("Você não está na fila!");
				}
				break;
			}
			case 0: {
				System.out.println("Programa Finalizado!");
				break;
			}

			default:
				System.out.println("Opção inválida!");
			}
			System.out.println();

		} while (opcao != 0);
		// fechando Scanner
		sc.close();
	}

}
