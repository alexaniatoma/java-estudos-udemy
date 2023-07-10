package fundamentos;

import java.util.Scanner;

//num1
//num2
//operadores aritmeticos + / - / / / * 

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite outro numero");
		double num2 = scan.nextDouble();
		
		System.out.println("Qual é a operacação aritmetica");
		String operacao = scan.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao ) ? num1 - num2 : resultado;
		
		resultado="*".equals(operacao) ? num1 * num2: resultado;
		
		resultado="/".equals(operacao) ? num1 / num2: resultado;

		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao,num2, resultado);
	
			
		}
		
		
}


