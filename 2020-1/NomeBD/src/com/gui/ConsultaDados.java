package com.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.gui.buttons.TriangularButton;
import com.gui.buttons.TriangularReverseButton;

public class ConsultaDados extends JFrame {
	private JTextField id;
	private JTextField nome;
	private JTextField apelido;
	
	private JButton limpar;
	private ConsultarListener _consultarListener = new ConsultarListener(this);
	private JButton consultar;
	private TriangularButton next;
	private TriangularReverseButton prev;
	
	private JButton add;
	
	public ConsultaDados() {
		this.setTitle("Consulta dados pessoais");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(320,210);
		
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
		container.add(this.getAdd());
		container.add(this.getLimpar());
		container.add(this.getNext());
		container.add(this.getPrev());
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
			consultar.setBounds(205, 130, 90, 30);
			
			consultar.addActionListener(_consultarListener);
		}
		
		return consultar;
	}
	
	public JButton getLimpar() {
		if (limpar == null) {
			limpar = new JButton("Limpar");
			limpar.setBounds(107, 130, 90, 30);
			
			limpar.addActionListener(new LimparListener(this));
		}
		
		return limpar;
	}
	
	public JButton getAdd() {
		if (add == null) {
			add = new JButton("Save");
			add.setBounds(9, 130, 90, 30);
			
			add.addActionListener(new UpdateListener(this));
		}
		
		return add;
	}
	
	public TriangularButton getNext() {
		if (next == null) {
			next = new TriangularButton("");
			next.setName("Next");
			next.setBounds(230, 10, 30, 30);
			
			next.addActionListener(_consultarListener);
			next.setVisible(false);
		}
		
		return next;
	}
	
	public TriangularReverseButton getPrev() {
		if (prev == null) {
			prev = new TriangularReverseButton("");
			prev.setName("Prev");
			prev.setBounds(190, 10, 30, 30);
			
			prev.addActionListener(_consultarListener);
			
			prev.setVisible(false);
		}
		
		return prev;
	}
	
	public void habilitaCampos(boolean habilita) {
		this.getId().setEditable(habilita);
		this.getNome().setEditable(habilita);
		this.getApelido().setEditable(habilita);
		this.getNext().setVisible(!habilita);
		this.getPrev().setVisible(!habilita);
	}
}
