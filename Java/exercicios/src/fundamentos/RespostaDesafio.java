package fundamentos;

public class RespostaDesafio {
	public static void main(String[] args) {
		double a	=	6 * (3 + 2);
		double a1	=	Math.pow(a, 2);
		double r1	=	a1 / (3*2);
		
		double b	= 	(1 - 5) * (2 - 7);
		double b1	= 	b / 2 ;
		double r2	=	Math.pow(b1, 2);
		
		double r3 	= 	r1 - r2;
		double r4   = 	Math.pow(r3, 3);
		
		double r5	=	Math.pow(10, 3);
		
		double f1	=	r4 / r5;
				
		System.out.println(r1);

		System.out.println(r2);
		
		System.out.println(r3);
		System.out.println(r4);
		
		
		System.out.println("Resultodo do Desafio é = " + f1 );

		
	}

}
