package com.banco;

import java.sql.SQLException;

import com.banco.BD.ConexaoMysql;
import com.banco.model.Pessoa;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Pessoa adiel = new Pessoa();
		//adiel.setNome("Adiel");
		//adiel.setIdade(27);
		//adiel.setPeso(65.3);
		
		//adiel.insert();
		
		adiel.consultar(1);
		System.out.println(adiel.getNome());
		

	}

}
