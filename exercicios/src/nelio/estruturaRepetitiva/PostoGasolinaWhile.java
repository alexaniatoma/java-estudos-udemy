package nelio.estruturaRepetitiva;
/* Um posto de combustivel deseja determinar qual dos seus produtos tem a preferência de seus clientes.
 * Escreva um algoritmo para ler o tipo de combustivel abastecido(codificado da seguinte forma:
 * 1 Álcool;
 * 2 Gasolina;
 * 3 Diesel;
 * 4 Fim;
 * Caso o usuário informe um código inválido(fora da faixa 1 a 4 ) deve ser solicitado um novo código (até 
 * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
 * mensagem 'MUTO OBRIGADO"  e a quantidade de clientes que abasteceram cada tipo de combustivel.
 */

import java.util.Scanner;

public class PostoGasolinaWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o código correspondente: ");
		
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		
		int codigoDigitado = scan.nextInt();

			while(codigoDigitado != 4 ) {
				if(codigoDigitado ==1) {
					alcool = alcool + 1;
				}
				else if(codigoDigitado == 2) {
					gasolina = gasolina +1;
				}
				else if(codigoDigitado == 3) {
					diesel =  diesel + 1;
				}
				
				codigoDigitado = scan.nextInt();
		}
	
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println(("Diesel: " + diesel));
		System.out.println("Muito Obrigado!");
		
		scan.close();
		
		}
		
}


