package fundamentos;

public class DesafioTabelaVerdade {
	public static void main(String[] args) {

		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false; 

		if (trabalhoTerca && trabalhoQuinta) {
			System.out.println("Comprar Tv 50pol. e tomar sorvete");
		} else if (trabalhoTerca || trabalhoQuinta) {
			System.out.println("Comprar TV 32pol. e tomar sorvete");
		}else {
			System.out.println("Sem TVs e sem Sorvete");
		}
	}
}
