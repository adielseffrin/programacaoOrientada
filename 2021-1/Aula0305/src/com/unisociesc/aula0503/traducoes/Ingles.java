package com.unisociesc.aula0503.traducoes;

public class Ingles extends Traducao {
	//sobreposição
	
	@Override
	public String getSaudacao() {
		return "Hello, welcome";
	}
	
	@Override
	public String showMenuOptions() {
		return String.format("Choose an option:%n1 - Play%n2 - Ranking%n3 - Exit");
	}
}
