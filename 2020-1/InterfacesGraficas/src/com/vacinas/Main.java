package com.vacinas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.galerao.JanelaComFlowLayout;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		JanelaPrincipal janela = new JanelaPrincipal();
		janela.setVisible(true);
		
		JanelaComFlowLayout j = new JanelaComFlowLayout();
		j.setVisible(true);
	}
}
