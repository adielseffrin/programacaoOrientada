package com.unisociesc.aula0503.traducoes;

public class Portugues extends Traducao{
	
	@Override
	public String getSaudacao() {
		return "Ol�, seja bem vindo";
	}
	
	@Override
	public String showMenuOptions() {
		return String.format("Escolha uma op��o:%n1 - Jogar%n2 - Classifica��o%n3 - Sair");
	}
}
