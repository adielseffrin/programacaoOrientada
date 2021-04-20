package com.gestaodeobra;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.gestaodeobra.model.Empresa;
import com.gestaodeobra.model.user.Funcionario;
import com.gestaodeobra.model.user.Secretario;
import com.gestaodeobra.util.ControleOpcoesMenu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa e = new Empresa(10);
		String options[];
		Funcionario funcionarioAtivo = null;
		ControleOpcoesMenu COM = new ControleOpcoesMenu();
		String auxTxt;
		int auxInt = -1;

		int cargoOpt = -1;
		do {

			if (e.getFuncionariosContratados() == 0) {
				JOptionPane.showMessageDialog(null, "N�o h� ningu�m registrado. Contrate algu�m.");
				cargoOpt = 0;
			} else {

				options = COM.retornaOpcoesMenu(funcionarioAtivo).getOpcoesMenuString();

				if (funcionarioAtivo != null)
					auxTxt = String.format("Ol� %s! Bom dia!%n", funcionarioAtivo.getNome());
				else
					auxTxt = "";

				cargoOpt = JOptionPane.showOptionDialog(null, auxTxt + "Selecione uma op��o", "Menu",
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			}
			if (cargoOpt >= 0) {
				auxInt = COM.retornaOpcoesMenu(funcionarioAtivo).getOpcoesMenu()[cargoOpt].getIdInterna();
				switch (auxInt) {
				// contratar funcionario
				case 0:
					e.contratarFuncionario();
					break;
				// listar empregados
				case 1:
					e.listarFuncionarios();
					break;
				// login
				case 2:
					funcionarioAtivo = e.realizarLogin();
					break;
				// logoff
				case 3:
					funcionarioAtivo = null;
					System.out.println("Logoff realizado com sucesso");
					break;
				// solicitar material
				case 4:
					// TODO
					break;
				// listar solicita��es de material
				case 5:
					// TODO
					break;
				// cadastrar or�amento
				case 6:
					// TODO
					break;
				// listar or�amentos
				case 7:
					// TODO
					break;
				// aprovar or�amento
				case 8:
					// TODO
					break;
				// : voltar
				case 9:
					// TODO
					break;

				}
			}
		} while (auxInt != 10 && cargoOpt >= 0);

	}

}
