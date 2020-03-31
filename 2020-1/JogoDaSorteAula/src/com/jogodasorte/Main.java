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
		Jogador jogador2 = new Jogador();
		Jogador jogador3 = new Jogador();
		
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
			if(jogo.teveGanhador()) JOptionPane.showMessageDialog(null, String.format("Parabéns %s!!", jogo.getGanhador().getNome()));
		}
		
		
		//Confere se alguém ganhou
		//Finaliza a rodada
		//--Se alguem ficou sem dinheiro -> finaliza o jogo

		
		
		
	}

}
