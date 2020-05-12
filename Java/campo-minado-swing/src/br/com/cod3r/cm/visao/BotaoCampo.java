package br.com.cod3r.cm.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import br.com.cod3r.cm.modelo.Campo;
import br.com.cod3r.cm.modelo.CampoEvento;
import br.com.cod3r.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton 
	implements CampoObservador, MouseListener{
	
	private final Color BG_PADRAO = new Color(184,184,184);
	private final Color BG_MARCADO = new Color(8,179,247);
	private final Color BG_EXPLODIR = new Color(189,66,68);
	private final Color TEXTO_VERDE = new Color(0,100,0);
	private Campo campo; 
	
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));
		
		addMouseListener(this);
		campo.registrarObservador(this);
		
	}
	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch(evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstuloPadrao();
		}
	}
	private void aplicarEstiloAbrir() {
	}
	private void aplicarEstiloMarcar() {
	}
	private void aplicarEstiloExplodir() {
	}
	private void aplicarEstuloPadrao() {
	}
	//Interface dos eventos do mouse
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton()==1) {
			System.out.println("Bot�o Esquerdo!");
		}else {
			System.out.println("Bot�o Direito!");
		}
		
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
}
