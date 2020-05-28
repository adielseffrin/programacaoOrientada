package com.vacinas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.vacinas.controller.Controller;

public class MenuLateral {
	private JPanel panel;
	private JanelaPrincipal master;
	
	

	public MenuLateral(JanelaPrincipal j) {
		panel = new JPanel();
		master = j;
		panel.setLayout(new GridLayout(4, 1));
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.addActionListener(new Controller(master));
		panel.add(btnCadastro);
		
		panel.add(new JButton("Consultar"));
		panel.add(new JButton("Agenda"));
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new Controller(master));
		panel.add(btnSair);
		
		panel.setVisible(true);
	}

	

	public JPanel getPanel() {
		return panel;
	}
	
	

}
