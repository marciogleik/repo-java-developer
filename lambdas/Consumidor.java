package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = 
				p -> System.out.printf(p.nome + "!!!");
				
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Notebook", 3008.50, 0.10);
		Produto p3 = new Produto("Caderno", 12.50, 0.21);
		Produto p4 = new Produto("Borracha", 4.50, 0.16);
		Produto p5 = new Produto("Lapis", 1.50, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
