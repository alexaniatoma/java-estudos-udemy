package nelio.estruturaRepetitiva;

import java.util.Scanner;

/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
 * Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrada quando pelo menos uma de duas
 * coordenadas for NULA(nesta situação sem escrever mensagem alguma)
 */
public class PlanoCartesianoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		while( x != 0 && y !=0 ) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0 ) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x= scan.nextInt();
			y= scan.nextInt();
		}
		
		scan.close();

	}

}
