package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.nomeBD.BD.ConexaoMysql;

public class ExcluirListener implements ActionListener {
	private ConsultaDados consulta;
	
	public ExcluirListener(ConsultaDados consulta) {
		this.consulta = consulta;
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			ConexaoMysql conn = consulta.getConexaoMysql(); //new ConexaoMysql();
			PreparedStatement preparedStatement;
			
			//conn.conectarMySQL();

			String query = "DELETE FROM dados_pessoais WHERE id = ?";
			preparedStatement = conn.connection.prepareStatement(query);
			preparedStatement.setString(1, consulta.getId().getText());
			
			int registros = preparedStatement.executeUpdate();
			
			if (registros > 0) {
				JOptionPane.showMessageDialog(consulta, "Registro excluído.");
			}
			
			consulta.getConsultar().doClick();
			//conn.FecharConexao();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
