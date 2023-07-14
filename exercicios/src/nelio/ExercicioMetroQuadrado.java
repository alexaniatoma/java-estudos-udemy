package nelio;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMetroQuadrado {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Area");
		double largura = entrada.nextDouble();
		System.out.println("Comprimento");
		double comprimento = entrada.nextDouble();
		System.out.println("Valor do Metro Quadrado");
		double metroQuadrado = entrada.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n" , area);
		System.out.printf("Preço = %.2f%n" , preco);
		
		
		
		entrada.close();
	}

}
