package com.programacao.pessoa;

public class Pessoa {
	public int idade;
	public String apelido;
	
	
	
	protected String nome;
	private double saldo;
	
	public Pessoa(String goiaba, int pirulito) {
		nome = goiaba;
		idade = pirulito;
	}
	
	public void dizerNumeroDaSorte() {
		int numeroSorte = this.idade +1;
		System.out.printf("Ol�, meu nome � %s e meu n�mero da "
				+ "sorte � %d e eu gosto muito dele!%n"
				,nome,numeroSorte);
	} 
	
	public void setNome(String n) {
		if(n.equals("")) 
			this.nome = "Z� algu�m";
		else
			this.nome = n;
	}
	
	public void fazUmPix(double v) {
		if(v > 0)
			saldo += v;
	}
	
	public void apresentar() {
		String temp = String.format(
				"Ol�, meu nome � %s, mas tamb�m sou conhecido como %s."
				+ "%nEu tenho %d e tenho R$%.2f no banco.%n" 
						, nome,apelido,idade,saldo);
		System.out.print(temp);
	}
	
	
	
}
