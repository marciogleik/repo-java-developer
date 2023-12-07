package fundamentos;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		int a = 10;
		
		int x = 6 * (3+2);
		int y = (1-5) * (2-7)/2;
		int z = (int) Math.pow(a, 3);
		
		int v = (int) Math.pow(x, 2);
		int vFinal = v / 3 * 2;
		int second = (int) Math.pow(y, 2);
		int resultado = vFinal - second;
		int resultadoSemiFinal = (int) Math.pow(resultado, 3);
		int resultadoFinal = resultadoSemiFinal / z;
		
		System.out.println(vFinal);
		
		System.out.println(resultadoFinal);
		
		
	}
}
