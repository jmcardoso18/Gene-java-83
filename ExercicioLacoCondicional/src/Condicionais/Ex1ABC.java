package Condicionais;
import java.util.Scanner;

public class Ex1ABC {

	public static void main(String[] args) {
		// Instanciando objeto da classe Scanner
		Scanner leia = new Scanner(System.in);
		// Declarando variaveis
		char opcao;
		int a, b, c,sair = 0;
		// Criando uma estrutura de while para facilitar os testes
		while (sair != 1) {
			// Solicitando entrada de dados ao usúario.
			System.out.println("Digite o primeiro número");
			a = leia.nextInt();
			System.out.println("Digite o segundo número");
			b = leia.nextInt();
			System.out.println("Digite o terceiro número");
			c = leia.nextInt();
			// utilizando if-else para verificar se A + B é maior,menor ou igual a c
			if ((a + b) > c) {
				System.out.printf("%.2f+%.2f é maior que %.2f%n", a, b, c);
			} else if (a + b < c) {
				System.out.printf("%.2f+%.2f é menor que %.2f%n", a, b, c);
			} else {
				System.out.printf("%.2f+%.2f é igual que %.2f%n", a, b, c);
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
