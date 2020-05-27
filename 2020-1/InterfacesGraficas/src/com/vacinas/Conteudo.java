package com.vacinas;


import javax.swing.JPanel;



public class Conteudo {
	private JPanel panel;
	private TelaCadastro cadastro;
	
	public Conteudo() {
		cadastro = new TelaCadastro();
		cadastro.hide();
		
		panel = new JPanel();
		panel.add(cadastro.getPanel());
		panel.setVisible(true);
	}
	
	public JPanel getPanel() {
		return panel;
	}
	
	public TelaCadastro getCadastro() {
		return cadastro;
	}
}
