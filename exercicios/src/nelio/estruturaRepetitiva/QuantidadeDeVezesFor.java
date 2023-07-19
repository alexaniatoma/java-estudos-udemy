package nelio.estruturaRepetitiva;

import java.util.Scanner;

public class QuantidadeDeVezesFor {
public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);
	
int n = scan.nextInt();
int soma = 0;
	for(int i = 0 ; i < n; i++) {
		int x = scan.nextInt();
		soma = soma + x;
	
		
	}
	
	System.out.println("soma = " + soma);
	scan.close();
		
	}

}
