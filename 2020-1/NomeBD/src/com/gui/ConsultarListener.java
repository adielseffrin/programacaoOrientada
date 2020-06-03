package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import com.nomeBD.BD.ConexaoMysql;

public class ConsultarListener implements ActionListener {
	private ConsultaDados consulta;
	
	public ConsultarListener(ConsultaDados consulta) {
		this.consulta = consulta;
	}
	
	public void actionPerformed(ActionEvent evento) {
		ConexaoMysql conn = new ConexaoMysql();
		
		try {
			conn.conectarMySQL();
			
			String query = "select * from dados_pessoais";
			ResultSet rs = conn.execute(query);
			
			if (rs.next()) {
				consulta.getId().setText(String.valueOf(rs.getInt("id")));
				consulta.getNome().setText(rs.getString("nome"));
				consulta.getApelido().setText(rs.getString("apelido"));
				
				consulta.habilitaCampos(false);
			}
			
			conn.FecharConexao();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
