package com.projeto.basico;

public class Gerente extends Funcionario{
	public Gerente(String nome, String c, String nm, int idade) {
		super(nome, c, nm, idade);
	}
	
	public void conferirRelatorios() {
		System.out.println("Tudo ok!");
	}
	
	public void efetuarPagamento() {
		System.out.println("Abri a m�o");
	}
	
	public void listarAcoes() {
		System.out.printf("Digite a op��o:%n"
				+ "1-Abrir Caixa%n"
				+ "2-Fechar Caixa%n"
				+ "3-Emitir Relat�rio%n"
				+ "4-Conferir Relat�rios%n"
				+ "5-Efetuar Pagamento%n"
				+ "0 - Sair%n");
	}
}
