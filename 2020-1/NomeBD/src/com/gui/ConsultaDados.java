package com.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConsultaDados extends JFrame {
	private JTextField id;
	private JTextField nome;
	private JTextField apelido;
	
	private JButton consultar;
	
	public ConsultaDados() {
		this.setTitle("Consulta dados pessoais");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(310,210);
		
		Container container = this.getContentPane();
		container.setLayout(null);
		
		JLabel labelId = new JLabel("Id:");
		labelId.setBounds(10, 10, 80, 30);
		container.add(labelId);
		container.add(this.getId());
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setBounds(10, 50, 80, 30);
		container.add(labelNome);
		container.add(this.getNome());
		
		JLabel labelApelido = new JLabel("Apelido:");
		labelApelido.setBounds(10, 90, 80, 30);
		container.add(labelApelido);
		container.add(this.getApelido());
		
		container.add(this.getConsultar());
	}
	
	public JTextField getId() {
		if (id == null) {
			id = new JTextField();
			id.setBounds(100, 10, 80, 30);
		}
		
		return id;
	}
	
	public JTextField getNome() {
		if (nome == null) {
			nome = new JTextField();
			nome.setBounds(100, 50, 200, 30);
		}
		
		return nome;
	}
	
	public JTextField getApelido() {
		if (apelido == null) {
			apelido = new JTextField();
			apelido.setBounds(100, 90, 200, 30);
		}
		
		return apelido;
	}
	
	public JButton getConsultar() {
		if (consultar == null) {
			consultar = new JButton("Consultar");
			consultar.setBounds(195, 130, 105, 30);
			
			consultar.addActionListener(new ConsultarListener(this));
		}
		
		return consultar;
	}
	
	public void habilitaCampos(boolean habilita) {
		this.getId().setEditable(habilita);
		this.getNome().setEditable(habilita);
		this.getApelido().setEditable(habilita);
	}
}
