package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// se os dois derem certo TV de 50 polegadas no FDS;
		// se apenas um dos dois TV de 32 polegadas;
		// se comprar qualquer TV toma sorvete
		// se n trabalhar nenhum dia n tem nada
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		System.out.println("Comprou tv de 50\" ? " + comprouTv50);
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou tv de 32\" ? " + comprouTv32);
		boolean tomaSorvete = trabalho1 || trabalho2;
		System.out.println("Toma sorvete\" ? " + tomaSorvete);
	}
}
