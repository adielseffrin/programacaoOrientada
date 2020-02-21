package com.banco.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoMysql {
	public String status = "Nao conectou...";
	public Connection connection = null;

	public Connection getConexao() {
		return connection;
	}

	public void conectarMySQL() throws ClassNotFoundException, SQLException {
		connection = null;

		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			Class.forName(driverName);
			String serverName = "localhost:3306"; // caminho do servidor do BD
			String mydatabase = "cadastro"; // nome do seu banco de dados
			String timezone = "useTimezone=true&serverTimezone=UTC";
			String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?" + timezone;
			String username = "root"; // nome de um usu�rio de seu BD
			String password = ""; // sua senha de acesso
			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			} else {
				status = ("STATUS--->Nao foi possivel realizar conexao");
			}

		} catch (ClassNotFoundException e) { // Driver n�o encontrado
			System.out.println("O driver expecificado nao foi encontrado.");
			// return null;
		} catch (SQLException e) {
			// Nao conseguindo se conectar ao banco
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
			// return null;
		}
	}

	// Metodo que retorna o status da sua conexao//
	public String statusConection() {
		return status;
	}

	// Metodo que fecha sua conexao//
	public boolean FecharConexao() throws ClassNotFoundException {
		try {
			connection.close();
			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	// Metodo que reinicia sua conexao//
	public Connection ReiniciarConexao() throws ClassNotFoundException, SQLException {
		FecharConexao();
		this.conectarMySQL();
		return connection;
	}

	public ResultSet execute(String sql) throws SQLException {
		Statement pesquisa = connection.createStatement();
		String consulta = sql;
		ResultSet rs = pesquisa.executeQuery(consulta);
		
		return rs;
	}
}
