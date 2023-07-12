package condicional;

import java.util.Scanner;

//Fazer um programa para ler um número e dizer se este número é
//par ou ímpar.
public class ExercicioProposto02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		
		scan.close();
	}
	

}
