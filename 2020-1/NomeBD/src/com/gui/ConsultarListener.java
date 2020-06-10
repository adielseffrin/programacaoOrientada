package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;

import com.nomeBD.BD.ConexaoMysql;

public class ConsultarListener implements ActionListener {
	private ConsultaDados consulta;
	private ResultSet rs = null;
	
	public ConsultarListener(ConsultaDados consulta) {
		this.consulta = consulta;
	}

	public void actionPerformed(ActionEvent evento) {
		JButton fonte = (JButton) evento.getSource();

		if (fonte.getName() == null) {
			try {
				ConexaoMysql conn = consulta.getConexaoMysql(); //new ConexaoMysql();
				PreparedStatement preparedStatement;

				//conn.conectarMySQL();

				String query = "select * from dados_pessoais";
				if (consulta.getId().isEditable() && !consulta.getId().getText().equals("")) {
					query += " WHERE id = ?";
					preparedStatement = conn.connection.prepareStatement(query);
					preparedStatement.setInt(1, Integer.parseInt(consulta.getId().getText()));
				} else {
					preparedStatement = conn.connection.prepareStatement(query);
				}

				rs = preparedStatement.executeQuery();

				if (rs.next()) {
					consulta.getId().setText(String.valueOf(rs.getInt("id")));
					consulta.getNome().setText(rs.getString("nome"));
					consulta.getApelido().setText(rs.getString("apelido"));

					consulta.habilitaCampos(false);
				}
				
				// conn.FecharConexao();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} else {
			if (fonte.getName().equals("Next")) {
				try {
					if (rs.next()) {
						this.exibeDadosPessoais(rs.getInt("id"));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				try {
					if (rs.previous()) {
						this.exibeDadosPessoais(rs.getInt("id"));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void exibeDadosPessoais(int id) {
		try {
			ConexaoMysql conn = consulta.getConexaoMysql(); //new ConexaoMysql();
			PreparedStatement preparedStatement;

			//conn.conectarMySQL();

			String query = "SELECT * FROM dados_pessoais WHERE id = ?";
			
			preparedStatement = conn.connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				consulta.getId().setText(String.valueOf(id));
				consulta.getNome().setText(rs.getString("nome"));
				consulta.getApelido().setText(rs.getString("apelido"));
				
				consulta.habilitaCampos(false);
			}
			
			rs.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
