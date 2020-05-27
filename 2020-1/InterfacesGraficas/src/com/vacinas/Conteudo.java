package com.vacinas;


import javax.swing.JPanel;



public class Conteudo {
	private JPanel panel;
	
	public Conteudo() {
		panel = new JPanel();
		panel.add(new TelaCadastro().getPanel());
		panel.setVisible(true);
	}
	
	public JPanel getPanel() {
		return panel;
	}
	
}
