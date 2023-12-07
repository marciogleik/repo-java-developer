package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 1, 2003);
		Data d2 = d1; // atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;

		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
