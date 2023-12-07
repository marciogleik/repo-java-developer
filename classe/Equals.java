package classe;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(null);
		u1.nome = "Gleik";
		u1.email = "marcio.junioor@gmail.com";
		Usuario u2 = new Usuario(null);
		u2.nome = "Gleik";
		u2.email = "marcio.junioor@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		
		System.out.println(new Date());
	}
}
