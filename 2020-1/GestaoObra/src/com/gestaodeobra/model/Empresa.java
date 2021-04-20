package com.gestaodeobra.model;

import javax.swing.JOptionPane;

import com.gestaodeobra.model.user.Diretor;
import com.gestaodeobra.model.user.Engenheiro;
import com.gestaodeobra.model.user.Funcionario;
import com.gestaodeobra.model.user.Gerente;
import com.gestaodeobra.model.user.Secretario;

public class Empresa {
	private double saldo;
	private Funcionario listaDeFuncionarios[];
	private int funcionariosContratados = 0;

	public Empresa(int nroFuncionarios) {
		listaDeFuncionarios = new Funcionario[nroFuncionarios];
	}

	public Funcionario[] getListaDeFuncionarios() {
		return listaDeFuncionarios;
	}

	public void setListaDeFuncionarios(Funcionario[] listaDeFuncionarios) {
		this.listaDeFuncionarios = listaDeFuncionarios;
	}

	public int getFuncionariosContratados() {
		return funcionariosContratados;
	}

	public void setFuncionariosContratados(int funcionariosContratados) {
		this.funcionariosContratados = funcionariosContratados;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean podeContratar() {
		return funcionariosContratados < listaDeFuncionarios.length;
	}

	public void contratarFuncionario() {
		if (!podeContratar()) {
			JOptionPane.showMessageDialog(null, "Não há espaços para novas contratações");
		} else {
			int cargoOpt = -1;
			String nome, matricula;

			String options[] = { "Diretor", "Engenheiro", "Gerente", "Secretario" };
			do {
				cargoOpt = JOptionPane.showOptionDialog(null, "Qual o cargo do funcionário?", "Nova contratação",
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			} while (cargoOpt < 0);

			nome = JOptionPane.showInputDialog("Qual o nome do funcionário?");
			matricula = JOptionPane.showInputDialog("Digite a matrícula do funcionário?");

			switch (cargoOpt) {
			case 0:
				listaDeFuncionarios[funcionariosContratados] = new Diretor(nome, matricula);
				break;
			case 1:
				listaDeFuncionarios[funcionariosContratados] = new Engenheiro(nome, matricula);
				break;
			case 2:
				listaDeFuncionarios[funcionariosContratados] = new Gerente(nome, matricula);
				break;
			case 3:
				listaDeFuncionarios[funcionariosContratados] = new Secretario(nome, matricula);
				break;
			}
			funcionariosContratados++;
		}

	}

	public void listarFuncionarios() {
		String lista = "";
		for (Funcionario f : listaDeFuncionarios)
			if (f != null)
				lista += f.getMatricula() + " - " + f.getNome() + "\n";

		JOptionPane.showMessageDialog(null, lista);
	}

	public Funcionario[] retornaListaFuncionarios() {
		int total = 0, i = 0;
		for (Funcionario f : listaDeFuncionarios)
			if (f != null)
				total++;

		Funcionario[] ativos = new Funcionario[total];
		for (Funcionario f : listaDeFuncionarios)
			if (f != null) {
				ativos[i] = f;
				i++;
			}
		return ativos;
	}

	public Funcionario realizarLogin() {
		Funcionario[] fs = retornaListaFuncionarios();
		int userOpt = -1;
		Funcionario funcionarioAtivo = null;
		
		String[] nomes = new String[fs.length];
		for (int i = 0; i < fs.length; i++)
			nomes[i] = fs[i].getNome();

		userOpt = JOptionPane.showOptionDialog(null, "Selecione uma opção", "Menu", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, nomes, nomes[0]);
		if (userOpt != -1) {
			funcionarioAtivo = (fs[userOpt].realizarLogin() ? fs[userOpt]: null);
		}
		
		return funcionarioAtivo;

	}

	public void start() {
		/*
		 * String options[]; int cargoOpt = -1; do {
		 * 
		 * if (funcionariosContratados == 0) { JOptionPane.showMessageDialog(null,
		 * "Não há ninguém registrado. Contrate alguém."); options = new String[2];
		 * options[0] = "Contratar funcionário"; options[1] = "Sair"; } else { options =
		 * new String[4]; options[0] = "Contratar funcionário"; options[1] =
		 * "Fazer login"; options[2] = "Listar Funcionários"; options[3] = "Sair";
		 * 
		 * } cargoOpt = JOptionPane.showOptionDialog(null, "Selecione uma opção",
		 * "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
		 * options, options[0]);
		 * 
		 * switch (cargoOpt) { case 0: contratarFuncionario(); break; case 1:
		 * realizarLogin(); break; case 2: listarFuncionarios(); break; } } while
		 * (cargoOpt != options.length - 1 && cargoOpt != -1);
		 */
	}

}
