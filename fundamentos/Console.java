package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.println("Tom: D");
		
		String Progressao = "Bm, A, G";
		System.out.println("Mais de Ti");
		System.out.println("Progressao Pre-Refrao: " + Progressao);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite musica que deseja adicionar ao repertorio: ");
		String musicaAdicionada = entrada.nextLine();
		
		System.out.println("Qual o tom de " + musicaAdicionada + " ?");
		String tomMusica = entrada.nextLine();
			
		System.out.println(musicaAdicionada + " no tom de " + tomMusica + " Adicionada com sucesso.");
	}
}
