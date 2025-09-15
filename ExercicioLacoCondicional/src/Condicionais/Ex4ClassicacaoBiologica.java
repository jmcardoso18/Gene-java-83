package Condicionais;

import java.util.Scanner;

public class Ex4ClassicacaoBiologica {
	public static void main(String[] args) {
		// Instanciando objeto da classe Scanner
		Scanner leia = new Scanner(System.in);
		// Declarando variaveis
		String tipo,classe,alimentacao;
		char opcao;
		int sair=0;
		
		// Criando uma estrutura de while para facilitar os testes
		while (sair != 1) {
			// Solicitando entrada de dados ao usúario utilizando If e else.
			System.out.println("É um animal vertebrado ou invertebrado");
			tipo = leia.next().toUpperCase();//Padronizando saida
			//Iniciando "braço" vertebrado
			if (tipo.equalsIgnoreCase("VERTEBRADO")) {
			    System.out.println("Você escolheu um Vertebrado!Agora digite se é uma ave ou mamífero ");
			    classe=leia.next().toUpperCase();;
			    if(classe.equalsIgnoreCase("AVE")) {
			    	System.out.println("Você escolheu uma ave! Agora digite se é uma ave carnivora ou onivoro");
			    	alimentacao=leia.next().toUpperCase();
			    	if(alimentacao.equalsIgnoreCase("ONÍVORA")||alimentacao.equalsIgnoreCase("ONIVORA")) {
			    		System.out.println("Pompa!");
			    	}else if(alimentacao.equalsIgnoreCase("CARNIVORA")||alimentacao.equalsIgnoreCase("CARNÍVORA")) {
			    		System.out.println("Águia!");
			    	}else {
					    System.out.println("Opção inválida!");
					}
			    }else if(classe.equalsIgnoreCase("MAMIFERO")||classe.equalsIgnoreCase("MAMÍFERO")) {
			    	System.out.println("Você escolheu um mamífero! Agora digite se é uma mamífero herbivoro ou onivoro");
			    	alimentacao=leia.next().toUpperCase();
			    	if(alimentacao.equalsIgnoreCase("ONÍVORO")||alimentacao.equalsIgnoreCase("ONIVORO")) {
			    		System.out.println("Homem!");
			    	}else if(alimentacao.equalsIgnoreCase("HERBIVORO")||alimentacao.equalsIgnoreCase("HERBÍVORO")) {
			    		System.out.println("Vaca!");
			    	}else {
					    System.out.println("Opção inválida!");
					}
			    }
			} else if (tipo.equalsIgnoreCase("INVERTEBRADO")) {//iniciando braço Invertebrado
				System.out.println("Você escolheu um Invertebrado!Agora digite se é um inseto ou anelídeo.");
				classe=leia.next().toUpperCase();;
			    if(classe.equalsIgnoreCase("INSETO")) {
			    	System.out.println("Você escolheu um inseto! Agora digite se é uma inseto hematófago ou herbívoro.");
			    	alimentacao=leia.next().toUpperCase();
			    	if(alimentacao.equalsIgnoreCase("HEMATÓFAGO")||alimentacao.equalsIgnoreCase("HEMATOFAGO")) {
			    		System.out.println("Pulga!");
			    	}else if(alimentacao.equalsIgnoreCase("HERBÍVORO")||alimentacao.equalsIgnoreCase("HERBIVORO")) {
			    		System.out.println("Lagarta!");
			    	}else {
					    System.out.println("Opção inválida!");
					}
			    }else if(classe.equalsIgnoreCase("ANELÍDEO")||classe.equalsIgnoreCase("ANELIDEO")) {
			    	System.out.println("Você escolheu um ANELÍDEO! Agora digite se é um anelídeo hematófago ou onívoro");
			    	alimentacao=leia.next().toUpperCase();
			    	if((alimentacao.equalsIgnoreCase("ONÍVORO")||alimentacao.equalsIgnoreCase("ONIVORO"))) {
			    		System.out.println("Minhoca!");
			    	}else if(alimentacao.equalsIgnoreCase("HEMATÓFAGO")||alimentacao.equalsIgnoreCase("HEMATOFAGO")) {
			    		System.out.println("Sanguessuga!");
			    	}else {
					    System.out.println("Opção inválida!");
					}
			    }else {
				    System.out.println("Opção inválida!");
				}
			} else {
			    System.out.println("Opção inválida!");
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
