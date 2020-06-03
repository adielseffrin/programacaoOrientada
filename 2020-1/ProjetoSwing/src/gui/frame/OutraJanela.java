package gui.frame;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.listeners.Listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

public class OutraJanela extends JFrame {

	//Criar construtor da janela
	public OutraJanela() {
		//Criar container para poder "desenhar" dentro do frame
		Container pane = this.getContentPane();
		
		JPanel painel = new JPanel();
		
		
		//Definir um layout
		painel.setLayout(new BoxLayout(painel,BoxLayout.PAGE_AXIS));
		painel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		
		painel.setSize(300,300);
		
		JButton botao1 = new JButton("Verde");
		botao1.setBackground(Color.green);
		botao1.setAlignmentX(Component.LEFT_ALIGNMENT);
		botao1.setAlignmentY(TOP_ALIGNMENT);
		
		JButton botao2 = new JButton("Vermelho");
		botao2.setBackground(Color.red);
		botao2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		botao2.setAlignmentY(TOP_ALIGNMENT);
		
		botao1.addActionListener(new Listener(painel));
		botao2.addActionListener(new Listener(painel));
		
		painel.add(botao1);
		painel.add(botao2);
		pane.add(painel, BorderLayout.CENTER);
		this.pack();
	
	}
}
