package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		
		boolean trabalho1 = true;
		
		// Trabalho na quinta (V ou F)
		
		boolean trabalho2 = false;
		
		boolean tv50	= trabalho1 && trabalho2;
		boolean tv32	= trabalho1 ^ trabalho2;
		boolean sorvete	= trabalho1 || trabalho2;
		
		System.out.println("Vamos comprar a tv de 50' " + tv50 +
				"\nVamos comprar a tv de 32' " + tv32 + 
				"\nVamos tomar sorvete ? " + sorvete);
		
		
		
		//Comprar TV
	}

}
