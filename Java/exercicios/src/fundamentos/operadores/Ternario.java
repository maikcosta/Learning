package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double nota = 7.6;
		String resultado = nota >= 7.0 ? 
				"Aprovado" : "em recupera��o";

		System.out.println("O Aluno est� : " + resultado);

	}
}
