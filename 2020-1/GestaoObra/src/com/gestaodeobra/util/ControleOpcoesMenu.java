package com.gestaodeobra.util;

import com.gestaodeobra.model.user.Diretor;
import com.gestaodeobra.model.user.Engenheiro;
import com.gestaodeobra.model.user.Funcionario;
import com.gestaodeobra.model.user.Secretario;

public class ControleOpcoesMenu {

	private  OpcaoMenu[] om;

	public  ControleOpcoesMenu retornaOpcoesMenu(Funcionario f) {
		int i = 0;
		if (f == null) {
			om = new OpcaoMenu[4];
			i=0;
			om[i++] = new OpcaoMenu(0);
			om[i] = new OpcaoMenu(1, i++);
			om[i] = new OpcaoMenu(2, i++);
			om[i] = new OpcaoMenu(10, i++);
		} else {
			if (f instanceof Diretor) {
				om = new OpcaoMenu[7];
				i = 0;
				om[i++] = new OpcaoMenu(0);
				om[i++] = new OpcaoMenu(1);
				om[i++] = new OpcaoMenu(3);
				om[i++] = new OpcaoMenu(7);
				om[i++] = new OpcaoMenu(8);
				om[i++] = new OpcaoMenu(9);
				om[i++] = new OpcaoMenu(10);
				
			} else if (f instanceof Engenheiro) {
				om = new OpcaoMenu[6];
				i = 0;
				om[i] = new OpcaoMenu(1, i++);
				om[i] = new OpcaoMenu(3, i++);
				om[i] = new OpcaoMenu(4, i++);
				om[i] = new OpcaoMenu(5, i++);
				om[i] = new OpcaoMenu(9, i++);
				om[i] = new OpcaoMenu(10, i++);
			} else if (f instanceof Secretario) {
				om = new OpcaoMenu[7];
				i = 0;
				om[i] = new OpcaoMenu(1, i++);
				om[i] = new OpcaoMenu(3, i++);
				om[i] = new OpcaoMenu(5, i++);
				om[i] = new OpcaoMenu(6, i++);
				om[i] = new OpcaoMenu(7, i++);
				om[i] = new OpcaoMenu(9, i++);
				om[i] = new OpcaoMenu(10, i++);
			}
		}
		
		return this;
	}

	public OpcaoMenu[] getOpcoesMenu() {
		return om;
	}
	
	public String[] getOpcoesMenuString() {
		String[] retorno = new String[om.length];
		for(int i = 0; i < om.length; i++) {
			retorno[i] = om[i].getLabel();
		} 
		return retorno;
	}
	
	
}
/*
 * 0 : contratar funcionario
 * 1 : listar empregados
 * 2 : realizar login
 * 3 : realizar logoff
 * 4 : solicitar material
 * 5 : listar solicitações de material
 * 6 : cadastrar orçamento
 * 7 : listar orçamentos
 * 8 : aprovar orçamento
 * 9 : voltar
 * 10: sair  
 */