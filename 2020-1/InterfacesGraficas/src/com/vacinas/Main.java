package com.vacinas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JanelaPrincipal janela = new JanelaPrincipal(false);
		Container pane = janela.getContentPane();
		pane.setLayout(new BorderLayout());
		
		MenuLateral ml = new MenuLateral(janela);
		
		Topo topo = new Topo();
		
		Conteudo conteudo = new Conteudo();
		
		pane.add(ml.getPanel(), BorderLayout.WEST);
		pane.add(topo.getPanel(), BorderLayout.NORTH);
		pane.add(conteudo.getPanel(), BorderLayout.CENTER);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		
		
		
		
			
	}

}
