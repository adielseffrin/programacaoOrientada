package com.provaD1;
public class Meia {
	private boolean limpa;
	private boolean furada;
	private int diasDeUso;
	private int limiteDeUso;
	private String marca;

	//Construtor com nome e limiteDeUso como parametros iniciais
	//Necessario atribuir as variaveis recebidas as variaveis da classe
	//public Meia(String, int)
	//sem retorno
	public Meia(String m, int l) {
		furada = false;
		limpa = true;
		diasDeUso = 0;
		//inicializar limiteDeUso e marca
		limiteDeUso = l;
		marca = m;
	}

	/*** Getters e Setters ***/
	public boolean isLimpa() {
		return limpa;
	}

	public void setLimpa(boolean limpa) {
		this.limpa = limpa;
	}

	public int getDiasDeUso() {
		return diasDeUso;
	}

	public void setDiasDeUso(int diasDeUso) {
		this.diasDeUso = diasDeUso;
	}

	public int getLimiteDeUso() {
		return limiteDeUso;
	}
	
	public void setLimiteDeUso(int l) {
		limiteDeUso = l;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String m) {
		marca = m;
	}
	
	public boolean isFurada() {
		return furada;
	}
	
	public void setFurada(boolean f) {
		this.furada = f;
	}
	
	/*** outros metodos ***/
	
	//verifica se pode usar a meia -> limpa e sem furos
	//public boolean podeUsar()
	//retorno: 
	//   true se meia limpa e sem furos
	//   false caso contrario
	public boolean podeUsar() {
		return limpa && !furada && limiteDeUso > 0;
	}

	//Usar a meia
	//Se puder usar:
	//	aumenta a quantidade de dias em uso
	//	diminui a quantidade de dias ate furar
	//	se chegar a 3 dias de uso sem lavar a meia deve ficar suja
	//	se a quantidade de dias ate furar acabar, a meia deve ficar furada
	public void usar() throws Exception{
		if (podeUsar()) {
			diasDeUso++;
			limiteDeUso--;
			if (diasDeUso == 3) {
				limpa = false;
			}
			if(limiteDeUso <= 0)
				furada = true;
		}else
			throw new Exception("Nao pode usar");
	}

	
	//limpar a meia - define dias de uso para zero e deixa a meia limpa
	public void limpar() {
		diasDeUso=0;
		limpa = true;
	}

}