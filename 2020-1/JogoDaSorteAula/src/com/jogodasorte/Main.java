package com.jogodasorte;

import javax.swing.JOptionPane;

import com.jogodasorte.model.Jogador;
import com.jogodasorte.model.Jogo;

public class Main {

	public static void main(String[] args) {
		int quantidadeJogadores = 0;
		
		//Solicita o número de jogadores que irão participar
		do {
			String tmp = JOptionPane.showInputDialog(null,
					"Digite o número de jogadores!\n (maior que 1)",
					"Número de jogadores",
					JOptionPane.QUESTION_MESSAGE);
		
			quantidadeJogadores = Integer.parseInt(tmp);
		} while(quantidadeJogadores <= 1);
		
		Jogador[] jogadores = new Jogador[quantidadeJogadores];

		//Cria jogadores e configura o nome e número da sorte
		for (int i = 0;i < jogadores.length;i++) {
			jogadores[i] = new Jogador();
			
			jogadores[i].perguntarNomeJogador();
			jogadores[i].perguntarNumeroDaSorte();
		}
		
		//Criar um jogo 
		Jogo jogo = new Jogo(jogadores);
		jogo.distribuiDinheiroInicial(150);
		
		//Enquanto o jogo não acabar
		while (jogo.isJogoEmAndamento()) {
			//Iniciar rodada
			jogo.iniciarRodada();
			jogo.verificarGanhador();
			
			if (jogo.teveGanhador()) { 
				double aposta = jogo.getValorAposta();
				
				Jogador ganhador = jogo.getGanhador();
				ganhador.setSaldo(ganhador.getSaldo() + aposta * jogadores.length);
				
				JOptionPane.showMessageDialog(null, 
						String.format("Parabéns %s!", ganhador.getNome()));
			}
			
			jogo.finalizarRodada();
		}
	}
}
