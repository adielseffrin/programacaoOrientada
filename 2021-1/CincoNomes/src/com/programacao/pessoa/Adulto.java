package com.programacao.pessoa;

public class Adulto extends Pessoa{
	
	public Adulto(String a, int b) {
		super(a,b);
	}
	
	public boolean estaEndividado;
	
	public void chorar() {
		System.out.println(":'(");
	}
	
	public void exclamaNome() {
		nome = nome + "!";
	}
	
	
}
