package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String valor="";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Digite aqui: ");
			valor = scan.nextLine();
		}
		
		scan.close();
		
	}
	
}
