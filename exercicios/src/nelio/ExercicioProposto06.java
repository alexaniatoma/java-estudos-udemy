package nelio;

/*
 * Faça um program que leia tres valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
 * a) a área do triangulo retangulo que tem A por base e c por altura.
 * b) a área do circulo de raio C(pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * e) a área do retangulo que tem lados A e B.
 */
public class ExercicioProposto06 {
	public static void main(String[] args) {
		
		double A = 12.7;
		double B = 10.4;
		double C = 15.2; ;
		
		double resultadoTrianguloRetangulo = (A * C) / 2;
		double resultadoCirculo = C * C * 3.14159;
		double resultadoTrapezio = ( A + B) * C / 2;
		double resultadoQuadrado = B * B;
		double resultadoRetangulo = A * B ;
		
		System.out.printf("Triangulo: %.3f %n" , resultadoTrianguloRetangulo);
		System.out.printf("Circulo: %.3f %n" , resultadoCirculo);
		System.out.printf("Trapezio: %.3f %n" , resultadoTrapezio);
		System.out.printf("Quadrado: %.3f %n", resultadoQuadrado);
		System.out.printf("Retangulo: %.3f %n", resultadoRetangulo);
	}
}
