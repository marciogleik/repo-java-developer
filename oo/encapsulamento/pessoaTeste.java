package oo.encapsulamento;

public class pessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Marcio","Gleik", -19);
		 p1.setSobrenome("Gleik"); // alterar
		 p1.setIdade(250); // alterar 
		
		System.out.println(p1.getIdade()); // ler
		System.out.println(p1); // toString
		System.out.println(p1.getNomeCompleto());
	}
}
