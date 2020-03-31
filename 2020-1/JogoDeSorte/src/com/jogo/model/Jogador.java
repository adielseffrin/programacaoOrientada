package com.jogo.model;

import javax.swing.JOptionPane;

public class Jogador {
	private String nome;
	private int numeroDaSorte;
	private double saldo;
	
	public Jogador(String nome) {
		this.nome = nome;
		numeroDaSorte = 0;
	}
	
	
	public void perguntarNumeroDaSorte() {
		while(numeroDaSorte < 1 || numeroDaSorte > 10) {
			String numero = JOptionPane.showInputDialog(null, String.format("Olá %s, qual seu número da sorte? (Entre 1 e 10)",nome),"Número da sorte",JOptionPane.QUESTION_MESSAGE);
			numeroDaSorte = Integer.parseInt(numero);
			if(numeroDaSorte < 1 || numeroDaSorte > 10)
				JOptionPane.showMessageDialog(null, "Número inválido, digite novamente", "Erro!", JOptionPane.ERROR_MESSAGE);
		}
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
	
	//tem função de getSaldo()
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
