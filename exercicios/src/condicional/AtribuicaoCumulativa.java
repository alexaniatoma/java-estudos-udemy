package condicional;

import java.util.Locale;
import java.util.Scanner;

//Uma operadora de telefonia cobra R$50,00 por um plano básico que dá direito a 100 minutos de telefone.
//Cada minuto que excedera franquia de 100 minutos custa R$2,00. Fazer um programa para ler a quantidade de minutos que uma pessoas
// consumiu, dái mostrar o valor a ser pago.

public class AtribuicaoCumulativa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double plano = 50.00;
		
		int minutos = scan.nextInt();
		if(minutos > 100 ) {
			plano += (minutos - 100) * 2 ;
		}
		
		System.out.printf(" O valor da conta é R$ %.2f" , plano);
	}

}
