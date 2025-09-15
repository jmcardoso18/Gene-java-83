package Condicionais;

import java.util.Scanner;

public class Ex6Reajuste {

	public void exibirCargos() {
		System.out.println("Código do Cargo\tCargo");
		System.out.println("1\tGerente");
		System.out.println("2\tVendedor");
		System.out.println("3\tSupervisor");
		System.out.println("4\tMotorista");
		System.out.println("5\tEstoquista");
		System.out.println("6\tTécnico de TI");
	}

	public static void main(String[] args) {
		// Instanciando a classe Scanner
		Scanner leia = new Scanner(System.in);
		Ex6Reajuste cargos = new Ex6Reajuste();
		// Declarando as variaveis
		String nome;
		int idCargo;
		double salario,novoSalario;
		// Solicitando entrada de dados
		System.out.println("Digite seu nome:");
		nome = leia.next();
		cargos.exibirCargos();
		System.out.println("Digite o código de seu cargo:");
		idCargo = leia.nextInt();
		System.out.println("Digite seu salário:");
		salario=leia.nextFloat();
		
		//Calculando novo salario
		switch (idCargo) {
		case 1: {
			novoSalario = salario + (salario*0.1);
			System.out.println("Nome do colaborador: "+nome+"\nCargo: Gerente\nNovo salário é de "+novoSalario+" reais.");
			break;
		}
		case 2: {
			novoSalario = salario + (salario*0.07);
			System.out.println("Nome do colaborador: "+nome+"\nCargo: Vendedor\nNovo salário é de "+novoSalario+" reais.");
			break;
		}
		case 3: {
			novoSalario = salario + (salario*0.09);
			System.out.println("Nome do colaborador:"+nome+"\nCargo: Supervisor \nNovo salário é de "+novoSalario+" reais.");
			break;
		}
		case 4: {
			novoSalario = salario + (salario*0.06);
			System.out.println("Nome do colaborador:"+nome+"\nCargo: Motorista\nNovo salário é de "+novoSalario+" reais.");
			break;
		}
		case 5: {
			novoSalario = salario + (salario*0.05);
			System.out.println("Nome do colaborador:"+nome+"\nCargo: Estoquista\nNovo salário é de "+novoSalario+" reais.");
			break;
		}
		case 6: {
			novoSalario = salario + (salario*0.08);
			System.out.println("Nome do colaborador:"+nome+"\nCargo: Técnico de TI\nNovo salário é de "+novoSalario+" reais.");
			break;
		}
		default:
			System.out.println("Opção inválida");
		}
		//fechando scanner
		leia.close();
	}
}
