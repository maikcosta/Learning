package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia: ");
		
		double media = entrada.nextDouble();
		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
		}

		if (media < 7 && media >= 4.5){
		System.out.println("Recupera��o");	
		}
		
		if (media < 4.4 && media >= 1){
		System.out.println("Reprovado!");	
		}		
		
		if (media > 10 || media < 0) {
		System.out.println("Essa � uma m�dia inv�lida");
		}
		entrada.close();
		
		
	}

}


