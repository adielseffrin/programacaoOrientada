package com.jogodasorte;

import javax.swing.JOptionPane;

import com.jogodasorte.model.Jogador;
import com.jogodasorte.model.Jogo;

public class Main {

	public static void main(String[] args) {
		//String nomeTemp;
		
		//Cadastrar jogadores
		//--Fazer para os 3 jogadores
		Jogador jogador1 = new Jogador();
		
		jogador1.perguntarNomeJogador();
		jogador1.perguntarNumeroDaSorte();

		Jogador jogador2 = new Jogador();
		
		jogador2.perguntarNomeJogador();
		
		do {
			jogador2.perguntarNumeroDaSorte();
		} while(jogador1.getNumeroDaSorte() == jogador2.getNumeroDaSorte());

		Jogador jogador3 = new Jogador();
		
		jogador3.perguntarNomeJogador();
		
		do {
			jogador3.perguntarNumeroDaSorte();
		} while(jogador1.getNumeroDaSorte() == jogador3.getNumeroDaSorte() ||
				jogador2.getNumeroDaSorte() == jogador3.getNumeroDaSorte());
		
		//Criar um jogo 
		Jogo jogo = new Jogo();
		jogo.cadastrarJogador1(jogador1);
		jogo.cadastrarJogador2(jogador2);
		jogo.cadastrarJogador3(jogador3);
		jogo.distribuiDinheiroInicial(150);
		
		//**Eu (Adiel) quero que o jogo controle o jogo (Nao o main)
		//Adicionar os jogadores, no jogo
		//Preparar o jogo -> distribuir o dinheiro inicial
		
		//Enquanto o jogo não acabar
		while(jogo.isJogoEmAndamento()) {
			//Iniciar rodada
			jogo.iniciarRodada();
			jogo.verificarGanhador();
			
			if (jogo.teveGanhador()) { 
				double aposta = jogo.getValorAposta();
				
				Jogador ganhador = jogo.getGanhador();
				ganhador.setSaldo(ganhador.getSaldo() + aposta * 3);
				
				JOptionPane.showMessageDialog(null, String.format("Parabéns %s!", ganhador.getNome()));
			}
		}
		
		
		//Confere se alguém ganhou
		//Finaliza a rodada
		//--Se alguem ficou sem dinheiro -> finaliza o jogo

		
		
		
	}

}
