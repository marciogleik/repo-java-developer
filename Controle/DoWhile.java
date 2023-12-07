package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Voce precisa falar "
					+ "as palavras magicas...");
			System.out.print("Quer sair? ");
		} while(false);

		entrada.close();
	}
}
