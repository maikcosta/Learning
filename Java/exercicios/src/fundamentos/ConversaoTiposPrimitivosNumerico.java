package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {
		
		double a = 1; // impl�cita
		System.out.println(a);
		
		float b = (float) 1.123456; //expl�cita (Cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c;
		
		System.out.println(d);
		
	}

}
