package com.gui.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.gui.ConsultaDados;
import com.gui.model.DadosPessoais;
import com.nomeBD.BD.ConexaoMysql;

public class DadosPessoaisDAO {

	private final String INSERT = "INSERT INTO dados_pessoais (NOME, APELIDO, IDADE) VALUES (?,?,?)";
	private final String UPDATE = "UPDATE dados_pessoais SET NOME = ?, APELIDO = ?, IDADE = ? WHERE id = ?";
	private final String DELETE = "DELETE FROM dados_pessoais WHERE id = ?";
	private final String LIST = "SELECT * FROM dados_pessoais";
	private final String LISTBYID = "SELECT * FROM dados_pessoais WHERE id = ?";

	public void inserir(DadosPessoais dp, ConsultaDados consulta) {
		try {
			ConexaoMysql conn = consulta.getConexaoMysql();
			PreparedStatement preparedStatement;
			preparedStatement = conn.connection.prepareStatement(INSERT);

			preparedStatement.setString(1, dp.getNome());
			preparedStatement.setString(2, dp.getApelido());
			preparedStatement.setInt(3, dp.getIdade());

			preparedStatement.execute();

			JOptionPane.showMessageDialog(consulta, "Dado inserido com sucesso");
			conn.FecharConexao();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<DadosPessoais> getDadosPessoais(ConsultaDados consulta) {
		ConexaoMysql conn;
		ArrayList<DadosPessoais> dados = null;
		try {
			conn = consulta.getConexaoMysql();

			PreparedStatement pstm = null;
			ResultSet rs = null;
			dados = new ArrayList<DadosPessoais>();

			pstm = conn.connection.prepareStatement(LIST);
			rs = pstm.executeQuery();
			while (rs.next()) {
				DadosPessoais dado = new DadosPessoais();

				dado.setId(rs.getInt("id"));
				dado.setNome(rs.getString("nome"));
				dado.setApelido(rs.getString("apelido"));
				dado.setIdade(rs.getInt("idade"));
				dados.add(dado);
			}
			conn.FecharConexao();

		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return dados;
	}
}
