package com.jogo.model;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jogo {
	private int numeroSorteado;
	private double valorAposta;
	private Jogador[] jogadores;
	private Jogador ganhador;
	private boolean jogoFinalizado;

	public Jogo(Jogador[] j) {
		jogoFinalizado = false;
		jogadores = j;
	}

	public boolean isJogoFinalizado() {
		return jogoFinalizado;
	}

	public void prepararJogo(double saldoInicial) {
		int tamanho = jogadores.length;
		for (int i = 0; i < tamanho; i++) {
			jogadores[i].setSaldo(saldoInicial);
		}

	}

	public void sortearNumero() {
		ganhador = null;
		Random gerador = new Random();
		numeroSorteado = gerador.nextInt(10) + 1;
		JOptionPane.showMessageDialog(null, String.format("Número sorteado: %d", numeroSorteado), "Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void iniciarRodada() {
		definirAposta();
		double menorAposta;
		boolean todosPodemJogar = true;

		do {
			for (int i = 0; i < jogadores.length; i++) {
				todosPodemJogar = todosPodemJogar && jogadores[0].podeJogar(valorAposta);
			}

			if (!todosPodemJogar) {
				menorAposta = jogadores[0].apostaMaxima();
				for (int i = 1; i < jogadores.length; i++) {
					if (jogadores[i].apostaMaxima() < menorAposta)
						menorAposta = jogadores[i].apostaMaxima();
				}

				JOptionPane.showMessageDialog(null, String.format("A aposta deve ser no máximo de %.2f", menorAposta),
						"Limite", JOptionPane.ERROR_MESSAGE);
				definirAposta();
			}
		} while (!todosPodemJogar);

		sortearNumero();
	}

	private void definirAposta() {
		String numero = JOptionPane.showInputDialog(null, "Qual é o valor da aposta?", "Aposta",
				JOptionPane.QUESTION_MESSAGE);
		valorAposta = Double.parseDouble(numero);
	}

	private void verificarGanhador() {
		ganhador = null;

		for (int i = 0; i < jogadores.length; i++) {
			if (jogadores[i].getNumeroDaSorte() == numeroSorteado) {
				ganhador = jogadores[i];
				break;// quebra o loop -> sai do loop
			}
		}
	}

	public boolean teveGanhador() {
		verificarGanhador();
		return ganhador != null;
	}

	public Jogador getGanhador() {
		return ganhador;
	}

	// O jogo termina quando o primeiro jogador ficar sem saldo
	public boolean verificarFinalDeJogo() {
		boolean resultado = false;
		for (int i = 0; i < jogadores.length; i++) {
			resultado = resultado || jogadores[i].apostaMaxima() == 0;
		}

		return resultado;
	}

	public void finalizarRodada() {
		String textoFinal;

		// todos pagam a aposta da rodada
		for (int i = 0; i < jogadores.length; i++) {
			jogadores[i].pagarAposta(valorAposta);
		}

		// se teve ganhador
		if (ganhador != null) {
			// 3 x aposta
			// Recebe a sua aposta de volta mais a dos outros 2 jogadores
			ganhador.receberPremio(jogadores.length * valorAposta);
		}

		// Se algué mficou sem dinheiro
		if (verificarFinalDeJogo()) {
			JOptionPane.showMessageDialog(null, "O jogo acabou!", "Fim de jogo!", JOptionPane.INFORMATION_MESSAGE);
			ganhador = jogadores[0];

			for (int i = 1; i < jogadores.length; i++) {
				if (jogadores[i].apostaMaxima() > ganhador.apostaMaxima())
					ganhador = jogadores[i];
			}

			textoFinal = String.format("Saldo final consolidado:%nNome Saldo%n");
			for (int i = 0; i < jogadores.length; i++) {
				textoFinal += String.format("%.1s%.20s :: %.2f%n", (jogadores[i] == ganhador ? "*" : ""),
						jogadores[i].getNome(), jogadores[i].getSaldo());
			}

			JOptionPane.showMessageDialog(null, textoFinal, "Fim de jogo!", JOptionPane.INFORMATION_MESSAGE);
			jogoFinalizado = true;
		}
	}
}
