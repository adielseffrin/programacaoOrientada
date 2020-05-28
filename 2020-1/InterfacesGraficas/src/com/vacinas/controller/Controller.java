package com.vacinas.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.vacinas.JanelaPrincipal;
import com.vacinas.TelaCadastro;

public class Controller implements ActionListener {
	private JanelaPrincipal jp;
	
	public Controller(JanelaPrincipal j) {
		jp = j;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton fonte = (JButton) e.getSource();
		executarAcao(fonte.getText());

	}

	public void executarAcao(String fonte) {
		switch (fonte) {
		case "Cadastrar":
			jp.getConteudo().getCadastro().show();
			break;
		case "Sair":
			System.exit(0);
			break;
		default:
			System.out.println("Não implementado");
		}
	}

}
