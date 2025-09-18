

import java.util.Scanner;
import java.util.Stack;

public class Ex2Pilha {

	public static void main(String[] args) {
		// Instânciando Scanner
		Scanner sc = new Scanner(System.in);
		// Declarando collections
		Stack<String> pilha = new Stack<String>();

		// Declarando variaveis
		int opcao;
		String livro;

		do {
			// Exibindo menu
			System.out.println("********************************************");
			System.out.println("   1 - Adicionar livro na pilha");
			System.out.println("   2 - Listar todos os livros");
			System.out.println("   3 - Retirar livros da pilha");
			System.out.println("   4 - Limpar pilha");
			System.out.println("   5 - Buscar na pilha");
			System.out.println("   0 - Sair");
			System.out.println("********************************************");
			System.out.print("Entre com a opção desejada: ");
			while (!sc.hasNextInt()) { // enquanto não for inteiro
				System.out.println("Entrada inválida! Digite apenas números inteiros.");
				sc.next(); // descarta o valor inválido
				System.out.print("Digite um número inteiro: ");
			}
			opcao = sc.nextInt();

			// Entrando nas opcoes do swith case
			switch (opcao) {

			case 1: {
				System.out.println("Digite o nome do livro: ");
				sc.nextLine();// Limpa buffer
				livro = sc.nextLine();
				pilha.push(livro);
				System.out.println("Livro adicionado na pilha!");
				break;
			}
			case 2: {
				if (pilha.isEmpty() == true) {
					System.out.println("Pilha está vazia!");
				} else {
					System.out.println("PILHA DE LIVROS");
					for (int i= pilha.size()-1;i>=0;i--) {// quero q exiba sem []e em linhas separadas
						System.out.println(pilha.get(i));
					}
				}
				break;
			}
			case 3: {
				if (pilha.isEmpty()) {
					System.out.println("Pilha está vazia!");
				} else {
					livro = pilha.peek();
					pilha.pop();
					System.out.printf("%s foi removido da pilha!\n", livro);
				}
				break;
			}
			case 4: {
				pilha.clear();
				System.out.println("Todos os livros foram guardados!");
				break;
			}
			case 5: {
				System.out.println("Digite o nome do livro que deseja buscar:");
				livro = sc.next();
				sc.nextLine();//limpando buffer

				if (pilha.contains(livro)) {
					System.out.println("Livro está na pilha");
				} else {
					System.out.println("Livro não está na pilha!");
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
