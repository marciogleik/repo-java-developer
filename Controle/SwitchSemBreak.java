package Controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		String faixa = "amarela";
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("preto");
		case "marrom":
			System.out.println("marrom");
		case "amarela":
			System.out.println("amarelo");
		case "branco":
			System.out.println("branco");
		default:
			System.out.println("APENAS!");
		}
	}
}
