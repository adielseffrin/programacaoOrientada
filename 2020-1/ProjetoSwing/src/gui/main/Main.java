package gui.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import gui.frame.JanelaComBorderLayout;
import gui.frame.JanelaComFlowLayout;
import gui.frame.JanelaComGridLayout;
import gui.frame.JanelaSemLayout;
import gui.listeners.Listener;

public class Main {
	public static void main(String[] args) {
		//JanelaSemLayout nulo = new JanelaSemLayout();
		JanelaComFlowLayout flow = new JanelaComFlowLayout();
		//JanelaComGridLayout grid = new JanelaComGridLayout();
		//JanelaComBorderLayout border = new JanelaComBorderLayout();
		
		//nulo.setVisible(true);
		//flow.setVisible(true);
		//grid.setVisible(true);
		//border.setVisible(true);
		
		
		
		
		JPanel p = new JPanel();
		p.setBackground(Color.blue);
		p.setBounds(0, 0, 100, 100);
		p.setVisible(false);
		
		JButton btn = new JButton("Aperte aqui");
		btn.setBounds(0, 0, 30, 10);
		btn.addActionListener(new Listener(p));
		
		
		flow.add(p, BorderLayout.NORTH);
		flow.add(btn,BorderLayout.SOUTH);
			
		flow.setVisible(true);
		//JOptionPane.showMessageDialog(f, "OI");
	
		
		
		
	}
}
