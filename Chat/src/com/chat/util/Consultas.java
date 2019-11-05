package com.chat.util;

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
			if (rs.next()) {
				resultado += String.format("%d - %s%n", rs.getInt("id"), rs.getString("nome"));
			}
			conn.FecharConexao();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultado;
	}
}
