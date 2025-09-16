package LacoRepeticao;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
		// instanciando objeto Scanner
		Scanner sc = new Scanner(System.in);
		//Declarando variaveis 
		int numero;
		//solicitando ao usuario qual tabuada deseja exibir
		System.out.println("Qual tabuada deseja?");
		numero=sc.nextInt();
		//Exibindo a tabuada
		System.out.println("TABUADA DO NÚMERO "+numero);
		//Utilizando um for para imprmir a tabuada de 1 a 10
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d%n",numero,i,numero * i);
		}
		
		//Fechadno o objeto scanner
		sc.close();
		
	}
}
