package condicional;

import java.util.Scanner;

// Faça um programa que leia 02 valores interiro (A, B). Após o programa deve mostrar
//uma mensagem "São Multiplos" ou "Não são multiplos", indicando se os valores lidos são
//multiplos entre si. Atenção: os numeros podem ser digitados em ordem crescente ou decrescente.

public class ExercicioProposto03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeroA;
		int numeroB;
		
		System.out.println("Digite um numero");
		numeroA = scan.nextInt();
		
		System.out.println("Digite outro numero");
		numeroB = scan.nextInt();
		
		if(numeroA % numeroB == 0 || numeroB % numeroA == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		
		
		
		
		scan.close();
	}

}
