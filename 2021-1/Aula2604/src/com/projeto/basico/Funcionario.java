package com.projeto.basico;

public class Funcionario {
	private String nome, cpf, nomeMae;
	private int idade;
	private double fgts;
	
	public Funcionario(String nome, String c, String nm, int idade) {
		this.nome = nome;
		cpf = c;
		nomeMae = nm;
		this.idade = idade;
	}
	
	//trazer valida��o de typeof/instance para funcion�rio
	public void verDadosPessoais() {
		System.out.printf("Nome: %s%nIdade: %d%nNome da m�e: %s%nCPF: %s%nFGTS: %.2f%n", nome, idade, nomeMae, cpf, fgts);
	}
	
	protected void abrirReclamacaoCoord() {
		System.out.println("Esse mizer�vi!");
	}
	
	public void abrirCaixa() {
		System.out.println("Caixa aberto!");
	}
	
	public void fecharCaixa() {
		System.out.println("Caixa fechado...");
	}
	
	public void emitirRelatorio() {
		System.out.println("Processando.... ok!");
	}
	
	public void listarAcoes() {
		System.out.printf("Digite a op��o:%n"
				+ "1-Abrir Caixa%n"
				+ "2-Fechar Caixa%n"
				+ "3-Emitir Relat�rio%n"
				+ "0 - Sair%n");
	}
	
}
