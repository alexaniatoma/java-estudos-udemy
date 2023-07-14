package controle;

import java.util.Scanner;

public class DesafioDoisWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota= 0;
		double total =0;
		double quantidadeDeNotas =0;
		
		while(!(nota == -1)) {
		System.out.println("Digite uma nota: ");
		nota = entrada.nextDouble();	
		
		if(nota >=0 && nota <=10) {
			
			total +=nota;
			quantidadeDeNotas ++;
			
		}
		
	  }
		double media = total / quantidadeDeNotas;
		System.out.println("A media das notas é " + media);
	
		entrada.close();
	}
	
	
	

}
