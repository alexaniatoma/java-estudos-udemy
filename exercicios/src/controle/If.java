package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a média");
		double media = scan.nextDouble();
		
		if(media <=10 && media >= 7.0 ) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		scan.close();
	}

}
