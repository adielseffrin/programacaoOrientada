package com.provaD1;
public class Tenis {
	private boolean furado;
	private double depreciacao, valorAtual;
	private int limiteDeUso;
	private String marca;

	//Construtor com marca, limiteDeUso e valor do tenis como parametros iniciais
	//Necessario atribuir as variaveis recebidas as variaveis da classe
	//public Tenis(String, int, double)
	//sem retorno
	public Tenis(String m, int l, double v) {
		furado = false;
		
		//inicializar:
		//depreciacao -> valor dividido por limiteDeUso - cast para double -> (double)
		//valor atual, limiteDeUso e marca		
		depreciacao = v / (double) l;
		valorAtual = v;
		limiteDeUso = l;
		marca = m;
	}

	/*** Getters e Setters ***/
	public double getValorAtual() {
		return valorAtual;
	}

	public boolean isFurado() {
		return furado;
	}

	public void setFurado(boolean furado) {
		this.furado = furado;
	}

	public int getLimiteDeUso() {
		return limiteDeUso;
	}

	public void setLimiteDeUso(int limiteDeUso) {
		this.limiteDeUso = limiteDeUso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}

	/*** outros metodos ***/
	
	//retorna se pode user o tenis - i.e, nao esta furado
	public boolean podeUsar() {
		return !furado && limiteDeUso > 0;
	}

	//realiza o uso do tenis com ou sem meia
	//tenis sem meia:
	//	se puder usar, depreciar o valor, reduzir a quantidade de dias que pode ser usado e ver se furou
	//	se nao puder usar, lancar a excecao "Nao pode usar"
	//tenis com meia
	//	se puder usar o tenis e a meia, usar a meia, depreciar o valor, reduzir a quantidade de dias que pode ser usado e ver se furou
	//	se nao puder usar, lancar a excecao "Nao pode usar"
	//
	//OBS: para lancar uma excecao pode-se usar o comando -> throw new Exception("mensagem");
	public void usar(Meia m) throws Exception {
		if (this.podeUsar()) {
			if (m != null) {
				if (m.podeUsar()) {
					m.usar();
					valorAtual -= depreciacao;
					limiteDeUso--;

					if (limiteDeUso <= 0)
						furado = true;
				} else {
					throw new Exception("Nao pode usar");
				}
			}else {
				valorAtual -= depreciacao;
				limiteDeUso--;

				if (limiteDeUso <= 0)
					furado = true;
			}
		}else {
			throw new Exception("Nao pode usar");
		}
	}

}