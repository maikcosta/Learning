package controle;

import java.util.Scanner;


public class WhilePositivo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int valor =	1;
		int soma = 0;
		while ( valor % 2 >= 0 ) {
			System.out.print("Favor inserir o numero: ");
			valor	=	entrada.nextInt();
			soma = soma + valor; 
			if(valor >= 0) {
			System.out.println("A Soma � " + soma );
			}else {
				System.out.println("Voc� inseriu um n�mero negativo!");
				break;
			}
		}
		entrada.close();
	}
}
