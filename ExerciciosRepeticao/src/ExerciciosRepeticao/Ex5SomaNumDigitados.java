package ExerciciosRepeticao;

import java.util.Scanner;

public class Ex5SomaNumDigitados {
	public static void main(String[] args) {
		//Instânciando objeto scanner
		Scanner sc = new Scanner(System.in);
		//Declarando variavel
		int numero,soma=0;	
		//iniciando o laço do-while
		do {
			System.out.println("Digite um número (0 para encerrar):");
			numero=sc.nextInt();
			if(numero>0)
			soma=soma+numero;
		}while(numero!=0);
		System.out.printf("A soma dos números positivos é: %d%n",soma);
		//Fechando scanner
		sc.close();
	}
}
