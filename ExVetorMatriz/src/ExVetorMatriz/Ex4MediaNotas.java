package ExVetorMatriz;

import java.util.Scanner;

public class Ex4MediaNotas {

	public static void main(String[] args) {
		//Instanciando Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declarando variaveis
		float notas[][]= new float[10][4];
		float media[]= new float[notas.length];
		int linha,coluna;
		//recebendo valores
		for (linha = 0; linha < notas.length; linha++) {
			for (coluna = 0; coluna < notas[linha].length; coluna++) {
				System.out.printf("Digite sua %dº nota:",coluna+1);
				notas[linha][coluna]=sc.nextFloat();
			}
		}
		//exibindo valores
		for (linha = 0; linha < notas.length; linha++) {
			System.out.println();
			for (coluna = 0; coluna < notas[linha].length; coluna++) {
				System.out.print(notas[linha][coluna]+" ");
				media[linha]+=notas[linha][coluna];	
			}
			System.out.printf(" Media é: %.1f",(media[linha]/notas[linha].length));
		}
		//Fechando o scanner
		sc.close();	
	}
}
