package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (�F - 32) * 5/9= �C
		
		double f	=	86;
		final double ajuste = 32;
		double fator	=	5/9.0;
		double resultado = ((f - ajuste)* fator); 
		System.out.println("A convers�o de �F para �C resultou em = " + resultado + "�");
		

	}
}
