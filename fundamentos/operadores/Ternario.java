package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		System.out.println("\nSobre sua nota: ");
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? "Aprovado" : "em recuperacao";
		
		System.out.println("O aluno esta " + resultadoFinal);
		
		System.out.println("\nSobre seu peso: ");
		double peso = 70;
		String resultadoPeso = peso > 70 ? "Gordo" : "Normal";
		System.out.println("Voce esta: " + resultadoPeso);
		
		System.out.println("\nHistorico escolar: ");
		double nota = 10;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.5;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Nao.";
		
		System.out.println("Teve bom comportamento? " + bomComportamento);
		System.out.println("Passou por media? " + passouPorMedia);
		System.out.printf("Tem desconto? %s", resultado);
	}
}
