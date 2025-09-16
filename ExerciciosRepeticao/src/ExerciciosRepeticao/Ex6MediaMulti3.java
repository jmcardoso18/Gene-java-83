package ExerciciosRepeticao;
import java.util.Scanner;

public class Ex6MediaMulti3 {
	public double media(double soma,int contador) {
		return soma/contador;
	}
	
	public static void main(String[] args) {
		// Instânciando objeto scanner
		Scanner sc = new Scanner(System.in);
		Ex6MediaMulti3 media = new Ex6MediaMulti3();
		
		// Declarando variavel
		int numero, contador = 0;
		double soma = 0;

		// iniciando o laço do-while
		do {
			System.out.println("Digite um número (0 para encerrar):");
			numero = sc.nextInt();
			/*Ao debugar identifiquei a necessidadede validar q seja diferente de 0, 
			 * se não o contador conta mais 1 pois passa pelo looping antes de finalizar*/
			if (numero%3 == 0 && numero!=0) {
				soma += numero;
				contador++;
			}
		} while (numero != 0);
		System.out.printf("A média de todos os números multiplos de 3 é: %.1f%n", media.media(soma, contador));
		// Fechando scanner
		sc.close();
	}

}
