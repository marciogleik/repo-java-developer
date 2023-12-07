package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 3580.5);
		
		var p2 = new Produto("Pratos", 0);
		p2.nome = "Zeus Custom";
		p2.preco = 2350.00;
		Produto.desconto = 0.50;
		
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		
		System.out.printf("Seus %s ficaram no valor de = R$%.2f. ", p2.nome, p2.precoComDesconto());
		
	}
	
}
