package excecao.personalizadaB;

import streams.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("", -7);
			Validar.aluno(aluno);
		} catch (StringVaziaExpection e) {
			System.out.println(e.get);
		}
		
		System.out.println("Fim ;)");
	}

}
