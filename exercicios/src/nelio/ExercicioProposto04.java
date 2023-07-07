package nelio;

/*
 * Faça um programa que lei o número de um funcionário, seu numeros de horas trabalhadas,
 * o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário
 * do funcionário, com duas casas decimais.
 */
public class ExercicioProposto04 {
	public static void main(String[] args) {

		int id = 1;
		int hora = 200;
		double salarioHora = 20.50;

		double salarioTotal = salarioHora * hora;

		System.out.printf(" number = %d %n Salário R$ %.2f%n", id, salarioTotal);

	}

}
