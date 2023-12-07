package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// pós-fixada (operador depois do operando)
		a++; // a = a + 1;
		System.out.println(a);
		a--; // a = a - 1;
		System.out.println(a);
		
		// 
		++b; // b = b + 1;
		System.out.println(b);
		--b; // b = b - 1;
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);
		
	}
}
