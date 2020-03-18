package com.banco.model;

public class Conta {
	private String nome;
	private double saldo;

	public Conta(String n) {
		nome = n;
		saldo = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean depositar(double valor) {
		boolean status = false;
		if (valor > 0) {
			saldo += valor;
			status = true;
		}
		return status;
	}

	public boolean sacar(double valor) {
		boolean status = false;
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			status = true;
		}
		return status;
	}
	
	public String retornaSituacaoConta() {
		return String.format("Titular: %s%nSaldo R$ %.2f", nome, saldo);
		
	}

}
