package com.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.gui.buttons.TriangularButton;
import com.gui.buttons.TriangularReverseButton;
import com.nomeBD.BD.ConexaoMysql;

public class ConsultaDados extends JFrame {
	private JTextField id;
	private JTextField nome;
	private JTextField apelido;
	
	private JButton limpar;
	private ConsultarListener _consultarListener = new ConsultarListener(this);
	private JButton consultar;
	private JButton excluir;
	
	private TriangularButton next;
	private TriangularReverseButton prev;
	
	private DefaultTableModel modelo;
	private JPanel painelTabela;
	private JScrollPane scrollPane;
	private JTable tabela;
	
	private JButton add;
	
	private ConexaoMysql conexao;
	
	public ConsultaDados() {
		this.setTitle("Consulta dados pessoais");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(500,410);
		
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
		container.add(this.getExcluir());
		container.add(this.getNext());
		container.add(this.getPrev());
		container.add(this.getPainelTabela(this.getScrollPane(this.getTabela())));
		
		
		
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
			consultar.setBounds(250, 130, 110, 30);
			
			consultar.addActionListener(_consultarListener);
		}
		
		return consultar;
	}
	
	
	public JButton getLimpar() {
		if (limpar == null) {
			limpar = new JButton("Limpar");
			limpar.setBounds(130, 130, 110, 30);
			
			limpar.addActionListener(new LimparListener(this));
		}
		
		return limpar;
	}
	
	public JButton getAdd() {
		if (add == null) {
			add = new JButton("Salvar");
			add.setBounds(9, 130, 110, 30);
			
			add.addActionListener(new UpdateListener(this));
		}
		
		return add;
	}
	
	public JButton getExcluir() {
		if (excluir == null) {
			excluir = new JButton("Excluir");
			excluir.setBounds(370, 130, 110, 30);
			
			excluir.setEnabled(false);
			excluir.addActionListener(new ExcluirListener(this));
		}
		
		return excluir;
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
	
	public JTable getTabela() {
		if (tabela == null) {
			tabela = new JTable(this.getModelo());
			modelo.addColumn("id");
			modelo.addColumn("Nome");
			modelo.addColumn("Apelido");
			modelo.addColumn("Idade");
			tabela.setVisible(true);
		}
		
		return tabela;
	}
	
	public JPanel getPainelTabela(JScrollPane scrollPane) {
		if (painelTabela == null) {
			painelTabela = new JPanel();
			painelTabela.setLayout(new GridLayout(1,1));
			painelTabela.setBounds(10, 165, 470, 200);
			painelTabela.setVisible(true);
			painelTabela.add(scrollPane);
		}
		
		return painelTabela;
	}
	
	public DefaultTableModel getModelo() {
		if(modelo == null) {
			modelo = new DefaultTableModel();
		}
		
		return modelo;
	}
	
	public JScrollPane getScrollPane(JTable tabela) {
				
		if (scrollPane == null) {
			scrollPane = new JScrollPane(tabela);
			scrollPane.setVisible(true);
		}
		
		return scrollPane;
	}
	
	public void habilitaEdicao(boolean habilita) {
		this.getNome().setEditable(habilita);
		this.getApelido().setEditable(habilita);
	}
	
	public void habilitaCampos(boolean habilita) {
		this.getId().setEditable(habilita);
		this.getNext().setVisible(!habilita);
		this.getPrev().setVisible(!habilita);
		
		this.getExcluir().setEnabled(!habilita);
	}
	
	public ConexaoMysql getConexaoMysql() throws ClassNotFoundException, SQLException {
		if (conexao == null) {
			conexao = new ConexaoMysql();
			conexao.conectarMySQL();
		}
		
		return conexao;
	}
}
