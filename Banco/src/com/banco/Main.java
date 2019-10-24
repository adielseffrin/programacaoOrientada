package com.banco;

import java.sql.SQLException;

import com.banco.BD.ConexaoMysql;
import com.banco.model.Pessoa;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Pessoa adiel = new Pessoa();
		 
		adiel.consultar(10);
		adiel.setNome("Ciclaano");
		adiel.setIdade(50);
		//adiel.setPeso(2);
		
		adiel.save();
		//#TODO tentar implementar!!
		//criar Pessoas -> vetor, classe de Pessoa's
		//consulta que busca mais de uma pessoa
		

	}

}
