package oo.heranca.desafio;

public class Bugatti extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Bugatti() {
		super(350);
	}
	
	public Bugatti(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
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
