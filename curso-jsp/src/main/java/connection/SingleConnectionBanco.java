package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionBanco {
	
	private static String banco = "jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true";
	private static String user = "postgres";
	private static String senha = "admin";
	private static Connection connection = null;
	
	public static Connection getConnection() {
		return connection;
	}
	
	static {
		conectar();
	}
	
	public SingleConnectionBanco() {
		conectar();
	}

	private static void conectar() {
		
		try {
			
			if(connection == null) {
				Class.forName("org.postgresql.Driver"); /*carrega o drive de conex�o do banco*/
				connection = DriverManager.getConnection(banco, user, senha);
				connection.setAutoCommit(false);/*para nao fazer altera��es no banco sem meu comando*/
			}
			
		} catch (Exception e) {
			e.printStackTrace();/*mostrar qualquer erro*/
		}
	}

}
