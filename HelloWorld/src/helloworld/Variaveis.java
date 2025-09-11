package helloworld;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		int peso=leia.nextInt();
		System.out.println("Digite uma opção: ");
		char opcao=leia.next().charAt(0);
		System.out.println("Digite o valor: ");
		float valor= leia.nextFloat();
		System.out.println("O valor da variável peso é: "+ peso);
		System.out.println("O valor da variável peso é: "+ opcao);
		System.out.printf("O valor da variável peso é: %.2f \n", valor);
		
		leia.close();		
	}
}
