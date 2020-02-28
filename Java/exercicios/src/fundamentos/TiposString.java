package fundamentos;

public class TiposString {

	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(4));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boA TArde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.98;
		
		System.out.println("Nome:" + nome + "\nSobrenome" + sobrenome + "\nIdade" + idade + "\nSalario" + salario);
	}

}
