package com.banco;

import javax.swing.JOptionPane;

import com.banco.model.Conta;

public class Main {

	public static void main(String[] args) {
		String nome;
		double valorTransacao = 0;
		Conta contaUsada;

		JOptionPane.showMessageDialog(null, "Bem vindo ao Banco", "Bem vindo", JOptionPane.PLAIN_MESSAGE);
		nome = JOptionPane.showInputDialog(null, "Digite o nome para cadastro", "Inicio", JOptionPane.PLAIN_MESSAGE);
		
			contaUsada = new Conta(nome);

			JOptionPane.showMessageDialog(null, "Bem vindo " + contaUsada.getNome() + "!", "Bem vindo",
					JOptionPane.PLAIN_MESSAGE);
			
			//�rea de deposito
			valorTransacao = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Digite o valor de dep�sito", "Menu", JOptionPane.PLAIN_MESSAGE));
			contaUsada.depositar(valorTransacao);
			//Informa��o de situa��o financeira
			JOptionPane.showMessageDialog(null, contaUsada.retornaSituacaoConta(), "Situa��o Atual",
					JOptionPane.PLAIN_MESSAGE);

			//�rea de saque
			valorTransacao = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Digite o valor de saque", "Menu", JOptionPane.PLAIN_MESSAGE));
			contaUsada.sacar(valorTransacao);
			
			//Informa��o de situa��o financeira
			JOptionPane.showMessageDialog(null, contaUsada.retornaSituacaoConta(), "Situa��o Atual",
					JOptionPane.PLAIN_MESSAGE);

		

	}

}
