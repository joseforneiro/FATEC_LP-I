package br.org.fatec;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ProfissionalSQL extends ConnectionBase {
	
	public void inserir(Profissional profiss) {
		
		abrirConexao(); // Fun��o da classe ConnectionBase
		
		try {
			String sql = "INSERT INTO profissional";
			sql += "(profissao, area_trabalho, local_trabalho, graduacao, anos_estudos)";
			sql += "VALUES(?,?,?,?,?)";
			PreparedStatement stm = conexao.prepareStatement(sql);
			// Os gets s�o pegos da classe Profissional
			stm.setString(1, profiss.getProfissao());
			stm.setString(2, profiss.getArea());
			stm.setString(3, profiss.getLocal_trabalho());
			stm.setString(4, profiss.getGraduacao());
			stm.setInt(5, profiss.getAnos_estudos());
			
			stm.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			fecharConexao(); // Fun��o da classe ConnectionBase
		}
	}
	
	
	public Profissional buscarProfissional(String profissao) {

		abrirConexao();

		ArrayList<Profissional> result = new ArrayList<>();

		try {
			PreparedStatement stm = conexao.prepareStatement("SELECT * FROM profissional WHERE profissao LIKE '" + profissao + "%'");

			ResultSet rs = stm.executeQuery();

			while (rs.next()) {

				Profissional profiss = new Profissional(rs.getString(2), // Igual ao construtor da classe Profissional
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5),
						rs.getInt(6)
						);
				System.out.println(rs.getString(4));
				result.add(profiss);
			}
			stm.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Exception m�todo all");
			e.printStackTrace();
			
		} finally {
			fecharConexao();
		}
		return result.get(0);
	}
	

}
