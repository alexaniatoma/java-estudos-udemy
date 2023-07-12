package condicional;

import java.util.Scanner;

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
// pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class ExercicioProposto04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int horaInicial;
		int horaFinal;
		
		System.out.println("Digite a hora inicial");
		horaInicial = scan.nextInt();
		
		System.out.println("Digite a hora final");
		horaFinal = scan.nextInt();
		
		int duracao;
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial - horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s)");
		
		scan.close();
		
	}

}
