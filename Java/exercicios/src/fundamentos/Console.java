package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d", 1,2,3);
		System.out.printf("Salário : %.1f\n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		String nome = entrada.nextLine();
		System.out.print("Digite seu Sobrenome:");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite sua idade:");
		int idade = entrada.nextInt();
		System.out.printf("Nome Completo: %s %s tem %d anos", 
				nome,sobrenome,idade);
		
		entrada.close();
	}

}
