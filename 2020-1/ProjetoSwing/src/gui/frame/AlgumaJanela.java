package gui.frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.listeners.Listener;

public class AlgumaJanela extends JFrame {

	public AlgumaJanela() {

		
		this.setTitle("Uma Janela");

		this.setBounds(200, 100, 500, 500);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(new GridLayout(4, 1));

		JPanel p = new JPanel();
		p.setBounds(10, 0, 100, 100);
		p.setVisible(false);

		JButton btnVerde = new JButton("Verde");
		btnVerde.setBounds(0, 0, 30, 10);
		btnVerde.addActionListener(new Listener(p));

		JButton btnAmarelo = new JButton("Amarelo");
		btnAmarelo.setBounds(0, 0, 30, 10);
		btnAmarelo.addActionListener(new Listener(p));

		JButton btnVermelho = new JButton("Vermelho");
		btnVermelho.setBounds(0, 0, 30, 10);
		btnVermelho.addActionListener(new Listener(p));

		container.add(btnVerde);
		container.add(btnAmarelo);
		container.add(btnVermelho);
		container.add(p);
	}
}
