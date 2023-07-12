package condicional;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int valor = scan.nextInt();
		String dia = "";

		switch (valor) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Dia inválido";
			break;
		}

		System.out.println("Dia da semana: " + dia);
		
		scan.close();
		

	}

}
