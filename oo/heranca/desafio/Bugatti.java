package oo.heranca.desafio;

public class Bugatti extends Carro {
	

	public Bugatti() {
		super(350);
	}
	
	public Bugatti(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	

//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
	
	@Override
	public void freiar() {
		if(velocidadeAtual >= 0) {
			velocidadeAtual -= 10;
		}
	}
	
}
