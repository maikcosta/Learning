package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Teste {
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(400);
		ferrari.velocidadeAtual = 0;
		
		
		Civic civic	= 	new Civic();
		civic.velocidadeAtual = 0;
		

		System.out.println("A velocidade atual do Civc é "+ civic.velocidadeAtual + "Km/h");
		System.out.println("A velocidade atual do Ferrari é "+ ferrari.velocidadeAtual + "Km/h");
		
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();

		
		System.out.println("A velocidade atual do Civc é "+ civic.velocidadeAtual + "Km/h");
		System.out.println("A velocidade atual do Ferrari é "+ ferrari.velocidadeAtual + "Km/h");
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println(ferrari.velocidadeDoAr());
		
		
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		
		System.out.println("A velocidade atual do Civc é "+ civic.velocidadeAtual + "Km/h");
		System.out.println("A velocidade atual do Ferrari é "+ ferrari.velocidadeAtual + "Km/h");
			
		ferrari.ligarTurbo();
		System.out.println(ferrari.velocidadeAtual);
	}

}
