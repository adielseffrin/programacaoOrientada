package com.jogodasorte.model;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jogo {
	private Jogador jogador1, jogador2, jogador3, ganhador;
	private int numeroSorteado;
	private double valorAposta;
	private boolean jogoEmAndamento;
	
	public Jogo() {
		jogoEmAndamento = true;
	}
	
	//set -> definir
	//get -> pegar
	//is  -> conferir (boolean)
	public boolean isJogoEmAndamento() {
		return jogoEmAndamento;
	}
		
	//public void setJogador1()
	public void cadastrarJogador1(Jogador j) {
		jogador1 = j;
	}
	
	public void cadastrarJogador2(Jogador j) {
		jogador2 = j;
	}
	
	public void cadastrarJogador3(Jogador j) {
		jogador3 = j;
	}
	
	public Jogador getJogador1() {
		return jogador1;
	}
	
	public Jogador getJogador2() {
		return jogador2;
	}
	
	public Jogador getJogador3() {
		return jogador3;
	}
	
	public Jogador getGanhador() {
		return ganhador;
	}
	
	public void iniciarRodada() {
		double menorAposta;
		definirValorAposta(); //300
		//quando que eu preciso refazer a aposta?
		// !true = false
		// !false = true
		while(!jogador1.podeJogar(valorAposta) || !jogador2.podeJogar(valorAposta) || !jogador3.podeJogar(valorAposta)) {
		//ao entrar, sabemos que alguem não pode pagar tudo isso
			//descobrir o menor valor de saldo de jogador 
			//NÃO PRECISO SABER QUEM
			menorAposta = jogador1.getSaldo();
			
			if(jogador2.getSaldo() < menorAposta)
				menorAposta = jogador2.getSaldo();
			
			if(jogador3.getSaldo() < menorAposta)
				menorAposta = jogador3.getSaldo();
			
			JOptionPane.showMessageDialog(null, String.format("Valor muito alto. Valor máximo é de R$ %.2f",menorAposta), "Aposta muito alta", JOptionPane.WARNING_MESSAGE);		
			
			definirValorAposta();
		}
		
		jogador1.setSaldo(jogador1.getSaldo() - valorAposta);
		jogador2.setSaldo(jogador2.getSaldo() - valorAposta);
		jogador3.setSaldo(jogador3.getSaldo() - valorAposta);
		
		sortearNumero();
		//jogoEmAndamento = false;
	}
	
	//cond1 && cond2
	//!(cond1 && cocnd2) = !cond1 || !cond2
	
	
	
	private void sortearNumero() {
		Random gerador = new Random();
		numeroSorteado = gerador.nextInt(5) + 1; // [1,5]
		JOptionPane.showMessageDialog(null, String.format("O número sorteado foi %d.%n%nConfira o resultado!", numeroSorteado), "Sorteio", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void definirValorAposta() {
		String temp;
		temp = JOptionPane.showInputDialog(null, "Digite o valor da aposta", "Cadastro de apostas", JOptionPane.QUESTION_MESSAGE);
		//String -> Double.parseDouble -> int
		valorAposta = Double.parseDouble(temp);
	}
	
	public double getValorAposta() {
		return valorAposta;
	}
		
	public void perguntarValorDinheiroInicial() {
		//pergunta o valor
		//salva a string em "tmp"
		//converte o valor para double "dblTmp"
		//distribuiDinheiroInicial(dblTmp);
	}
	
	public void distribuiDinheiroInicial(double v) {
		//criar forma de dara dinheiro pra galera -> setSaldo
		jogador1.setSaldo(v);
		jogador2.setSaldo(v);
		jogador3.setSaldo(v);
	}
	
	public void verificarGanhador() {
		if(numeroSorteado == jogador1.getNumeroDaSorte())
			ganhador = jogador1;
		else if(numeroSorteado == jogador2.getNumeroDaSorte())
			ganhador = jogador2;
		else if(numeroSorteado == jogador3.getNumeroDaSorte())
			ganhador = jogador3;
		else
			ganhador = null;
	}
	
	public boolean teveGanhador() {
		return ganhador != null;
	}
	
}
