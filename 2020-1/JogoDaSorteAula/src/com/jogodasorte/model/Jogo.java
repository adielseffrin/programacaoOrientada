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
		boolean podeJogar;
		
		definirValorAposta();

		do {
			podeJogar = true;
			
			for (int i = 0; i < jogadores.length; i++) {
				if (!jogadores[i].podeJogar(valorAposta)) {
					podeJogar = false;
					break;
				}
			}

			if (!podeJogar) {
				// ao entrar, sabemos que alguem não pode pagar o valor da aposta
				// descobrir o menor valor de saldo de jogador
				// NÃO PRECISO SABER QUEM
				menorAposta = jogadores[0].getSaldo();
				
				for (int i = 1; i < jogadores.length; i++) {
					if (jogadores[i].getSaldo() < menorAposta) {
						menorAposta = jogadores[i].getSaldo();
					}
				}

				JOptionPane.showMessageDialog(null,
						String.format("Valor muito alto.\nValor máximo é de R$ %.2f", menorAposta),
						"Aposta muito alta",
						JOptionPane.WARNING_MESSAGE);

				definirValorAposta();
			}
		} while (!podeJogar);
		
		fazerCobranca();
		sortearNumero();
	}

	private void fazerCobranca() {
		//Cobra a aposta de cada jogador
		for (int i = 0; i < jogadores.length; i++) {
			jogadores[i].setSaldo(jogadores[i].getSaldo() - valorAposta);
		}
	}

	private void sortearNumero() {
		Random gerador = new Random();
		numeroSorteado = gerador.nextInt(jogadores.length) + 1;
		JOptionPane.showMessageDialog(null,
				String.format("O número sorteado foi %d.%n%nConfira o resultado!", numeroSorteado), 
				"Sorteio",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void definirValorAposta() {
		do {
			String temp = JOptionPane.showInputDialog(null,
					"Digite o valor da aposta",
					"Cadastro de apostas",
					JOptionPane.QUESTION_MESSAGE);
			// String -> Double.parseDouble -> int
			valorAposta = Double.parseDouble(temp);
		} while (valorAposta <= 0);
	}

	public double getValorAposta() {
		return valorAposta;
	}

	public void distribuiDinheiroInicial(double valor) {
		// criar forma de dara dinheiro pra galera -> setSaldo
		for (int i = 0; i < jogadores.length; i++) {
			jogadores[i].setSaldo(valor);
		}
	}

	public void verificarGanhador() {
		ganhador = null;
		
		for (int i = 0; i < jogadores.length; i++) {
			if (numeroSorteado == jogadores[i].getNumeroDaSorte()) {
				ganhador = jogadores[i];
				break; // sai de um loop -> e segue a vida
			}
		}
	}

	public boolean teveGanhador() {
		return ganhador != null;
	}

	public void finalizarRodada() {
		boolean alguemZerou = false;
		
		for (int j = 0; j < jogadores.length; j++) {
			if (jogadores[j].getSaldo() == 0) {
				alguemZerou = true;
				break;
			}
		}

		if (alguemZerou) {
			jogoEmAndamento = false;
			
			JOptionPane.showMessageDialog(null, 
					listarResultadoFinal(), 
					"Acabou!", 
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	private String listarResultadoFinal() {
		double maiorSaldo;
		
		ganhador = jogadores[0];
		maiorSaldo = ganhador.getSaldo();
		
		for (int i = 1; i < jogadores.length; i++) {
			if (jogadores[i].getSaldo() > maiorSaldo) {
				ganhador = jogadores[i];
				maiorSaldo = ganhador.getSaldo();
			}
		}
		
		String retorno = String.format("Final de jogo!%n%n" + 
				"Saldo final da partida:%n" + 
				"Nome do jogador     Saldo%n");
		
		for (int i = 0; i < jogadores.length; i++) {
			retorno += String.format("%s R$ %.2f%n",
					jogadores[i].getNome(), 
					jogadores[i].getSaldo());
		}
		
		retorno += String.format("Ganhador: %s", ganhador.getNome());
		
		return retorno;
	}
}
