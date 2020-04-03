package oo.heranca.desafio;

public class Teste {
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
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
		
		
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		
		System.out.println("A velocidade atual do Civc é "+ civic.velocidadeAtual + "Km/h");
		System.out.println("A velocidade atual do Ferrari é "+ ferrari.velocidadeAtual + "Km/h");
			
		
	}

}
