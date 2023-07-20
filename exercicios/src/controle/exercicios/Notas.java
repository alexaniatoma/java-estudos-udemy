package controle.exercicios;

import java.util.Scanner;

/* Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 e 
 *imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso
 *contrário imprime no console "Reprovado".
 */
public class Notas {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota:");
		
		int soma = 0;
		int mediaFinal = 0;
		
		for(int i = 0 ; i < 2; i++) {
			int nota = scan.nextInt();
			soma +=nota;
			
			mediaFinal = soma/2;
		
		}
		System.out.println("A média é: "+ mediaFinal );
		if(mediaFinal >= 7) {
			System.out.println("Aprovado");
		}
		else if(mediaFinal < 7 && mediaFinal > 4) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
		}
		
		scan.close();
		
	}

}
