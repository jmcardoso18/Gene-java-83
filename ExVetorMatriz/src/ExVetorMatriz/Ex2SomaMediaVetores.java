package ExVetorMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2SomaMediaVetores {

	public static void main(String[] args) {
		// instanciando scanner
		Scanner sc = new Scanner(System.in);
		// Declarando variaveis
		int i, numeros[] = new int[10];
		float soma = 0;

		// Recebendo dados no vetor em uma estrurura for
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero:");
			numeros[i] = sc.nextInt();
		}
		// Exibindo vet
		System.out.println("Vetor:" + Arrays.toString(numeros));
		// Processando, exibindo dados nos vetores impares e calculando soma
		System.out.println("Elementos nos índices ímpares:");
		for (i = 0; i < numeros.length; i++) {
			if (i % 2 != 0) {// exibindo dados nos indices impares
				System.out.print(numeros[i] + " ");
			}
			soma += numeros[i];
		}
		// Processando e exibindo os pares
		System.out.println("\nElementos pares:");
		for (i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		// exibindo soma e media
		System.out.println("\nSoma: " + soma);
		System.out.printf("Média: %.2f%n ", (soma / numeros.length));
		sc.close();
	}
}
