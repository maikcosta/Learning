package controle;

import java.util.Scanner;

public class Adivinha {
	public static void main(String[] args) {
		int	secreto	=	75;
		System.out.println("O jogo tem como objetivo descobrir o numero entre "
				+ "(0 ~ 100), com total de 3 tentativas!");

		for (int i = 2; i <= 2 && i >= 0; i--) {
			System.out.println("Vamos lá digite seu número: ");
			Scanner entrada = new Scanner(System.in);
			int valor	=	entrada.nextInt();
			String palpites	= String.valueOf(valor);
			if ( valor > secreto) {
				System.out.printf("Número %d é MAIOR do que o secreto! "
						+ "\n Agora restam %d tentativas"
						+ "\n Chutes [%s] \n", valor, i , palpites);
				continue;
			} else if ( valor < secreto) {
				System.out.printf("Número %d é MENOR que o secreto! "
						+ "\n Agora restam %d tentativas"
						+ "\n Chutes [%s] \n", valor, i , palpites);
				continue;
			} else if ( valor == secreto) {
				System.out.printf("Parabéns vc acertou "
						+ "\n Restaran %d tentativas!", i);
				break;
			}
			entrada.close();
		}
	}
}
