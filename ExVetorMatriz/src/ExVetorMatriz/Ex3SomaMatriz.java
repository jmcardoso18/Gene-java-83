package ExVetorMatriz;
import java.util.Arrays;

public class Ex3SomaMatriz {

	public static void main(String[] args) {
		// Declarando matriz
		int numeros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int vetorDP[] = new int[3];
		int vetorDS[] = new int[3];
		int somaDP = 0, somaDS = 0;

		// Percorrendo a matriz
		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
				// recebendo valores da DP
				if (linha == coluna) {
					somaDP += numeros[linha][coluna];
					vetorDP[linha] = numeros[linha][coluna];
				}
				// Recebendo valores da DS
				if (linha+coluna==(numeros.length-1)) {
					somaDS += numeros[linha][coluna];
					vetorDS[linha] = numeros[linha][coluna];
				}
			}
		}
		//Exibindo resultados
		System.out.println("Elementos da diagonal principal:");
		System.out.println(Arrays.toString(vetorDP));
		System.out.println("Elementos da diagonal segundaria:");
		System.out.println(Arrays.toString(vetorDS));
		System.out.println("Soma dos elementes da diagonal principal: "+somaDP);
		System.out.println("Soma dos elementes da diagonal secundária: "+somaDS);
	}
}
