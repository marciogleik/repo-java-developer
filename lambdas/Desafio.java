package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.50);
		
		BinaryOperator<Double> valorBruto = (produto, desconto) -> p.preco *(1 - p.desconto);
		double valorCalculado = valorBruto.apply(p.preco, p.desconto);

		
		BiFunction<Double, Double, Double> impostoMunicipal = (produto, desconto) -> {
			if ( valorCalculado >= 2500 ) {
				return valorCalculado + valorCalculado * 8.5 / 100;
			} else {
				return valorCalculado;
			}
		};
		
		double valorComImposto = impostoMunicipal.apply(p.preco, p.desconto);
	
		
		Function<Double, Double> valorFrete = valor -> {
			if ( valor >= 3000 ) {
				return valor + 100;
			} else {
				return valor + 50;
			}
		};
		
		double valorComFrete = valorFrete.apply(valorComImposto);

		
		System.out.println("Valor final: " + formatarDuasCasasDecimais(valorComFrete));
		
	}
	
	private static String formatarDuasCasasDecimais(double valor) {
		return String.format("R$%.2f",valor);
	}
}
