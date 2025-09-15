package Condicionais;
import java.util.Scanner;

public class Ex2ImparParPosNeg{

	public static void main(String[] args) {
		// Instanciando objeto da classe Scanner
		Scanner leia = new Scanner(System.in);
		// Declarando variaveis
		char opcao;
		int numero,sair = 0;
		// Criando uma estrutura de while para facilitar os testes
		while (sair != 1) {
			// Solicitando entrada de dados ao usúario.
			System.out.println("Digite um número");
			numero = leia.nextInt();
			
			// utilizando if-else para verificar impar/par e positivo/negativo
			if (numero%2==0 && 0<numero) {
				System.out.println(numero + " é par e positivo");
			} else if (numero%2==0 && 0>numero) {
				System.out.println(numero + " é par e negativo");
			} else if(numero%2!=0 && 0<numero) {
				System.out.println(numero + " é impar e positivo");
			} else if(numero%2!=0 && 0>numero){
				System.out.println(numero + " é impar e negativo");
			}else if(numero==0){
				System.out.println("Você escolheu zero, é um número neutro.");
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


