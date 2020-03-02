package fundamentos.exerciciosbasicos;

import javax.swing.JOptionPane;

public class QuadradoCubo {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		
		//System.out.println(valor1);
		
		double quadrado = Math.pow(Double.parseDouble(valor1),2);
		double cubo = Math.pow(Double.parseDouble(valor1),4);
				
		System.out.printf("O valor ao quadrado é %s e ao cubo %s", quadrado, cubo);
		
	}

}
