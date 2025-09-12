package ExercOperadores;

import java.util.Scanner;

public class Ex4CalculoNumeros {

	public static void main(String[] args) {

		// Instânciando o objeto Scanner
		Scanner leia = new Scanner(System.in);

		// Declarando variáveis
		float n1, n2, n3, n4, calculo;

		// Solicitando entrada de dados
		System.out.println("Digite o primeiro número:");
		n1 = leia.nextFloat();
		System.out.println("Digite o segundo número:");
		n2 = leia.nextFloat();
		System.out.println("Digite o terceiro número:");
		n3 = leia.nextFloat();
		System.out.println("Digite o quarto número:");
		n4 = leia.nextFloat();
		calculo = (n1 * n2) - (n3 * n4);

		// Exibindo a saida de dados
		System.out.printf("(%.1f * %.1f) - (%.1f * %.1f): %.1f", n1, n2, n3, n4, calculo);

		// Fechando o objeto Scanner
		leia.close();
	}

}
