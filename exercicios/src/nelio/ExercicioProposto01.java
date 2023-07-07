package nelio;

import java.util.Scanner;

/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar
 * na tela a soma desses números com uma mensagem explicativa,
 * conforme exemplos
 */

public class ExercicioProposto01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero1;
		int numero2;
	
	
		System.out.println("Digite um número");
		numero1 = scan.nextInt();
		
		System.out.println("Digite outro número");
		numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("A Soma dos números é: " + resultado );
		
		scan.close();
		
	}
	

}
