package condicional;

import java.util.Locale;
import java.util.Scanner;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes
//intevalos (0,25) , (25,50), (50,75), (75,100) este valor se encontra. Obviamente se o valor não estiver em nenhum destes 
//intervalors, deverá ser impressa a mensagem "Fora de intervalo".

public class ExercicioProposto06 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite um intervalo");
		double intervaloDigitado = scan.nextDouble();
		
	
		if(intervaloDigitado == 0 || intervaloDigitado <= 25.0) {
			System.out.println("intervalo entre 0 , 25");
		}
		else if(intervaloDigitado >=25.1 && intervaloDigitado <50.0) {
			System.out.println("intervalo entre 25 , 50");
		} 
		else if(intervaloDigitado >=50.1 && intervaloDigitado <=75.0) {
			System.out.println("intervalo entre 50 , 75");
		}
		else if(intervaloDigitado >= 75.1 && intervaloDigitado <=100.0) {
			System.out.println("intervalo entre 75 , 100");
		}
		else {
			System.out.println("Fora de intervalo");
			
		}
		
		
		scan.close();
		

	}

}
