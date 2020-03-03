package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a Nota: ");
		
		double nota = entrada.nextDouble();
		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida!");
		} else if (nota >= 8.1) {
			System.out.println("Conteito A!");
		} else if (nota >= 6.1) {
			System.out.println("Conteito B!");
		} else if (nota >= 4.1) {
			System.out.println("Conteito C!");
		} else if (nota >= 2.1) {
			System.out.println("Conteito D!");
		}
		System.out.println("Fim!");
		entrada.close();

	}

}
