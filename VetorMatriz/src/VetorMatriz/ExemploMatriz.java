package VetorMatriz;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		//Instanciando scanner
		Scanner sc = new Scanner(System.in);
		// Declarando matriz
		int numeros[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		float numerosReais[][]= new float[3][2];
		//exibindo matriz
		for(int linha =0;linha < numeros.length; linha++) {
			for(int coluna=0;coluna<numeros.length;coluna++) {
				System.out.printf("numeros[%d][%d]= %d%n",linha,coluna,numeros[linha][coluna]);
			}
		}
		//Recebendo valores na matriz
		for(int linha =0;linha < numerosReais.length; linha++) {
			for(int coluna=0;coluna<numerosReais[linha].length;coluna++) {
				System.out.println("Digite um numero");
				numerosReais[linha][coluna]= sc.nextFloat();
			}
		}
		//exibindo matriz numeros reais
		for(int linha =0;linha < numerosReais.length; linha++) {
			for(int coluna=0;coluna<numerosReais[linha].length;coluna++) {
				System.out.printf("numeros[%d][%d]= %f%n",linha,coluna,numerosReais[linha][coluna]);
			}
		}
		sc.close();
	}

}
