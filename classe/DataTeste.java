package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 26;
		d1.mes = 12;
		d1.ano = 2005;
		
		var d2 = new Data();
		d2.dia = 1;
		d2.mes = 04;
		d2.ano = 1952;
		
		System.out.println(d1.obterData());
		
		
	}
}
