package condicional;

import java.util.Scanner;

public class EstruturaCondicional {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		 
		int hora;
		
		
		 System.out.println("Que horas são?");
		 hora = scan.nextInt();
		 
		 if(hora <12) {
			 System.out.println("Bom dia!");
		 } 
		 else if(hora <18) {
			 System.out.println("Boa tarde!");
		 }
		 else {
			 System.out.println("Boa noite!");
		 }
		 
		 scan.close();
	}
	
}
