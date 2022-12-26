package db;
/*
 * CLASSE DbManager
 * Classe respons�vel por:
 *       Estabelecer o funcionamento da conex�o com o banco
 *       Fechar a conex�o e tamb�m recursos(Statement, ResultSet) 
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {
		
		private static Connection connection = null;
		private static String url = "jdbc:mysql://localhost:3306/academiajava";
		private static String username = "developer";
		private static String password = "56709199";
		
//		Retorna a conex�o aberta. Se estiver nula, abre uma nova conex�o.
		public static Connection getConnection() {
			if(connection == null) {
				try {
//	OBS: Com o conector 8.0.23 n�o � mais necess�rio registrar o Driver
//					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					connection = DriverManager.getConnection(url, username, password);
				}catch(SQLException e) {
					throw new DbException(e.getMessage());
				}
			}
			
			return connection;
			
		}

		
//	M�TODOS PARA FECHAR RECURSOS 
		public static void closeConnection() {
			if(connection != null) {
				try {
					connection.close();
				}catch(SQLException e) {
					throw new DbException(e.getMessage());
				}
			}
		}
		
		
		public static void closeResultSet(ResultSet rs) {
			if(rs != null) {
				try {
					rs.close();
				}catch(SQLException e) {
					throw new DbException(e.getMessage());
				}
			}
		}
		
		public static void closeStatement(Statement st) {
			if(st != null) {
				try {
					st.close();
				}catch(SQLException e) {
					throw new DbException(e.getMessage());
				}
			}
		}
	
}
