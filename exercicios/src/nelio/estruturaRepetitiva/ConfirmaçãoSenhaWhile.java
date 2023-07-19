package nelio.estruturaRepetitiva;

import java.util.Scanner;

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada,
//escrever a mensagem "Senha inválida. Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
// e o algoritmo encerado. Considere que a senha correta é o valor 2002.

public class ConfirmaçãoSenhaWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua senha");

		
		int senhaDigitada = 0;

	
			senhaDigitada = entrada.nextInt();
			
			while(senhaDigitada == 2002) {
				System.out.println("Acesso Permitido");
				senhaDigitada = entrada.nextInt();
			}
			System.out.println("Senha inválida");
			
				
					}
					
				
		}
		
	
	
		
		
	


