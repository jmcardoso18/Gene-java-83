package ExerciciosRepeticao;

import java.util.Scanner;

public class Ex3ContadorMaioridade {

	public static void main(String[] args) {
		//Instânciando objeto scanner
		Scanner sc = new Scanner(System.in);
		//Declarando variavel
		int idade,maiorIdade=0,menorIdade=0;
		boolean contador = true;
		//usando o while para solicitar a entrada de dados enquanto não entrar um número negativo
		while(contador) {
			System.out.println("Digite sua idade");
			idade=sc.nextInt();
			//if para verificar se idade é negativa
			if(idade<0)
				break;
			//if para verificar se é maior de 50 anos ou menor de 20 anos de idade
			if(idade<=21) 
				menorIdade++;
			else if(idade>=50)
				maiorIdade++;
		}
		//Exibindo resultado
		System.out.println("Total de pessoas menores de 21 anos: "+menorIdade);
		System.out.printf("Total de pessoas maiores de 50 anos: %d%n",maiorIdade);
		System.out.println("Finalizando o sistema...");	
		//Fechando scanner
		sc.close();
	}

}
