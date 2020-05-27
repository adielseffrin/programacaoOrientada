package com.vacinas;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Topo {
	private  JPanel panel;
	
	public Topo(){
		panel = new JPanel();
		panel.add(new JLabel("Controle de vacinas"));
		panel.setBackground(Color.blue);
		panel.setVisible(true);
	}

	public JPanel getPanel() {
		return panel;
	}
	
	
	
	
}
