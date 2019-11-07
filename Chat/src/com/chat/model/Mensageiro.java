package com.chat.model;

import javax.swing.JOptionPane;

import com.chat.BD.ConexaoMysql;

public class Mensageiro {
	private ConexaoMysql DB = new ConexaoMysql();
	
	public void menu() {
		int opt;
		String aux = "", auxPass = "";
		boolean loop = true;
		
		do {
			String[] opts= {"Enviar Mensagem","Ler novas", "Ler velhas", "Sair"}; 
			opt = JOptionPane.showOptionDialog(null, "Escolha uma opção",
					"Menu", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.QUESTION_MESSAGE, null, opts, opts[0]);
			switch(opt) {
			case 0:
				
				break;
			case 1:
				break;
			case 2:
				break;
			default:
				loop = false;
			}
		}while(loop);
	}
}
