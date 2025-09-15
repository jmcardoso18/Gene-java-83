package Condicionais;
import java.util.Scanner;
public class Ex7Calculadora {


	    public static void main(String[] args) {
	        // Declarando variaveis
	        double num1, num2, resultado;
	        char operacao;
	        // Instanciando a classe Scanner
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o primeiro número:");
	        num1 = sc.nextDouble();
	        System.out.println("Digite o segundo número:");
	        num2 = sc.nextDouble();
	        System.out.println("Digite a operação matemática (+, -, *, /):");
	        operacao = sc.next().charAt(0);
	        // Usando switch-case para determinar a operação e calcular o resultado
	        switch (operacao) {
	            case '+':
	                resultado = num1 + num2;
	                System.out.println("Resultado: " + resultado);
	                break;
	            case '-':
	                resultado = num1 - num2;
	                System.out.println("Resultado: " + resultado);
	                break;
	            case '*':
	                resultado = num1 * num2;
	                System.out.println("Resultado: " + resultado);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    resultado = num1 / num2;
	                    System.out.println("Resultado: " + resultado);
	                } else {
	                    System.out.println("Erro: Divisão por zero não é permitida.");
	                }
	                break;
	            default:
	                System.out.println("Operação inválida. Por favor, use +, -, * ou /.");
	                break;
	        }
	        // Fechando instancia do scanner
	        sc.close();
	    }
	}