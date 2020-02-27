package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		// "final" -> Atribui um valor definitivo e final a variavel 
		final double pi = 3.14159;
		double area = pi * raio * raio;
		System.out.println(area);
		System.out.println();
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Área = "+ area);
	
	}

}
