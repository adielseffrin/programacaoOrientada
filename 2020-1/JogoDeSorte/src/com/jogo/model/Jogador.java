package com.jogo.model;

import javax.swing.JOptionPane;

public class Jogador {
	private String nome;
	private int numeroDaSorte;
	private double saldo;
	
	static public int contador = 0;

	public Jogador() {
		contador++;
		numeroDaSorte = 0;
	}
	
	public void perguntarNomeJogador() {
		nome = JOptionPane.showInputDialog(null, String.format("Digite o nome do %d� jogador",contador), "Cadastro",
				JOptionPane.QUESTION_MESSAGE);
	}

	public void perguntarNumeroDaSorte() {
		do {
			String numero = JOptionPane.showInputDialog(null,
					String.format("Ol� %s, qual seu n�mero da sorte? (Entre 1 e 10)", nome), "N�mero da sorte",
					JOptionPane.QUESTION_MESSAGE);
			numeroDaSorte = Integer.parseInt(numero);
			if (numeroDaSorte < 1 || numeroDaSorte > 10)
				JOptionPane.showMessageDialog(null, "N�mero inv�lido, digite novamente", "Erro!",
						JOptionPane.ERROR_MESSAGE);
		} while (numeroDaSorte < 1 || numeroDaSorte > 10);
	}

	public String getNome() {
		return nome;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	// tem fun��o de getSaldo()
	public double apostaMaxima() {
		return saldo;
	}

	public int getNumeroDaSorte() {
		return numeroDaSorte;
	}

	public boolean podeJogar(double aposta) {
		return saldo >= aposta;
	}

	public void pagarAposta(double valor) {
		saldo -= valor;
	}

	public void receberPremio(double valor) {
		saldo += valor;
	}

}
