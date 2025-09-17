package ExVetorMatriz;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1LocalizarNumero {

	public static void main(String[] args) {
		// Instânciando classe randomico
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		// Declarando variaveis
		int[] vetor = new int[10];
		int i = 0, j, aleatorio, numero;
		// Usando uma estrutura de repetição para receber dados no array com randow
		while (i < 10) {
			// Aleatorio recebe numero do random
			aleatorio = r.nextInt(10) + 1;
			boolean repetido = false;
			// For passa por toda a lista
			for (j = 0; j < i + 1; j++) {
				// If verifica se numero já existe na lista
				if (aleatorio == vetor[j]) {// se existe sai do for e volta pro while para fornecer novo random
					repetido = true;
					break;
				}
			}
			// se repetido for false, adiciona ao array
			if (!repetido) {
				vetor[i] = aleatorio;
				i++;
			}
		}
		// Entrando no looping para o caso de digitar numero fora do intervalo
		while (true) {
			// Solicitando entrada para usuario
			System.out.println("Digite o número que deseja localizar no vetor (Digite 0 para sair:");
			numero = sc.nextInt();
			// Verificando se usuario pediu para sair
			if (numero == 0) {
				System.out.println("Encerrando o programa");
				break;
			}
			if (numero <= 10 && numero >= 1) {
				// Passando o vetor para localizar a variavel escolhida
				for (i = 0; i < vetor.length; i++) {
					if (numero == vetor[i]) {
						System.out.printf("O numero %d está localizado na posição %d%n", numero, i);
						break;// forçando a parada após encontrar valor
					}
				}
				System.out.println();// Pulando linha
				// Imprimindo valores para teste
				System.out.print("Array:" + Arrays.toString(vetor));

				System.out.println();// Pulando linha
			} else {
				System.out.printf("Número %d não encontrado!\n", numero);
			}
		}
		sc.close();
	}

}
