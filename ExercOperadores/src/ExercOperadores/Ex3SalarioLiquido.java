package ExercOperadores;

import java.util.Scanner;

public class Ex3SalarioLiquido {

	public static void main(String[] args) {
				//Instânciando o objeto Scanner
				Scanner leia = new Scanner(System.in);
				
				//Declarando variáveis
				float salarioBruto,addNoturno,hrExtra,descontos,salarioLiquido;
				String nome;
				
				
				//Solicitando entrada de dados
				System.out.println("Digite seu nome");
				nome=leia.next();
				System.out.println("Digite seu salário bruto:");
				salarioBruto=leia.nextFloat();
				System.out.println("Digite seu adicional noturno:");
				addNoturno=leia.nextFloat();
				System.out.println("Digite quantas horas extras você possui:");
				hrExtra=leia.nextFloat();
				System.out.println("Digite valor total se seus descontos:");
				descontos=leia.nextFloat();
				salarioLiquido=salarioBruto+addNoturno+(hrExtra*5)-descontos;
				
				//Exibindo a saida de dados
				System.out.printf("%s seu salário líquido é de: %.2f",nome,salarioLiquido);
				
				//Fechando o objeto Scanner
				leia.close();// TODO Auto-generated method stub

	}

}
