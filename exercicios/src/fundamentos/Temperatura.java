package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
//		(ºF - 32) x 5/9 = ºC
		int ajuste = 32;
		double fator = 5.0 / 9;

		double fahrenheit = 86;
		double celsius = (fahrenheit - ajuste) * fator;
		System.out.println(celsius);

		fahrenheit = 150;
		celsius = (fahrenheit - ajuste) * fator;
		System.out.printf("O resultado da temperatura é em: %.4f celsius%n" , celsius );
		
		

	}

}
