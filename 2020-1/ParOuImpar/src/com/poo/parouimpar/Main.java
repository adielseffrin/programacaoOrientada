package com.poo.parouimpar;

import javax.swing.JOptionPane;

import com.poo.parouimpar.model.Jogo;

public class Main {

	public static void main(String[] args) {
		
		Jogo jogo = new Jogo();
		jogo.cadastrarJogadores();
		do {
			jogo.escolherParOuImpar();
			jogo.jogar();
			
		}while(JOptionPane.showConfirmDialog(null, "Jogar novamente", "Seguir?", JOptionPane.YES_NO_OPTION) == 0);
		
		jogo.mostraStatus();

	}

}
