package com.unisociesc.aula0503.traducoes;

public class Portugues extends Traducao{
	
	@Override
	public String getSaudacao() {
		return "Olá, seja bem vindo";
	}
	
	@Override
	public String showMenuOptions() {
		return String.format("Escolha uma opção:%n1 - Jogar%n2 - Classificação%n3 - Sair");
	}
}
