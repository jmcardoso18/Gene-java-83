package Condicionais;

import java.util.Scanner;

public class Ex8ContaBancaria {

	public void exibirMenu() {
		System.out.println("===== MENU DE OPERAÇÕES=====");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		System.out.println("4 - Sair");
	}

	public static void main(String[] args) {
		// Instanciando objetos da classe scanner e metodo exibir menu
		Scanner leia = new Scanner(System.in);
		Ex8ContaBancaria menu = new Ex8ContaBancaria();
		// Declarando variavel
		int opcao;
		double valor, saldo = 10000;
		do {
            // Exibe o menu
            menu.exibirMenu();
            System.out.print("Escolha uma operação: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Operação - Saldo");
                    System.out.println("Saldo atual: " + saldo);
                }
                case 2 -> {
                    System.out.println("Operação - Saque");
                    System.out.print("Valor do saque: ");
                    valor = leia.nextDouble();
                    System.out.println("Gostaria realmente de sacar " + valor + "? (s/n)");
                    char confirma = Character.toUpperCase(leia.next().charAt(0));

                    if (confirma == 'S') {
                        if (valor > saldo) {
                            System.out.println("Saldo insuficiente!");
                        } else {
                            saldo -= valor;
                            System.out.println("Saque realizado com sucesso!");
                        }
                    } else {
                        System.out.println("Operação cancelada.");
                    }
                }
                case 3 -> {
                    System.out.println("Operação - Depósito");
                    System.out.print("Valor do depósito: ");
                    valor = leia.nextDouble();
                    System.out.println("Gostaria realmente de depositar " + valor + "? (s/n)");
                    char confirma = Character.toUpperCase(leia.next().charAt(0));

                    if (confirma == 'S') {
                        saldo += valor;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Operação cancelada.");
                    }
                }
                case 4 -> System.out.println("Encerrando... Obrigada pela preferência!");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

		// fechando scanner
		leia.close();
	}
}