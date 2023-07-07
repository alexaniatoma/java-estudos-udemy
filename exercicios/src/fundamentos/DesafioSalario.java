package fundamentos;

import java.util.Scanner;

public class DesafioSalario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String salario1;
		String salario2;
		String salario3;

		System.out.println("Digite o valor do seu salário deste mês:");
		salario1 = scan.nextLine().replace(",", ".");

		System.out.println("Digite o valor do seu salário mês passado:");
		salario2 = scan.nextLine().replace(",", ".");

		System.out.println("Digite o valor do seu salário mês retrasado:");
		salario3 = scan.nextLine().replace(",", ".");

		double mediaSalario1 = Double.parseDouble(salario1);
		double mediaSalario2 = Double.parseDouble(salario2);
		double mediaSalario3 = Double.parseDouble(salario3);

		double resultado = (mediaSalario1 + mediaSalario2 + mediaSalario3) / 3;
		System.out.printf("A media salarial é %.2f", resultado);

		scan.close();

	}

}
