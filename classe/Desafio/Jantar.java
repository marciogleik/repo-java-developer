package classe.Desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.250);
		
		var c2 = new Comida("Feijao", 0.300);
		
		Pessoa p = new Pessoa("Marcio", 69.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
	}
}
