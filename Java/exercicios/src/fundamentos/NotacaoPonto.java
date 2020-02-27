package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "Usuário");
		System.out.println(s);
		
		
		s = s.concat("!!!");
		System.out.println(s);
		
		
		String y = "Bom dia X".replace("X", "Gui");
		System.out.println(y);
		
	}
}
