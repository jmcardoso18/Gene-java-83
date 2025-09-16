package ExerciciosRepeticao;

import java.util.Scanner;

public class Ex6MediaMulti3 {
	public static void main(String[] args) {
		// Instânciando objeto scanner
		Scanner sc = new Scanner(System.in);
		// Declarando variavel
		int numero, contador = 0;
		double soma = 0;

		// iniciando o laço do-while
		do {
			System.out.println("Digite um número (0 para encerrar)9:");
			numero = sc.nextInt();
			if (numero%3 == 0 && numero!=0) {//Ao debugar identifiquei a necessidadede validar q seja diferente de 0, se não o contador conta mais 1
				System.out.println(numero);
				soma += numero;
				contador++;
			}
		} while (numero != 0);

		System.out.printf("A média de todos os números multiplos de 3 é: %.1f%n", (soma / contador));

		// Fechando scanner
		sc.close();
	}

}
