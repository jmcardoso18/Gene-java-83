package ExerciciosRepeticao;

import java.util.Scanner;

public class Ex1Multiplos35 {

	public static void main(String[] args) {
		//Instanciando Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declarando variaveis
		int num1,num2;
		
		//Solicitando a entrada dos numeros
		System.out.println("Digite o primeiro número:");
		num1=sc.nextInt();
		System.out.println("Digite o último número");
		num2=sc.nextInt();
		
		//Utilizando if para verificar se o numero é menor que o segundo
		//Em else, informar o intervalo incorreto e finalizar
		if(num1<num2) {
			for(int contador=num1;contador<=num2;contador++) {
				if(contador%3==0 && contador%5==0) {
					System.out.printf("%d é multiplo de 3 e 5\n",contador);
				}
			}
		}else {
			System.out.println("Intervalo informado é inválido");
			System.exit(0);// Forçando a parada do sistema se estiver invalido
		}
		System.out.println("Finalizando o sistema...");	
		//fechando Scanner
		sc.close();
	}

}
