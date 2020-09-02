package com.gestaodeobra.model;

public class Solicitacao {
	private String materiais;
	private int id;
	private double valorOrcado;
	
	private static int contador = 0;
	
	public Solicitacao() {
		id = ++contador;
		valorOrcado = 0;
		materiais = null;
	}

	public String getMateriais() {
		return materiais;
	}

	public void setMateriais(String materiais) {
		this.materiais = materiais;
	}

	public double getValorOrcado() {
		return valorOrcado;
	}

	public void setValorOrcado(double valorOrcado) {
		this.valorOrcado = valorOrcado;
	}

	public int getId() {
		return id;
	}
	
	
	
}
