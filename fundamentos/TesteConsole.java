package fundamentos;

import java.util.Scanner;

public class TesteConsole {

	public static void main(String[] args) {
		System.out.println("Bom Dia!");
		System.out.printf("Bom Dia\n");
		System.out.println("Flor");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Quanto voce recebe? ");
		Double salario = entrada.nextDouble();
		
		System.out.println(nome + " Recebe R$:" + salario + " reais.");
		
		entrada.close();
	}
}
