package Condicionais;

import java.util.Scanner;

public class Ex3DoadorSangue {

	public static void main(String[] args) {
		// Instanciando objeto da classe Scanner
		Scanner leia = new Scanner(System.in);
		// Declarando variaveis
		String nome;
		char opcao;
		int idade, sair=0;
		boolean doa;
		// Criando uma estrutura de while para facilitar os testes
		while (sair != 1) {
			// Solicitando entrada de dados ao usúario.
			System.out.println("Digite seu nome");
			nome = leia.next();
			System.out.println("Digite sua idade");
			idade = leia.nextInt();
			System.out.println("É a primeira doação de sangue? (true/false)");
			doa = leia.nextBoolean();
			// utilizando if-else para verificar idade ese já doou sangue
			if (idade >= 18 && idade <= 69) {// Verifica se possui a idade necessária 
				if(60<=idade && idade<=69 && doa==true) {
					System.out.println(nome + " não está apto a doar sangue, pois tem mais de 60 e nunca doou sangue.");
				}else {
					System.out.println(nome + " está apto a doar sangue");
				}
			}else {
				System.out.println(nome + " não está apto(a) à doar sangue,não possui idade necessária para doar");
			}
			// Verificando se quer continuar operando a verificação
			System.out.println("Deseja realizar uma nova operação?(S/N)");
			opcao = Character.toUpperCase(leia.next().charAt(0));
			if (opcao == 'N') {
				sair = 1;
			}
		}
		// Fechando o objeto da classe Scanner
		leia.close();
		System.exit(0);
	}
}
