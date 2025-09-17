package ExVetorMatriz;
import java.util.Arrays;
import java.util.Scanner;

public class Ex3SomaMatriz {

	public static void main(String[] args) {
		//Instanciando scanner
		Scanner sc= new Scanner(System.in);
		
		// Declarando matriz
		int numeros[][] = new int[3][3];
		int vetorDP[] = new int[3];
		int vetorDS[] = new int[3];
		int somaDP = 0, somaDS = 0;

		// Percorrendo a matriz
		for (int linha = 0; linha < numeros.length; linha++) {
			for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
				System.out.printf("Matriz[%d][%d] = ",linha,coluna);
				numeros[linha][coluna]=sc.nextInt();
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
		//Fechando scanner
		sc.close();
	}
}
