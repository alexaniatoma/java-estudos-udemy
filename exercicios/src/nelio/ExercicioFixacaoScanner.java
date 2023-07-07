package nelio;

import java.util.Scanner;

public class ExercicioFixacaoScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome;

		System.out.println("Qual é o seu nome?");
		nome = scan.next();
		
		int idade;
		System.out.println("Qual é a sua idade?");
		idade = scan.nextInt();
		
		System.out.println("Seu nome é : " + nome + " e a sua idade: " + idade + " anos");
		
		double nota;
		
		System.out.println("Digite o valor da sua nota");
		nota = scan.nextDouble();
		
		System.out.println("A nota digitada foi: " + nota); 

		scan.close();
	}

}
