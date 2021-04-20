package com.poo.parouimpar.model;

public class Jogador {
	private String nome;
	
	private int numeroRodada;
	private boolean escolheuParRodada;
	
	private int vitorias, totalJogos;
	private double taxaVitorias;
	
	public Jogador(String n) {
		nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNumeroRodada(int n) {
		numeroRodada = n;
	}
	
	public int getNumeroRodada() {
		return numeroRodada;
	}
	
	public void setEscolheuParRodada(boolean e) {
		escolheuParRodada = e;
	}
	
	public boolean escolheuParRodada() {
		return escolheuParRodada;
	}
	
	public void ganhar() {
		vitorias++;
		totalJogos++;
	}
	
	public String retornarTextoVitoria() {
		return String.format("%s venceu!", nome);
	}
	
	public void perder() {
		totalJogos++;
	}
	
	private void calcularTaxaVitorias() {
		taxaVitorias = (double)vitorias/totalJogos;
	}
	
	public String retornaTextoStatus() {
		calcularTaxaVitorias();
		return String.format("Jogador: %s%nVitórias: %d%nJogos: %d%n Taxa de vitórias: %.2f", nome, vitorias, totalJogos, taxaVitorias);
	}
}
