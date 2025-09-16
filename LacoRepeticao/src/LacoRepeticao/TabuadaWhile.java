package LacoRepeticao;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		/// instanciando objeto Scanner
		Scanner sc = new Scanner(System.in);
		//Declarando variaveis 
		int numero;
		int contador=1;
		//solicitando ao usuario qual tabuada deseja exibir
		System.out.println("Qual tabuada deseja?");
		numero=sc.nextInt();
		//Exibindo a tabuada
		System.out.println("TABUADA DO NÚMERO "+numero);
		//Utilizando um for para imprmir a tabuada de 1 a 10
		while(contador <=10) {
			System.out.printf("%d * %d = %d%n",numero,contador,numero * contador);
			contador ++;			
		}
		
		//Fechadno o objeto scanner
		sc.close();

	}

}
