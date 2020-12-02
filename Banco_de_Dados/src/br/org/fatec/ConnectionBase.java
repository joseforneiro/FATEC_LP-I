package br.org.fatec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBase {
	
	/*Configura��o do BD */
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
			
			System.out.println("Iniciada a conex�o");
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
				System.out.println("Finalizada a conex�o");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


}