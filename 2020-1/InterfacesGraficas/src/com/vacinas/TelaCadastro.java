package com.vacinas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastro {
	private JPanel panel;

	public TelaCadastro() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		
		JLabel lblNome = new JLabel("Nome");
		JTextField txtNome = new JTextField("nome");
		
		JLabel lblRaca = new JLabel("Raça");
		JTextField txtRaca = new JTextField("raca");
				
		JButton btnCadastro = new JButton("Ok");
		panel.add(lblNome);
		panel.add(txtNome);
		panel.add(lblRaca);
		panel.add(txtRaca);
		panel.add(btnCadastro);
		
	}

	public JPanel getPanel() {
		return panel;
	}
	
	public void show() {
		panel.setVisible(true);
	}
	
	public void hide() {
		panel.setVisible(false);
	}
	
	
}
