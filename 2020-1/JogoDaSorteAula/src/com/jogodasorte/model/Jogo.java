package com.jogodasorte.model;

import java.util.Random;
import com.jogodasorte.model.Jogador;

import javax.swing.JOptionPane;

public class Jogo {
	private Jogador ganhador;
	private Jogador[] jogadores;
	private int numeroSorteado;
	private double valorAposta;
	private boolean jogoEmAndamento;

	public Jogo(Jogador[] j) {
		jogoEmAndamento = true;
		jogadores = j;
	}

	// set -> definir
	// get -> pegar
	// is -> conferir (boolean)
	public boolean isJogoEmAndamento() {
		return jogoEmAndamento;
	}

	public void setJogadores(Jogador[] j) {
		jogadores = j;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public Jogador getGanhador() {
		return ganhador;
	}

	public void iniciarRodada() {
		double menorAposta;
		boolean naoPodeJogar;
		definirValorAposta(); // 100 -----> 200, 50, 50 , 60
		// quando que eu preciso refazer a aposta?
		// !true = false
		// !false = true
		

		do {
			naoPodeJogar = false;
			for (int i = 0; i < jogadores.length; i++) {
				naoPodeJogar = naoPodeJogar || !jogadores[i].podeJogar(valorAposta);
			}

			if (naoPodeJogar) {
				// ao entrar, sabemos que alguem não pode pagar tudo isso
				// descobrir o menor valor de saldo de jogador
				// NÃO PRECISO SABER QUEM
				// menorAposta = jogador1.getSaldo();
				menorAposta = jogadores[0].getSaldo();
				for (int i = 1; i < jogadores.length; i++) {
					if (jogadores[i].getSaldo() < menorAposta)
						menorAposta = jogadores[i].getSaldo();
				}

				/*
				 * if (jogador2.getSaldo() < menorAposta) menorAposta = jogador2.getSaldo();
				 * 
				 * if (jogador3.getSaldo() < menorAposta) menorAposta = jogador3.getSaldo();
				 */

				JOptionPane.showMessageDialog(null,
						String.format("Valor muito alto. Valor máximo é de R$ %.2f", menorAposta), "Aposta muito alta",
						JOptionPane.WARNING_MESSAGE);

				definirValorAposta();// -> 400
			}
		} while (naoPodeJogar);

		fazerCobranca();
		sortearNumero();
		// jogoEmAndamento = false;
	}

	/*public void iniciarRodada2() {
		double menorAposta;
		do {
			definirValorAposta();
			if (!jogador1.podeJogar(valorAposta) || !jogador2.podeJogar(valorAposta)
					|| !jogador3.podeJogar(valorAposta)) {

				menorAposta = jogador1.getSaldo();

				if (jogador2.getSaldo() < menorAposta)
					menorAposta = jogador2.getSaldo();

				if (jogador3.getSaldo() < menorAposta)
					menorAposta = jogador3.getSaldo();

				JOptionPane.showMessageDialog(null,
						String.format("Valor muito alto. Valor máximo é de R$ %.2f", menorAposta), "Aposta muito alta",
						JOptionPane.WARNING_MESSAGE);
			}
		} while (!jogador1.podeJogar(valorAposta) || !jogador2.podeJogar(valorAposta)
				|| !jogador3.podeJogar(valorAposta));

		fazerCobranca();
		sortearNumero();

	}*/

	private void fazerCobranca() {
		// cobra a aposta de cada jogador
		for (int i = 0; i < jogadores.length; i++) {
			jogadores[i].setSaldo(jogadores[i].getSaldo() - valorAposta);
		}

		// jogador1.setSaldo(jogador1.getSaldo() - valorAposta);
		// jogador2.setSaldo(jogador2.getSaldo() - valorAposta);
		// jogador3.setSaldo(jogador3.getSaldo() - valorAposta);
	}

	// cond1 && cond2
	// !(cond1 && cocnd2) = !cond1 || !cond2

	private void sortearNumero() {
		Random gerador = new Random();
		numeroSorteado = gerador.nextInt(5) + 1; // [1,5]
		JOptionPane.showMessageDialog(null,
				String.format("O número sorteado foi %d.%n%nConfira o resultado!", numeroSorteado), "Sorteio",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void definirValorAposta() {
		String temp;
		temp = JOptionPane.showInputDialog(null, "Digite o valor da aposta", "Cadastro de apostas",
				JOptionPane.QUESTION_MESSAGE);
		// String -> Double.parseDouble -> int
		valorAposta = Double.parseDouble(temp);
	}

	public double getValorAposta() {
		return valorAposta;
	}

	public void perguntarValorDinheiroInicial() {
		// pergunta o valor
		// salva a string em "tmp"
		// converte o valor para double "dblTmp"
		// distribuiDinheiroInicial(dblTmp);
	}

	public void distribuiDinheiroInicial(double v) {
		// criar forma de dara dinheiro pra galera -> setSaldo
		for (int i = 0; i < jogadores.length; i++) {
			jogadores[i].setSaldo(v);
		}
		// jogador1.setSaldo(v);
		// jogador2.setSaldo(v);
		// jogador3.setSaldo(v);
	}

	public void verificarGanhador() {
		ganhador = null;
		for (int i = 0; i < jogadores.length; i++) {
			if (numeroSorteado == jogadores[i].getNumeroDaSorte()) {
				ganhador = jogadores[i];
				break; // sai de um loop -> e segue a vida
			}
		}

		/*
		 * if (numeroSorteado == jogador1.getNumeroDaSorte()) ganhador = jogador1; else
		 * if (numeroSorteado == jogador2.getNumeroDaSorte()) ganhador = jogador2; else
		 * if (numeroSorteado == jogador3.getNumeroDaSorte()) ganhador = jogador3; else
		 * ganhador = null;
		 */
	}

	public boolean teveGanhador() {
		return ganhador != null;
	}

	public void finalizarRodada() {
		boolean alguemZerou = false;
		for (int j = 0; j < jogadores.length; j++) {
			alguemZerou = alguemZerou || jogadores[j].getSaldo() == 0;
		}

		if (alguemZerou) {
			jogoEmAndamento = false;
			JOptionPane.showMessageDialog(null, listarResultadoFinal(), "Acabou!", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private String listarResultadoFinal() {
		double maiorSaldo;

		ganhador = jogador1;
		maiorSaldo = ganhador.getSaldo();

		if (jogador2.getSaldo() > maiorSaldo) {
			ganhador = jogador2;
			maiorSaldo = ganhador.getSaldo();
		}

		if (jogador3.getSaldo() > maiorSaldo) {
			ganhador = jogador3;
			maiorSaldo = ganhador.getSaldo();
		}

		String retorno = String.format(
				"Final de jogo!%n" + "Saldo final do (não) cassino:%n" + "Nome do jogador     Saldo%n" + "%s%s R$%.2f%n"
						+ "%s%s R$%.2f%n" + "%s%s R$%.2f%n",
				(jogador1 == ganhador ? "!!" : ""), jogador1.getNome(), jogador1.getSaldo(),
				(jogador2 == ganhador ? "!!" : ""), jogador2.getNome(), jogador2.getSaldo(),
				(jogador3 == ganhador ? "!!" : ""), jogador3.getNome(), jogador3.getSaldo());

		/*
		 * format -> String.format ou printf %n - nova linha %s - String %d - int (-2^32
		 * +1 .. 2^32 - 1)/long (-2^64 +1 .. 2^64 - 1) %f - float(-2.^32 +1 .. 2.^32 -
		 * 1)/double (-2.^64 +1 .. 2.^64 - 1) %b - boolean
		 * 
		 * %.2f -> float/double e formata com 2 casas %.xf -> float/double e formata com
		 * x casas
		 */

		return retorno;

	}

}
