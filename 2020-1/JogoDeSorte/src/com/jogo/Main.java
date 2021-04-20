package com.jogo;

import javax.swing.JOptionPane;

import com.jogo.model.Jogador;
import com.jogo.model.Jogo;

public class Main {

	public static void main(String[] args) {
		
		int numeroDeJogadores;
		String tmp = JOptionPane.showInputDialog("Digite o número de jogadores");
		numeroDeJogadores = Integer.parseInt(tmp);
		
		Jogador[] jogadores = new Jogador[numeroDeJogadores];
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao jogo da sorte!\nVamos definir os "+numeroDeJogadores+" jogadores da partida.",
				"Mensagem inicial", JOptionPane.PLAIN_MESSAGE);
			
		// Dados do jogador 1
		//Jogador jogador1 = new Jogador();
		
		int contadorDeJogadores = 0;
		
		/*while(contadorDeJogadores < numeroDeJogadores) {
			jogadores[contadorDeJogadores] = new Jogador();
			jogadores[contadorDeJogadores].perguntarNomeJogador();
			jogadores[contadorDeJogadores].perguntarNumeroDaSorte();
			contadorDeJogadores++;
		}*/
		
		//for(variavel = começo; variavel condição de fim; incremento ou decremento)
		for(int i = 0;i < numeroDeJogadores;i++) {
			jogadores[i] = new Jogador();
			jogadores[i].perguntarNomeJogador();
			jogadores[i].perguntarNumeroDaSorte();
		}
		
		

		// validação par anao repetir o número
		/*do {
			jogadores[2].perguntarNumeroDaSorte();
		} while (jogadores[2].getNumeroDaSorte() == jogadores[0].getNumeroDaSorte() || jogadores[2].getNumeroDaSorte() == jogadores[1].getNumeroDaSorte());*/
		
		
		Jogo jogo = new Jogo(jogadores);
		jogo.prepararJogo(100);
		
		
		do{
			jogo.iniciarRodada();
			if (jogo.teveGanhador())
				JOptionPane.showMessageDialog(null,
						String.format("Tivemos um ganhador!%n Parabéns %s!", jogo.getGanhador().getNome()),
						"A banca paga!", JOptionPane.PLAIN_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Ninguém ganhou :)\n A banca agradece!", "A banca recebe!",
						JOptionPane.PLAIN_MESSAGE);
			jogo.finalizarRodada();

		}while (!jogo.isJogoFinalizado()); 
		

	}

}
