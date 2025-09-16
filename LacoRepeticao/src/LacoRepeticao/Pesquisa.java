package LacoRepeticao;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		/// instanciando objeto Scanner
		Scanner sc = new Scanner(System.in);
		// Declarando variaveis
		int idade, esporte, futebol = 0, voleiM18 = 0, basquetem18 = 0, totalRespostas = 0;
		double media = 0;
		long somaIdades = 0;

		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {
			// solicitando idade e esporte ao usuario
			System.out.println("Pesquisa - Esporte Favorito");
			System.out.println("Digite a sua idade:");
			idade = sc.nextInt();
			System.out.println("1- Futebol");
			System.out.println("2- Voleibol");
			System.out.println("3- Basquetebol");
			esporte = sc.nextInt();
			// total de pessoas que gostam de futebol
			if (esporte == 1) {
				futebol++;
			}
			// Total de pessoas que gostam de volei
			if (esporte == 2 && idade >= 18) {
				voleiM18++;
			}
			// Total de pessoas que gostam de volei
			if (esporte == 3 && idade <= 18) {
				basquetem18++;
			}
			// Media das idades
			somaIdades += idade;
			totalRespostas++;

			// condicional para sair ou nao da pesquisa
			System.out.printf("Deseja continuar?(S/N)");

			sc.skip("\\R");
			continua = sc.nextLine().toUpperCase();
		}
		media = Math.round(somaIdades / totalRespostas);
		System.out.println("Total de pessoas de que gostam de futebol: " + futebol);
		System.out.println("Total de pessoas de que gostam de voleibol e maiores de 18: " + voleiM18);
		System.out.println("Total de pessoas de que gostam de basquetebol e menores de 18: " + basquetem18);
		System.out.println("A soma das idades é: " + somaIdades);
		System.out.println("Total de pessoas pesquidadas: " + totalRespostas);
		System.out.println("A média das pesssoas entrevistas é: " + media);

		// Fechadno o objeto scanner
		sc.close();
	}

}
