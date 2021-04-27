package com.projeto.basico;

public class Gerente extends Funcionario{
	public Gerente(String nome, String c, String nm, int idade) {
		super(nome, c, nm, idade);
	}
	
	public void conferirRelatorios() {
		System.out.println("Tudo ok!");
	}
	
	public void efetuarPagamento() {
		System.out.println("Abri a mão");
	}
	
	public void listarAcoes() {
		System.out.printf("Digite a opção:%n"
				+ "1-Abrir Caixa%n"
				+ "2-Fechar Caixa%n"
				+ "3-Emitir Relatório%n"
				+ "4-Conferir Relatórios%n"
				+ "5-Efetuar Pagamento%n"
				+ "0 - Sair%n");
	}
}
