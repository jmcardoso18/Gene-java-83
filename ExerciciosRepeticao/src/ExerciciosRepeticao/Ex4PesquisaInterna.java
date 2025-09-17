package ExerciciosRepeticao;

import java.util.Scanner;

public class Ex4PesquisaInterna {

	public static void main(String[] args) {
		// Instanciando a classe Scanner
		Scanner sc = new Scanner(System.in);
		// Declarando variaveis de entrada
		int genero, dev;
		String continua = "s";
		// Declarando variaveis de saida
		int idade, devBack = 0, mFront = 0, hMoboM40 = 0, nbim30 = 0, tPessoas = 0;
		double media,somaIdade=0;
		// Preencher até pedir para sair
		while (continua.equalsIgnoreCase("s")) {
			//Pedindo idade do usuario
			System.out.println("Digite a sua idade:");
			idade = sc.nextInt();
			// Exibindo opções de Identidade de Gênero
			System.out.println("Identidade de Gênero (Número Inteiro): ");
			System.out.println("1 – Mulher Cis");
			System.out.println("2 – Homem Cis");
			System.out.println("3 – Não Binário");
			System.out.println("4 – Mulher Trans");
			System.out.println("5 – Homem Trans");
			System.out.println("6 – Outros");
			System.out.print("Digite sua opção: ");
			genero = sc.nextInt();

			// Exibindo opções de Pessoa Desenvolvedora
			System.out.println("\nPessoa Desenvolvedora (Número Inteiro):");
			System.out.println("1 – Backend");
			System.out.println("2 – Frontend");
			System.out.println("3 – Mobile");
			System.out.println("4 – FullStack");
			System.out.print("Digite sua opção: ");
			dev = sc.nextInt();

			//Calculando as condicionais pedidas 
			if(dev==1)//se for backend
				devBack++;
			if((genero==1||genero==4 && dev==2))//Mulher Cis ou Trans que trabalhe com Front
				mFront++;
			if(genero==2||genero==5 && dev==3 && idade>=40)//Homem cis ou trans que trabalhe com mobile e tenha mais de 40
				hMoboM40++;
			if(genero==3&& dev==4 && idade<=30)
				nbim30++;
			somaIdade=somaIdade+idade;
			tPessoas++;
					
			// condicional para sair ou nao da pesquisa
			System.out.printf("Deseja continuar?(S/N)");
			sc.skip("\\R");
			continua = sc.nextLine().toUpperCase();
		}
		
		//Exibindo o resultado da pesquisa
		//If para verificar se alguém respondeu a pesquisa
        if (tPessoas > 0) {
            media= Math.round(somaIdade/tPessoas);
            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Número de desenvolvedores Backend: " + devBack);
            System.out.println("Número de Mulheres Cis e Trans Frontend: " + mFront);
            System.out.println("Número de Homens Cis e Trans Mobile maiores de 40 anos: " + hMoboM40);
            System.out.println("Número de Não Binários FullStack menores de 30 anos: " + nbim30);
            System.out.println("Total de pessoas que responderam: " + tPessoas);
            System.out.printf("Média de idade das pessoas: %.f anos%n", media);
        } else {
            System.out.println("Nenhuma pessoa respondeu à pesquisa.");
        }
		// Fechando a classe scanner
		sc.close();

	}

}
