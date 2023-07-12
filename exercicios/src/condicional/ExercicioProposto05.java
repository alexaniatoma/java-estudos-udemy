package condicional;
// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade desde item.
//A seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

// Codigo                               Especificação                       Preço
//     01       							Cachorro Quente						R$4,00
//     02									X-Salada								R$4,50
//     03									X-Bacon									R$5,00
//     04									Torrada Simples						R$2,00
//     05									Refrigerante							1,50


public class ExercicioProposto05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o código do produto");
		int codigo = scan.nextInt();
		
		System.out.println("Digite a quantidade do produto");
		int quantidade = scan.nextInt();
		
		double total=0;
		
		if(codigo == 1) {
			total = 4.00 * quantidade;
		}
		else if(codigo ==2) {
			total = 4.50 * quantidade;
		}
		else if(codigo ==3) {
			total = 5.00 * quantidade;
		}
		else if(codigo ==4) {
			total = 2.00 * quantidade;
		}
		else if(codigo ==5){
			total = 1.50 * quantidade;
		} 
		else {
			System.out.println("código inválido");
		}
		
		System.out.printf("Codigo %d Quantidade %d Total R$%.2f" , codigo, quantidade, total);
		
		
	
		
		
		
		scan.close();
		
	}

}
