package br.org.fatec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBase {
	
	/*Configuração do BD */
	String url = "jdbc:mysql://localhost:3306/profissao";
	String user = "Profissao";
	String password = "123";
	String driver = "com.mysql.jdbc.Driver";
	
	protected Connection conexao;
	
	public Connection abrirConexao() {
		
		try {
			
			Class.forName(driver);
			System.out.println("Driver Ok");
			
			conexao = DriverManager.getConnection(url, user , password);
			
			System.out.println("Iniciada a conexão");
			return conexao;
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void fecharConexao() {
		try {
				if(conexao != null)
					conexao.close();
				System.out.println("Finalizada a conexão");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


}