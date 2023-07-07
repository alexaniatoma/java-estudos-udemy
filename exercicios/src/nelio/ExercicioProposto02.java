package nelio;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostar o valor
 * da área deste círculo com quatro casas decimais conforme exemplos.
 */
public class ExercicioProposto02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio;
		
		System.out.println("Digite o valor do raio:");
		raio = scan.nextDouble();
		
		double resultado = pi * raio * raio;
		System.out.printf("O valor da área é : %.4f%n", resultado);

	}

}
