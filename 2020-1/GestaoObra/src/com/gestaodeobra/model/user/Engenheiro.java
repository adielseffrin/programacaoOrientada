package com.gestaodeobra.model.user;

import com.gestaodeobra.model.Solicitacao;

public class Engenheiro extends Funcionario {

	public Engenheiro(String n, String m) {
		super(n,m);
	}
	
	public Solicitacao novaSolicitacao() {
		return null;
	}
}
