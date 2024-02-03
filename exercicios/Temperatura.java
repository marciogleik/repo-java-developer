package exercicios;

public class Temperatura {
	
	public static void main(String[] args) { 
		System.out.println("Digite a temperatura em fahrenheit");
		double fahrenheit = 89;
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		double celsius = FATOR * (fahrenheit - AJUSTE);
		
		System.out.println("O resultado: " + celsius + "ºC");
	}
}
