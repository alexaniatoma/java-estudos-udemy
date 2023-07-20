package controle.exercicios;

import java.util.Scanner;

/*Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par.
 */
public class Par {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		if(numero >= 0 && numero <=10) {
			if( numero % 2 == 0) {
				System.out.println(numero + " é par e está entre 0 e 10.");
			}
			else {
				System.out.println(numero + " não é par, mas está entre 0 e 10.");
			}
			}else {
				System.out.println("O " + numero + "não está entre 0 e 10.");
			}
			
		scan.close();
		}
		
		
	}

