package ExerciciosRepeticao;

import java.util.Scanner;

public class Ex2TotalImparPar {

	public static void main(String[] args) {
		//Instânciando objeto scanner
		Scanner sc = new Scanner(System.in);
		//Declarando variavel
		int contador=0,totalPar=0,totalImpar=0;
		//Declarando e iniciando um array numerico
		int numero[]= new int[10];
		
		//Laço for para leitura de 10 numeros
		for(contador=0;contador<10;contador++) {
			System.out.printf("Digite o %dº número: ",contador+1);
			numero[contador]=sc.nextInt();
			//if para verificar se é impar ou par
			if(numero[contador]%2==0) {
				totalPar++;
			}else {
				totalImpar++;
			}			
		}
		//Imprimindo números digitados
		System.out.println("\nOs números digitados foram:");
		for(contador=0;contador<10;contador++) {
			System.out.print(numero[contador]+" ");
		}
		System.out.println("\n");//pulando linha
		//Imprimindo o resultado
		System.out.println("Total de números pares: "+totalPar);
		System.out.println("Total de números impares: "+totalImpar);
		//Fechando scanner
		sc.close();
	}

}
