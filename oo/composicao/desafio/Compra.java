package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(int qtde, Produto p) {
		this.itens.add(new Item(qtde, p));
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(qtde, produto));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: this.itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
