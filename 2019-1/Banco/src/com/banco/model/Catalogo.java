package com.banco.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.banco.BD.ConexaoMysql;

public class Catalogo {
	
	public ArrayList<Pessoa> catalogo = new ArrayList<Pessoa>();

	public void criarCatalogo() throws ClassNotFoundException, SQLException {
		ConexaoMysql conn = new ConexaoMysql();
		conn.conectarMySQL();
		String query = "SELECT id, nome, peso, idade FROM pessoa ";
		ResultSet rs = conn.execute(query);

		Pessoa ptmp;
		while (rs.next()) {
			ptmp = new Pessoa();
			ptmp.setId(rs.getInt("id"));
			ptmp.setNome(rs.getString("nome"));
			ptmp.setPeso(rs.getDouble("peso"));
			ptmp.setIdade(rs.getInt("idade"));
			catalogo.add(ptmp);
		}
		conn.FecharConexao();
	}

	public ArrayList<Pessoa> getCatalogo() {
		return catalogo;
	}
	
	
}
