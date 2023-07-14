package nelio.estruturaRepetitiva;

import java.util.Scanner;

public class exercicioWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		int numero = 0;
		int soma = 0;
		
		numero = scan.nextInt();
		
		while(numero !=0) {
			soma +=numero;
			numero = scan.nextInt();
			
		}
		
		System.out.println("A soma de todos os numeros é: " + soma);
		scan.close();

	}

}
