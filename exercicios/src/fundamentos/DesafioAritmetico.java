package fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {

		int a = (6 * (3 + 2));
		int totalA = (int) Math.pow(a, 2) / (3 * 2);

		int b = (1 - 5) * (2 - 7) / 2;
		int totalB = (int) Math.pow(b, 2);

		int c = totalA - totalB;
		int totalC = (int) Math.pow(c, 3);

		int d = (int) Math.pow(10, 3);
		int resultado = totalC / d;

		//System.out.println(totalA);
		//System.out.println(totalB);
		//System.out.println(totalC);
		System.out.println("O resultado da expressão aritmetica é: " + resultado);

	}
}
