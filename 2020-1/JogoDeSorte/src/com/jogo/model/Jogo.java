package com.jogo.model;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jogo {
	private int numeroSorteado;
	private double valorAposta;
	private Jogador jogador1;
	private Jogador jogador2;
	private Jogador jogador3;
	private Jogador ganhador;
	private boolean jogoFinalizado;

	public Jogo() {
		jogoFinalizado = false;
	}

	public boolean isJogoFinalizado() {
		return jogoFinalizado;
	}

	public void adicionarJogador1(Jogador j) {
		jogador1 = j;
	}

	public void adicionarJogador2(Jogador j) {
		jogador2 = j;
	}

	public void adicionarJogador3(Jogador j) {
		jogador3 = j;
	}

	public void prepararJogo(double saldoInicial) {
		jogador1.setSaldo(saldoInicial);
		jogador2.setSaldo(saldoInicial);
		jogador3.setSaldo(saldoInicial);
	}

	public void sortearNumero() {
		ganhador = null;
		Random gerador = new Random();
		numeroSorteado = gerador.nextInt(10) + 1;
		JOptionPane.showMessageDialog(null, String.format("Número sorteado: %d", numeroSorteado),
				"Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

	public void iniciarRodada() {
		definirAposta();
		double menorAposta;
		while (!jogador1.podeJogar(valorAposta) || !jogador2.podeJogar(valorAposta)
				|| !jogador3.podeJogar(valorAposta)) {
			menorAposta = jogador1.apostaMaxima();
			if (jogador2.apostaMaxima() < menorAposta)
				menorAposta = jogador2.apostaMaxima();

			if (jogador3.apostaMaxima() < menorAposta)
				menorAposta = jogador3.apostaMaxima();

			JOptionPane.showMessageDialog(null, String.format("A aposta deve ser no máximo de %.2f", menorAposta),
					"Limite", JOptionPane.ERROR_MESSAGE);
			definirAposta();
		}
		sortearNumero();
	}

	private void definirAposta() {
		String numero = JOptionPane.showInputDialog(null, "Qual é o valor da aposta?", "Aposta",
				JOptionPane.QUESTION_MESSAGE);
		valorAposta = Double.parseDouble(numero);
	}

	private void verificarGanhador() {
		if (jogador1.getNumeroDaSorte() == numeroSorteado)
			ganhador = jogador1;
		else if (jogador2.getNumeroDaSorte() == numeroSorteado)
			ganhador = jogador2;
		else if (jogador3.getNumeroDaSorte() == numeroSorteado)
			ganhador = jogador3;
		else
			ganhador = null;

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
		return (jogador1.apostaMaxima() == 0 || jogador2.apostaMaxima() == 0 || jogador3.apostaMaxima() == 0);
	}

	public void finalizarRodada() {
		String textoFinal;

		// todos pagam a aposta da rodada
		jogador1.pagarAposta(valorAposta);
		jogador2.pagarAposta(valorAposta);
		jogador3.pagarAposta(valorAposta);

		// se teve ganhador
		if (ganhador != null) {
			// 3 x aposta
			// Recebe a sua aposta de volta mais a dos outros 2 jogadores
			ganhador.receberPremio(3 * valorAposta);
		}

		// Se algué mficou sem dinheiro
		if (verificarFinalDeJogo()) {
			JOptionPane.showMessageDialog(null, "O jogo acabou!", "Fim de jogo!", JOptionPane.INFORMATION_MESSAGE);
			ganhador = jogador1;
			if (jogador2.apostaMaxima() > ganhador.apostaMaxima())
				ganhador = jogador2;

			if (jogador3.apostaMaxima() > ganhador.apostaMaxima())
				ganhador = jogador3;

			textoFinal = String.format(
					"Saldo final consolidado:%nNome Saldo%n%.1s%.20s :: %.2f%n%.1s%.20s :: %.2f%n%.1s%.20s :: %.2f",
					(jogador1 == ganhador ? "*" : ""), jogador1.getNome(), jogador1.getSaldo(),
					(jogador2 == ganhador ? "*" : ""), jogador2.getNome(), jogador2.getSaldo(),
					(jogador3 == ganhador ? "*" : ""), jogador3.getNome(), jogador3.getSaldo());
			JOptionPane.showMessageDialog(null, textoFinal, "Fim de jogo!", JOptionPane.INFORMATION_MESSAGE);
			jogoFinalizado = true;
		}
	}
}
