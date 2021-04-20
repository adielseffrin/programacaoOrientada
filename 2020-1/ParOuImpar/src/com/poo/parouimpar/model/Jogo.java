package com.poo.parouimpar.model;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jogo {
	private Jogador jogador1, jogador2, jogadorEscolhe, jogadorEspera;
	
	public void cadastrarJogadores() {
		String tmp;
		
		tmp = JOptionPane.showInputDialog("Qual o nome do primeiro jogador?");
		jogador1 = new Jogador(tmp);
		
		tmp = JOptionPane.showInputDialog("Qual o nome do segundo jogador?");
		jogador2 = new Jogador(tmp);
		
		JOptionPane.showMessageDialog(null, "Jogadores cadastrados com sucesso!");
	}
	
	public void escolherParOuImpar() {
		String txt, opcoes[] = {"Par", "Impar"};
		int escolha;
		boolean decisao = sorteiaNumero() % 2 == 0;
		
		if(decisao) {
			jogadorEscolhe = jogador1;
			jogadorEspera = jogador2;
		}else {
			jogadorEscolhe = jogador2;
			jogadorEspera = jogador1;
		}
		
		txt = String.format("%s, faça sua escolha.", jogadorEscolhe.getNome());
		escolha = JOptionPane.showOptionDialog(null, txt, "Escolha", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		
		if(escolha == 0) {
			jogadorEscolhe.setEscolheuParRodada(true);
			jogadorEspera.setEscolheuParRodada(false);
		}else {
			jogadorEscolhe.setEscolheuParRodada(false);
			jogadorEspera.setEscolheuParRodada(true);
		}
		
		//jogadorEscolhe.setEscolheuParRodada(escolha == 0);
		//jogadorEspera.setEscolheuParRodada(!(escolha == 0));
	}
	
	private void atribuirNumeros() {
		jogador1.setNumeroRodada(sorteiaNumero());
		jogador2.setNumeroRodada(sorteiaNumero());
	}
	
	private int sorteiaNumero() {
		Random r = new Random();
		return r.nextInt(5)+1;
	}
	
	private void exibeNumerosSorteados() {
		String texto = String.format("%s:%d%n%s:%d", jogador1.getNome(), jogador1.getNumeroRodada(),jogador2.getNome(), jogador2.getNumeroRodada());
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public void jogar() {
		
		atribuirNumeros();
		exibeNumerosSorteados();
		int resultado = jogador1.getNumeroRodada() + jogador2.getNumeroRodada();
		if((resultado % 2 == 0 && jogador1.escolheuParRodada()) || (resultado % 2 == 1 && !jogador1.escolheuParRodada())) {
			jogador1.ganhar();
			JOptionPane.showMessageDialog(null,jogador1.retornarTextoVitoria());
			jogador2.perder();
			
		}else {
			jogador1.perder();
			jogador2.ganhar();
			JOptionPane.showMessageDialog(null,jogador2.retornarTextoVitoria());
			
		}
	}
	
	public void mostraStatus() {
		String texto = String.format("%s%n%n%s", jogador1.retornaTextoStatus(), jogador2.retornaTextoStatus());
		JOptionPane.showMessageDialog(null,texto);
	}
	
	
	
	
}
