package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana");
		
		String diaSemana= scan.next();		
		if(diaSemana.equals("domingo")) {
			System.out.println("01");
		}
		else if(diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("02");
		} 
		else if(diaSemana.equalsIgnoreCase("terça")) {
				System.out.println("03");
		}
		else if(diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("04");
		}
		else if(diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("05");
		}
		else if(diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("06");
		}
		else if(diaSemana.equalsIgnoreCase("sabado")) {
			System.out.println("07");
		}
		else {
			System.out.println("dia inválido"); 
			
		}
		
		scan.close();
	}

}
