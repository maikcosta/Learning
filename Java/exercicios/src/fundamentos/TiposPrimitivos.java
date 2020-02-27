package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações de funcionário
		
		
		// Tipos numericos inteiros
		byte anosDeEmpresa	=	23;
		short numeroDeVoos	=	542;
		int	id	=	56789;
		long pontosAcumulados = 1_234_845_223L;
		
		// Tipos numeros reais
		float salario	= 11_445.44F;
		double vendasAcumuladas	=	2_991_797_103.01;
		
		//Tipos booleano
		boolean estaDeFerias	=	false;
		
		//Tipo Caracter
		char status	= 'A';
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + "ganha -> " + salario);
		System.out.println("Férias " + estaDeFerias);
		System.out.println("Status ola ->" + status);
		
	}

}
