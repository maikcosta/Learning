package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {

		// if (boolean)...
		// while (boolean)...
		// for (;boolean;)...
		// switch ()

		String faixa = "preta";
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marron":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heain Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
		case "branca":
			System.out.println("Não sei nada");
		}
	}
}
