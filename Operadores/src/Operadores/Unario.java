package Operadores;

public class Unario {

	public static void main(String[] args) {

				int preIncrementoOriginal= 8;
				int posIncrementoOriginal= 8;
				int preIncrementoResultado;
				int posIncrementoResultado;
				
				//Pre Incremento
				System.out.printf("\nPré Incremento: valororiginal= %d%n",preIncrementoOriginal);
				preIncrementoResultado=++preIncrementoOriginal;
				System.out.printf("Após pré incrementar a variável original: resultado=%d, Valor Atualizado =%d%n",preIncrementoResultado,preIncrementoOriginal);
				//Pos incremento
				System.out.printf("\nPós Incremento: valororiginal= %d%n",posIncrementoOriginal);
				posIncrementoResultado=posIncrementoOriginal++;
				System.out.printf("Após pré incrementar a variável original: resultado=%d, Valor Atualizado =%d%n",posIncrementoResultado,posIncrementoOriginal);
				
	
			}

	}

