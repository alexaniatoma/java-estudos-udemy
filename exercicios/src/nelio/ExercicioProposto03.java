package nelio;
/*
 * Faça um programa para ler os números inteiros A, B, C, e D. A seguir, calcule e mostre a diferença
 * do produto de A e B pelo C e D segundo a fórmula:
 * DIFERENCA = (A * B - C * D)
 */

import java.util.Scanner;

public class ExercicioProposto03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("Digite um valor para a letra a");
		a =  scan.nextInt();
		
		System.out.println("Digite um valor para a letra b");
		b =  scan.nextInt();
		
		System.out.println("Digite um valor para a letra c");
		c =  scan.nextInt();
		
		System.out.println("Digite um valor para a letra d");
		d =  scan.nextInt();
		
		int resultado = a * b - c * d;
		
		System.out.println("A diferença é : " + resultado);
		
	}

}
