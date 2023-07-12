package condicional;

import java.util.Scanner;

//Fazer um programa para ler um numero inteiro, e depois dizer se este
// é negativo ou não.

public class ExercicioProposto01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número");
		
	
		numero = scan.nextInt();
		
		if(numero <0) {
			System.out.println(numero + " Negativo");
		} else {
			System.out.println(numero + " Positivo");
		}
		
		scan.close();
	}

}
