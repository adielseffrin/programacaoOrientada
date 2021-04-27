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
	
	//trazer validação de typeof/instance para funcionário
	public void verDadosPessoais() {
		System.out.printf("Nome: %s%nIdade: %d%nNome da mãe: %s%nCPF: %s%nFGTS: %.2f%n", nome, idade, nomeMae, cpf, fgts);
	}
	
	protected void abrirReclamacaoCoord() {
		System.out.println("Esse mizerávi!");
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
		System.out.printf("Digite a opção:%n"
				+ "1-Abrir Caixa%n"
				+ "2-Fechar Caixa%n"
				+ "3-Emitir Relatório%n"
				+ "0 - Sair%n");
	}
	
}
