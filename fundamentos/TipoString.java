package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ola mundo".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		
		var nome = "Marcio";
		var sobrenome = "Gleik";
		var idade = 19;
		var salario = 5000.0D;
		String umaFrase = ("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario : " + salario);
		
		System.out.println(umaFrase);
		System.out.println(umaFrase);
		System.out.println(umaFrase.contains("Nome"));
		
	}
}
