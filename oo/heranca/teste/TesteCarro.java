package oo.heranca.teste;

import oo.heranca.desafio.Bugatti;
import oo.heranca.desafio.Carro;
import oo.heranca.desafio.City;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro city = new City();
		
		city.acelerar();
		city.acelerar();
		city.acelerar();
		city.acelerar();
		city.acelerar();
		city.acelerar();
		city.acelerar();
		
		System.out.println("velocidade city => " + city.velocidadeAtual);
		
		city.freiar();
		
		System.out.println("velocidade city => " + city.velocidadeAtual);
		
		Carro bugatti = new Bugatti();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();
		bugatti.acelerar();

		
		System.out.println("velocidade bugatti => " + bugatti.velocidadeAtual);
		
		bugatti.freiar();
		
		System.out.println(bugatti);
		System.out.println(city);
	}
}
