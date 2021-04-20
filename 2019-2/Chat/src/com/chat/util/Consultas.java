package com.chat.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chat.BD.ConexaoMysql;

public class Consultas {
	public static String consultarUsuarios() {
		String resultado = "";
		try {
			ConexaoMysql conn = new ConexaoMysql();
			conn.conectarMySQL();
			String query = "SELECT id, nome FROM usuarios";
			ResultSet rs = conn.execute(query);
			while (rs.next()) {
				resultado += String.format("%d - %s%n", rs.getInt("id"), rs.getString("nome"));
			}
			conn.FecharConexao();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultado;
	}
	
	public static boolean validaSenha(String user, String senha) {
		boolean resultado = false;
		String senhaBD = "";
		try {
			ConexaoMysql conn = new ConexaoMysql();
			conn.conectarMySQL();
			String query = "SELECT senha FROM usuarios WHERE id = ?";

			PreparedStatement preparedStatement = conn.connection.prepareStatement(query);
			preparedStatement.setString(1, user);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.first()) {
				senhaBD = rs.getString("senha");
			}
			conn.FecharConexao();
			resultado = Md5.criptografa(senha).contentEquals(senhaBD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
}
