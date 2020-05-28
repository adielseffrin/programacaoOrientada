package gui.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaSemLayout extends JFrame {
	
	public JanelaSemLayout() {
		
		this.setTitle("Janela sem layout");
		this.setBounds(200, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton botao = new JButton();
		botao.setText("Click-me");
		botao.setToolTipText("Dica do botão");
		botao.setBounds(20, 10, 100, 30);
		
		Container container = this.getContentPane();
		container.setLayout(null);
		
		container.add(botao);
	}
}
