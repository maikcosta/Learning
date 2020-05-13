package br.com.cod3r.calc.visao;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	public Calculadora() {
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Calculadora();
	}

}
