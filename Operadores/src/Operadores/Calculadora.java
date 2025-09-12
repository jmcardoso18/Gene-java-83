package Operadores;

import java.util.Scanner;

public class Calculadora {
		public static void main(String[] args) {
			//Instanciando um objeto Scanner
			Scanner leia = new Scanner(System.in);
			
			//Declarando  as variáveis
			double num1,num2;
			
			//Solicitando entrada de dados
			System.out.println("Digite o primeiro numero");
			num1=leia.nextDouble();
			System.out.println("Digite o segundo numero");
			num2=leia.nextDouble();
			
			//Exibindo os resultados das operações
			System.out.printf("A soma desses números é: %.2f + %.2f = %.2f%n",num1,num2,num1 + num2);
			System.out.printf("A subtração desses números é: %.2f - %.2f = %.2f%n",num1,num2,num1 - num2);
			System.out.printf("A multiplicação desses números é: %.2f * %.2f = %.2f%n",num1,num2, num1 * num2);
			System.out.printf("A divisão desses números é: %.2f * %.2f = %.2f%n",num1,num2, num1 / num2);
			System.out.printf("A módulo desses números entre %.2f e %.2f = %.2f%n",num1,num2, num1 % num2);
			
			// Operações Matemáticas com a classe Math
			System.out.printf("A potência desses números é: %.2f ^ %.2f = %.2f%n",num1,num2, Math.pow(num1, num2));
			System.out.printf("A raiz quadrada desses números é: %.2f =%.2f e %.2f = %.2f%n",num1, Math.sqrt(num1),num2,Math.sqrt(num2));
			
			//Fechando o objeto
			leia.close();
		}
}
