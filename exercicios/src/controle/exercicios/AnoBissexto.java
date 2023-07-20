package controle.exercicios;

// Criar um programa que informa se o ano atual é ano bissexto. 
 
public class AnoBissexto {
	public static void main(String[] args) {
		
		int ano = 1996;
			
		if(ano % 4 ==0) {
			System.out.println(" É bissexto");
		} else {
			System.out.println("Não é bissexto");
		}
	}

}
