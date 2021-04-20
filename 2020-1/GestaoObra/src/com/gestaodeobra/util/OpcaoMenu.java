package com.gestaodeobra.util;

public class OpcaoMenu {
	private int idInterna;
	private int idVariavel;
	private String label;
	
	public OpcaoMenu(int ii, int iv) {
		idInterna = ii;
		idVariavel = iv;
		label = retornaLabel();
	}
	
	public OpcaoMenu(int ii) {
		idInterna = ii;
		
		label = retornaLabel();
	}
	
	public int getIdInterna() {
		return idInterna;
	}
	public void setIdInterna(int idInterna) {
		this.idInterna = idInterna;
	}
	public int getIdVariavel() {
		return idVariavel;
	}
	public void setIdVariavel(int idVariavel) {
		this.idVariavel = idVariavel;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	private String retornaLabel() {
		String[] opcoes = new String[11];
		opcoes[0] = "Contratar funcion�rio";
		opcoes[1] = "Listar empregados";
		opcoes[2] = "Realizar login";
		opcoes[3] = "Realizar logoff";
		opcoes[4] = "solicitar material";
		opcoes[5] = "listar solicita��es de material";
		opcoes[6] = "cadastrar or�amento";
		opcoes[7] = "listar or�amentos";
		opcoes[8] = "aprovar or�amento";
		opcoes[9] = "Voltar";
		opcoes[10] = "Sair";
		
		return opcoes[idInterna];
		
	}
	
	
}

/*
 * 0 : contratar funcionario
 * 1 : listar empregados
 * 2 : realizar login
 * 3 : realizar logoff
 * 4 : solicitar material
 * 5 : listar solicita��es de material
 * 6 : cadastrar or�amento
 * 7 : listar or�amentos
 * 8 : aprovar or�amento
 * 9 : voltar
 * 10: sair  
 */
