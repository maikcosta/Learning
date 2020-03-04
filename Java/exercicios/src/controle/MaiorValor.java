package controle;

import java.util.Scanner;


public class MaiorValor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		System.out.println("Esse programa tem a finalidade de mostrar o maior numero digitado! ");
		for (int i = 3; i <= 3 && i > 0 ; i--) {
			System.out.print("Insira o valor: ");
			int valor = entrada.nextInt();

			if(valor > maior) {
				maior = valor;
			}
		}
		System.out.println("O maior valor foi: " + maior);
		entrada.close();
	}
}
