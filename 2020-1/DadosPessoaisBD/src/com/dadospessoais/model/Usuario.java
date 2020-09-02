package com.dadospessoais.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.dadospessoais.BD.ConexaoMysql;

public class Usuario {
	private String nome;
	private int id;
	private int idade;
	private String apelido;

	private ConexaoMysql conexao;

	public Usuario(ConexaoMysql c) {
		conexao = c;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public void carregaUser(int id) {
		try {
			conexao.conectarMySQL(); // abri a conexão
			String query = "select * from dados_pessoais WHERE id = ?";
			PreparedStatement preparedStatement = conexao.connection.prepareStatement(query);
			preparedStatement.setInt(1, id);

			ResultSet rs = preparedStatement.executeQuery();

			if (rs.first()) {
				this.id = id;
				nome = rs.getString("nome");
				apelido = rs.getString("apelido");
				idade = rs.getInt("idade");
			}

			conexao.FecharConexao();
		} catch (Exception e) {

		}
	}
	
	public void exibirDados() {
		
	}

	public boolean atualizaUser(int id) {
		carregaUser(id);
		nome = atualizaNome();
		apelido = atualizaApelido();
		idade = atualizaIdade();
		boolean retorno = false;
		
		try {
			conexao.conectarMySQL(); // abri a conexão
			String query = "update dados_pessoais SET nome = ?, apelido = ?, idade = ? WHERE id = ?";
			PreparedStatement preparedStatement = conexao.connection.prepareStatement(query);
			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, apelido);
			preparedStatement.setInt(3, idade);
			preparedStatement.setInt(4, id);

			retorno = preparedStatement.executeUpdate() > 0;
			
			conexao.FecharConexao();
		} catch (Exception e) {

		}
		return retorno;
	}
	
	public String atualizaNome() {
		return JOptionPane.showInputDialog("Qual o novo nome", nome);
	}
	
	public String atualizaApelido() {
		return JOptionPane.showInputDialog("Qual o novo apelido", apelido);
	}
	
	public int atualizaIdade() {
		return Integer.parseInt(JOptionPane.showInputDialog("Qual a nova idade", idade));
	}

}
