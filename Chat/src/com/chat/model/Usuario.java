package com.chat.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chat.BD.ConexaoMysql;
import com.chat.util.Md5;

public class Usuario {
	private int id;
	private String nome;
	private String password;
	
	public Usuario(String n,String p) {
		nome = n;
		password = Md5.criptografa(p);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void cadastrar() {
		try {
			ConexaoMysql conn = new ConexaoMysql();
			conn.conectarMySQL();
			String query = "INSERT INTO usuarios (nome, senha) VALUES (?,?)";

			PreparedStatement preparedStatement = conn.connection.prepareStatement(query);

			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, password);
			
			preparedStatement.executeUpdate();
			conn.FecharConexao();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
