package ExerciciosColecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex3OrdenarNumeros {

	public static void main(String[] args) {
		// Instanciando scanner
		Scanner sc = new Scanner(System.in);
		// declarando collecions
		Set<Integer> numeroSet = new HashSet<>();
		Integer numero;
		// Input dos dados no set, 
		for(int i=0;i<10;i++){
			System.out.println("Digite um número:");
			numeroSet.add(sc.nextInt());		
		}
		//Criando o Iterador dps de preencher a set
		Iterator<Integer> it = numeroSet.iterator();
		
		System.out.println("Listar dados do set:");
		
		while(it.hasNext()) {
			numero=it.next();
			System.out.println(numero);
		}
		//fechando scanner
		sc.close();
	}
}
