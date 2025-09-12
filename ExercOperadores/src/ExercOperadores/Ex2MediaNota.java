package ExercOperadores;

import java.util.Scanner;

public class Ex2MediaNota {
	public static void main(String[] args) {
		// Instânciando o objeto Scanner
		Scanner leia = new Scanner(System.in);

		// Declarando variáveis
		float nota1, nota2, nota3, nota4, media;

		// Solicitando entrada de dados
		System.out.println("Digite sua primeira nota:");
		nota1 = leia.nextFloat();
		System.out.println("Digite sua segunda nota:");
		nota2 = leia.nextFloat();
		System.out.println("Digite sua terceira nota:");
		nota3 = leia.nextFloat();
		System.out.println("Digite sua quarta nota:");
		nota4 = leia.nextFloat();
		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// Exibindo a saida de dados
		System.out.printf("Sua média final: %.1f", media);

		// Fechando o objeto Scanner
		leia.close();
	}
}
