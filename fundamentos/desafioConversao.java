package fundamentos;

import java.util.Scanner;

public class desafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o salario do primeiro funcionario: ");
		String salarioString = entrada.nextLine().replace(",", ".");
		System.out.println("Salario segundo funcionario: ");
		String salarioString2 = entrada.nextLine().replace(",", ".");
		System.out.println("Salario terceiro funcionario: ");
		String salarioString3 = entrada.nextLine().replace(",", ".");
		
		double salario = Double.parseDouble(salarioString);
		double salario2 = Double.parseDouble(salarioString2);
		double salario3 = Double.parseDouble(salarioString3);
		
		double soma = salario + salario2 + salario3;
		
		System.out.println("Media salarial entre os funcionarios: " + soma / 3);
		
		entrada.close();
	}
}

