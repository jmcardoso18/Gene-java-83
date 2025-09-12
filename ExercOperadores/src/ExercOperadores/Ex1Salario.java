package ExercOperadores;

import java.util.Scanner;

public class Ex1Salario {

	public static void main(String[] args) {
		//Instânciando o objeto Scanner
		Scanner leia = new Scanner(System.in);
		
		//Declarando variáveis
		float salario,abono,novoSalario;
		
		//Solicitando entrada de dados
		System.out.println("Digite o salário:");
		salario=leia.nextFloat();
		System.out.println("Digite o abono:");
		abono=leia.nextFloat();
		novoSalario=salario+abono;
		
		//Exibindo a saida de dados
		System.out.printf("O novo salário é de: %.2f",novoSalario);
		
		//Fechando o objeto Scanner
		leia.close();
	}
}
