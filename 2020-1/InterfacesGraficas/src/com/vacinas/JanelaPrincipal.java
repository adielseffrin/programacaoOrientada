package com.vacinas;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame{
	private MenuLateral ml;
	private Topo topo;
	private Conteudo conteudo;
	
	public JanelaPrincipal() {
		this.setSize(800, 800);
		
		Container pane = this.getContentPane();
		pane.setLayout(new BorderLayout());
		
		ml = new MenuLateral(this);
		topo = new Topo();
		
		conteudo = new Conteudo();
		
		pane.add(ml.getPanel(), BorderLayout.WEST);
		pane.add(topo.getPanel(), BorderLayout.NORTH);
		pane.add(conteudo.getPanel(), BorderLayout.CENTER);
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MenuLateral getMenuLateral() {
		return ml;
	}
	
	public Conteudo getConteudo() {
		return conteudo;
	}
	
	public Topo getTopo() {
		return topo;
	}
}
