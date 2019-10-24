package com.banco.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.banco.BD.ConexaoMysql;
import com.mysql.cj.xdevapi.Statement;

public class Pessoa {
	private int id;
	private int idade;
	private String nome;
	private double peso;
	
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void insert() throws ClassNotFoundException, SQLException {
		ConexaoMysql conn = new ConexaoMysql();
		conn.conectarMySQL();
		String query = "INSERT INTO pessoa (nome, peso, idade) VALUES (?,?,?)";

		PreparedStatement preparedStatement = conn.connection.prepareStatement(query);

		
		preparedStatement.setString(1, nome);
		preparedStatement.setInt(3, idade);
		preparedStatement.setDouble(2, peso);
		
		int row = preparedStatement.executeUpdate();
		conn.FecharConexao();

	}
	
	
	
	
	public void consultar(int id) throws ClassNotFoundException, SQLException {
		ConexaoMysql conn = new ConexaoMysql();
		conn.conectarMySQL();
		String query = "SELECT id, nome, peso, idade FROM pessoa WHERE id=" + id;
		ResultSet rs = conn.execute(query);

		
		rs.first();
		id = rs.getInt("id");
		nome = rs.getString("nome");
		peso = rs.getDouble("peso");
		idade = rs.getInt("idade");

		conn.FecharConexao();
	}
}
