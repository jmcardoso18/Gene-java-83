package ExerciciosColecoes;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ex4BuscandoSet {

	public static void main(String[] args) {
		// Instanciando Scanner
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// Declarando variaveis
		Set<Integer> numeroSet = new HashSet<>();
		int numero = 1;// numero recebe 1 para entrar no while e receber novo valor

		// atribuindo dados usando randow de 1 a 100 em um set
		while (numeroSet.size() < 10) {
			// set recebe numero do random
			numeroSet.add(r.nextInt(100) + 1);
		}
		System.out.println("Exibindo list set para teste:\n" + numeroSet + "\n");

		while (numero != 0) {
			// Input de qual número deseja buscar
			System.out.println("Digite um numero (Para sair digite 0): ");
			numero = sc.nextInt();
			if (numero == 0) {
				System.out.println("Encerrando o programa...");
				break;
			}

			// Buscando numero na lista
			if (numeroSet.contains(numero) == true) {
				System.out.printf("O número %d foi encontrado!", numero);
			} else {
				System.out.printf("O número %d não foi encontrado!\n", numero);
			}
		}
		// fechando scanner
		sc.close();
	}

}
