package lambdas;

//@FunctionalInterface For�a um �nico metodo
@FunctionalInterface
public interface Calculo {
	
	double executar (double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}

}
