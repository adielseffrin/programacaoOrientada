package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.nomeBD.BD.ConexaoMysql;

public class UpdateListener implements ActionListener {
	private ConsultaDados consulta;
	private int updateCount;

	public UpdateListener(ConsultaDados consulta) {
		this.consulta = consulta;
	}

	public void actionPerformed(ActionEvent evento) {

		ConexaoMysql conn = new ConexaoMysql();
		PreparedStatement preparedStatement;

		try {
			conn.conectarMySQL();

			String query;
			
			if (consulta.getId().getText().equals("")) {
				query = "INSERT INTO dados_pessoais (nome, apelido, idade) VALUES (?,?,?)";
				preparedStatement = conn.connection.prepareStatement(query);
				preparedStatement.setString(1, consulta.getNome().getText());
				preparedStatement.setString(2, consulta.getApelido().getText());
				preparedStatement.setInt(3, 0);
			} else {
				query = "UPDATE dados_pessoais SET nome = ?, apelido = ?, idade = ? WHERE id = ?";
				preparedStatement = conn.connection.prepareStatement(query);
				preparedStatement.setString(1, consulta.getNome().getText());
				preparedStatement.setString(2, consulta.getApelido().getText());
				preparedStatement.setInt(3, 0);
				preparedStatement.setInt(4, Integer.parseInt(consulta.getId().getText()));
			}

			updateCount = preparedStatement.executeUpdate();
			if(updateCount > 0) JOptionPane.showMessageDialog(consulta, "BD atualizado");
	

			 conn.FecharConexao();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
