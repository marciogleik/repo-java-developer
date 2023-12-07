package oo.encapsulamento.casaA;

public class Ana {

	@SuppressWarnings("unused")
	private String segredo = "..."; // valor privado só pode ser usado na propria classe
	String facoDentroDeCasa = "..."; // default ou pacote
	protected String formaDeFalar = "..."; // pode ser visto dentro da propria classe e pode ser transmitido por herança
	public String todosSabem = "..."; // todas as classes tem acesso
}
