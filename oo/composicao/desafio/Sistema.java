package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Consolo", 100, 4);
		compra1.adicionarItem("Macaco de pelucia", 85, 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Pirocas", 1, 400);
		compra2.adicionarItem("Mamadeira", 10, 76);
		
		Cliente clienteDaLoja = new Cliente("Samuel Machado");
		clienteDaLoja.adicionarCompra(compra1);
		clienteDaLoja.compras.add(compra2);
		
		
		System.out.println(clienteDaLoja.obterValorTotal());
		
	}
}
