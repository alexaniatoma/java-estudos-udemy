package nelio.estruturaRepetitiva;

public class TesteDeMesaManualQuatro {

	public static void main(String[] args) {
		int x = 100;
		int y = 100;
		
		while(x != y) {
			System.out.println("olha");
			x = (int) Math.sqrt(y);
		}
	}

}
