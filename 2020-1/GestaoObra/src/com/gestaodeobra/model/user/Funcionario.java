package com.gestaodeobra.model.user;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import com.gestaodeobra.util.Md5;

import javax.security.auth.login.LoginException;

public class Funcionario {
	protected String nome;
	protected String matricula;
	protected String password;
	protected boolean primeiroAcesso;
	protected boolean logado;

	public Funcionario(String n, String m) {
		nome = n;
		matricula = m;
		primeiroAcesso = true;
		logado = false;
	}

	public void listarSolicitacoes() {

	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void cadastrarSenha() {
		JPasswordField password1, password2;
		JLabel rotulo1, rotulo2;
		JPanel painel1, painel2;
		String auxPass = "", auxPass2 = ".";

		password1 = new JPasswordField(10);
		password1.setEchoChar('*');
		rotulo1 = new JLabel("Cadastre a senha:");

		painel1 = new JPanel();
		painel1.add(rotulo1);
		painel1.add(password1);

		password2 = new JPasswordField(10);
		password2.setEchoChar('*');
		rotulo2 = new JLabel("Repita a senha:");

		painel2 = new JPanel();
		painel2.add(rotulo2);
		painel2.add(password2);

		do {
			try {
				JOptionPane.showMessageDialog(null, painel1, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, painel2, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);
				auxPass = new String(password1.getPassword());
				auxPass2 = new String(password2.getPassword());
				if (!auxPass.equals(auxPass2))
					throw new LoginException("Senhas não conferem");
			} catch (LoginException e) {
				JOptionPane.showMessageDialog(null, "As senhas não conferem, tente novamente", "Acesso restrito", JOptionPane.PLAIN_MESSAGE);
			}

		} while (!auxPass.equals(auxPass2));

		password =  Md5.criptografa(auxPass);
		primeiroAcesso = false;

	}

	public boolean validarSenha() {
		JPasswordField password;
		JLabel rotulo;
		JPanel painel;
		String auxPass = "";

		password = new JPasswordField(10);
		password.setEchoChar('*');
		rotulo = new JLabel("Digite a senha:");
		
		painel = new JPanel();
		painel.add(rotulo);
		painel.add(password);
		
		JOptionPane.showMessageDialog(null, painel, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);
		auxPass = Md5.criptografa(new String(password.getPassword()));
		
		return auxPass.equals(this.password);
	}

	public boolean realizarLogin() {
		if (primeiroAcesso)
			cadastrarSenha();
		if(validarSenha()) {
			JOptionPane.showMessageDialog(null, "Login realizado com sucesso! Bem vindo "+this.nome);
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "Não foi possível realizar o login.");
			return false;
		}
			
	}

}
