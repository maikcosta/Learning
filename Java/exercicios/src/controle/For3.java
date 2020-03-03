package controle;

public class For3 {
	public static void main(String[] args) {
		int i = 0; // Fora do escopo consegue utilizar em outros FOR
		for(i = 0; i < 10 ; i++) {
			System.out.printf("Valor de I %d \n",i);
		}
		System.out.printf("Fora do laço I %d \n",i);
	}
}
