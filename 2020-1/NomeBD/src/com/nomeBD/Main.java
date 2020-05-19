package com.nomeBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nomeBD.BD.ConexaoMysql;

public class Main {

	public static void main(String[] args) {
		ConexaoMysql conn = new ConexaoMysql();
		try {
			conn.conectarMySQL();
			String resultado = "";
			String query = "select * from dados_pessoais";
			ResultSet rs = conn.execute(query);
			while (rs.next()) {
				resultado += String.format("%d - %s%n", rs.getInt("id"), rs.getString("nome"));
			}
			conn.FecharConexao();
			
			System.out.println(resultado);
			
			//--------------------------------
			
			conn.conectarMySQL();
			 resultado = "";
			 query = "select * from dados_pessoais WHERE id > ?";
			 int user = 2;
			 PreparedStatement preparedStatement = conn.connection.prepareStatement(query);
			 preparedStatement.setInt(1, user);
			 
			 rs = preparedStatement.executeQuery();
			 
			while (rs.next()) {
				resultado += String.format("%d - %s%n", rs.getInt("id"), rs.getString("apelido"));
			}
			conn.FecharConexao();
			
			System.out.println(resultado);
			
//--------------------------------
			
			conn.conectarMySQL();
			 resultado = "";
			 query = "select * from dados_pessoais WHERE nome LIKE ? OR idade > ?";
			  int idade = 50;
			  String apelido = "%adiel%";
			  
			  preparedStatement = conn.connection.prepareStatement(query);
			 preparedStatement.setString(1, apelido);
			 preparedStatement.setInt(2, idade);
			 
			 rs = preparedStatement.executeQuery();
			 
			while (rs.next()) {
				resultado += String.format("%d - %s%n", rs.getInt("id"), rs.getString("apelido"));
			}
			conn.FecharConexao();
			
			System.out.println(resultado);
			
//--------------------------------
			
			conn.conectarMySQL();
			 resultado = "";
			 query = "INSERT INTO dados_pessoais(nome, idade, apelido) VALUES(?,?,?)";
			  			  
			  preparedStatement = conn.connection.prepareStatement(query);
			 preparedStatement.setString(3, "Batman");
			 preparedStatement.setInt(2, 46);
			 preparedStatement.setString(1, "Bruce Wayne");
			 
			 int count = preparedStatement.executeUpdate(); 
			
			 System.out.println(count);
			
			conn.FecharConexao();
			
			System.out.println(resultado);
			
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
