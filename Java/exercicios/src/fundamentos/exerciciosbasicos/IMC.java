package fundamentos.exerciciosbasicos;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe seu peso");
		
		double peso = entrada.nextDouble();

		System.out.println("Informe seu altura Exemplo 1,56");
		double altura = entrada.nextDouble();
			
		double inferior = Math.pow(altura, 2);
		
		double resultado = (peso / inferior);
		
		entrada.close();
		
		System.out.println("Seu IMC é " + resultado);
				
				
		
	}

}
