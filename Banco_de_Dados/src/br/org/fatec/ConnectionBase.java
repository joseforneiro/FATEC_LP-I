package br.org.fatec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBase {
	
	protected Connection conexao;
	
	public Connection open() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Ok");
			
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/profissao", "Profissao", "123");
			
			System.out.println("Realizada a conexão");
			return conexao;
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void close() {
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