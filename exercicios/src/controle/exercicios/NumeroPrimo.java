package controle.exercicios;
// Criar um programa que receba um número e dia se ele é um número primo.

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int contadorDivisores = 0;
		
		System.out.println("Digite um número, vamos ver se é número primo");
		
		int numero = scan.nextInt();
		
		for(int i = 2; i < numero; i ++) {
			if( numero % i ==0) {
				contadorDivisores++;
			}
		}
		if(contadorDivisores == 0 ) {
			System.out.println("número " + numero + " é primo");
		} else {
			System.out.println("número " + numero + " não é número primo");
		}
		scan.close();
	}

}
