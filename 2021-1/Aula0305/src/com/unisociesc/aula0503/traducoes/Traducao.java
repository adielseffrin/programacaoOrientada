package com.unisociesc.aula0503.traducoes;

import com.unisociesc.aula0503.MinhaException;

public class Traducao  {
	public String getSaudacao() {
		return "oi";
	} 
	
	public String showMenuOptions() {
		return "";
	}
	
	public void lancaExcecao() throws Exception{
		System.out.println("lá vai...");
		throw new MinhaException("parei");
	}
}
