package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import com.nomeBD.BD.ConexaoMysql;

public class LimparListener implements ActionListener {
	private ConsultaDados consulta;

	public LimparListener(ConsultaDados consulta) {
		this.consulta = consulta;
	}

	public void actionPerformed(ActionEvent evento) {

		consulta.getId().setText("");
		consulta.getNome().setText("");
		consulta.getApelido().setText("");

		consulta.habilitaCampos(true);
		
		consulta.getId().requestFocus();
	}

}
