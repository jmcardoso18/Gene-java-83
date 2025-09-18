package ExerciciosColecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1Frutas {

	public static void main(String[] args) {
		//Instanciando Scanner
		Scanner sc = new Scanner(System.in);
		//Declarando o Array
		ArrayList<String> cores = new ArrayList<String>();
		//Input de na array list
		for(int i=0;i<5;i++) {
			System.out.println("Digite uma cor:");
			cores.add(sc.next());
		}
		//Listar as cores oferecidas
		System.out.println("Listar todas as cores:");
		for(String cor:cores) {
			System.out.print(cor+" ");
		}
		cores.sort(null);
		//Mostrando lista ordenada
		System.out.println("\nOrdenar as cores:");
		for(String cor:cores) {
			System.out.print(cor+" ");
		}
		//fechando scanner
		sc.close();
	}

}
