package controle;

import java.util.Scanner;

public class DesafioWhile2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidadeDeNotas = 1;
		double nota = 0;
		double total = 0;
		

		while (nota != -1 ) {
			System.out.printf("Favor Inserir a %d � nota ou (ou -1 p/Sair): \n", quantidadeDeNotas);
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0 ) {
				
				total += nota;
				quantidadeDeNotas++;
				
			}else if  (nota != -1 ){
				System.out.println("Nota Inv�lida!!! ;D");
			}
			
			
		}
		// Calcular a m�dia
		double media = total / quantidadeDeNotas;
		System.out.println("M�dia = " + media);
		entrada.close();
	}

}
