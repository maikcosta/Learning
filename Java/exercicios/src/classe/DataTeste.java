package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia	=	13;
		d1.mes	=	11;
		d1.ano  = 	1984;

		System.out.printf("A data digitada foi %d/%d/%d", d1.dia,d1.mes,d1.ano);

	}
}
