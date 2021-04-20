package com.dadospessoais;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dadospessoais.BD.ConexaoMysql;
import com.dadospessoais.model.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexaoMysql conn = new ConexaoMysql();
		
		

		try {
			Usuario u = new Usuario(conn);
			u.carregaUser(1);
			System.out.println(u.getNome());
			
			u.atualizaUser(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

/*
 * CRIAR UM MINI-CRUD PARA dados_pessoais
 * -> Create (Criar)
 * -> Retrieve(Buscar)
 * Update(Atualizar)
 * Delete(Apagar)
 * 
 * JoptionPane -> menu 
 * 1) Adicionar
 * 2) Listar pessoas
 * 
 * 1.1) Nome, idade, apelido -> salvar
 * 
 * 
 * */






