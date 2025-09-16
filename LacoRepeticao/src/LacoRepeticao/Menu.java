package LacoRepeticao;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// instanciando objeto Scanner
				Scanner sc = new Scanner(System.in);
				//Declarando variaveis 
				int numero, contador=1;
				System.out.println("Qual tabuada deseja?");
				numero=sc.nextInt();
				do {
					System.out.printf("%d * %d = %d%n",numero,contador,numero * contador);
					contador ++;
				}while(contador <=10);
				
				//Fechadno o objeto scanner
				sc.close();

	}

}
