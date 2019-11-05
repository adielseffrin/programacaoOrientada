package com.chat;

import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import com.chat.BD.ConexaoMysql;
import com.chat.model.Usuario;
import com.chat.util.Consultas;

public class Main {

	public static void main(String[] args) {
		ConexaoMysql DB = new ConexaoMysql();
		Scanner in = new Scanner(System.in);
		int opt;
		String aux = "", auxPass = "";
		boolean loop = true;
		//primeiro menu
		do {
			aux = JOptionPane.showInputDialog("Selecione uma opção:\n1 - Cadastrar\n2 - Listar\n3 - Iniciar");
			if(aux == null) System.exit(0);
			opt = Integer.parseInt(aux);
			switch(opt) {
			case 1:
				aux = JOptionPane.showInputDialog("Digite seu nome:");
				
				JPasswordField password = new JPasswordField(10);
				password.setEchoChar('*'); 

				// Cria um rótulo para o campo
				JLabel rotulo = new JLabel("Entre com a senha:");
						
				// Coloca o rótulo e a caixa de entrada numa JPanel:
				JPanel entUsuario = new JPanel();
				entUsuario.add(rotulo);
				entUsuario.add(password);

				// Mostra o rótulo e a caixa de entrada de password para o usuario fornecer a senha:
				JOptionPane.showMessageDialog(null, entUsuario, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);

				auxPass = new String(password.getPassword());
				Usuario u = new Usuario(aux,auxPass);
				u.cadastrar();
				break;
			case 2:
				JOptionPane.showMessageDialog(null,Consultas.consultarUsuarios());
				break;
			case 3:
				break;
			default:
				loop = false;	
			}
			
		}while(loop);
		
		
		try {
			DB.conectarMySQL();
			System.out.println(DB.status);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
