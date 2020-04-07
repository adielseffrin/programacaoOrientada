package com.jogodasorte;

import javax.swing.JOptionPane;

import com.jogodasorte.model.Jogador;
import com.jogodasorte.model.Jogo;

public class Main {

	public static void main(String[] args) {
		//String nomeTemp;
		Jogador[] jogadores = new Jogador[6];
		//Cadastrar jogadores
		//--Fazer para os 3 jogadores
		//Jogador jogador1 
		
		/*int controle = 0;
		while(controle < 3) {
			jogadores[controle] = new Jogador();
			jogadores[controle].perguntarNomeJogador();
			jogadores[controle].perguntarNumeroDaSorte();
			controle++;
		}*/
		
		//for(inicio, cond fim, incremento)
		for(int i=0;i < 5;i++) {
			jogadores[i] = new Jogador();
			jogadores[i].perguntarNomeJogador();
			jogadores[i].perguntarNumeroDaSorte();
		}
		
		//Criar um jogo 
		Jogo jogo = new Jogo(jogadores);
		//jogo.cadastrarJogador1(jogadores[0]);
		//jogo.cadastrarJogador2(jogadores[1]);
		//jogo.cadastrarJogador3(jogadores[2]);
		
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
			
			jogo.finalizarRodada();
			
		}
		
		
		//Confere se alguém ganhou
		//Finaliza a rodada
		//--Se alguem ficou sem dinheiro -> finaliza o jogo

		
		
		
	}

}
