package nelio;

/*
 * Faça um programa para ler o código de uma peça 1, o número de peças1, o valor unitário de
 * cada peça 1, o código de uma peça 2, o número de pelas 2 e o valor unitário de cada peça 2. Calcule e
 * mostre o valor a ser pago.
 */
public class ExercicioProposto05 {
	public static void main(String[] args) {
		
		int peca1 = 12;
		int quantidadePeca1 = 1;
		double valorPeca1= 15.10;
		
		int peca2 = 161;
		int quantidadePeca2 = 1;
		double valorPeca2= 15.10;
		
		double valorTotal = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
	
		
		
	}

}
