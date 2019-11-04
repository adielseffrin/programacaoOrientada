package com.chat;

import java.sql.SQLException;

import com.chat.BD.ConexaoMysql;

public class Main {

	public static void main(String[] args) {
		ConexaoMysql DB = new ConexaoMysql();
		try {
			DB.conectarMySQL();
			System.out.println(DB.status);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
