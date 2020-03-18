package com.banco;

import java.sql.SQLException;

import com.banco.BD.ConexaoMysql;
import com.banco.model.Catalogo;
import com.banco.model.Pessoa;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Catalogo c = new Catalogo();
		c.criarCatalogo();
		for(Pessoa p : c.getCatalogo()) {
			System.out.printf("Nome: %s(%d)%nIdade: %d%nPeso: %.2fkg%n---------%n",p.getNome(),p.getId(),p.getIdade(),p.getPeso());
		}

		

	}

}
