package tp6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestConnectionsql3 {
	private Connection connection;
	public TestConnectionsql3() {
		this.connection = null;
	}
	
	private void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	
	public boolean abrirConexao() {
		
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:E:/Arilmar/Aulas/Programação/TP6/TP6.db");
			this.setConnection(connection);
			return true;
		}
		catch(SQLException e) {
			return false;
		}
	}
	
	public boolean fecharConexao() {
		try {
			if(this.getConnection() != null)
				this.getConnection().close();
			    return true;		
		}
		catch(SQLException e) {
			return false;
		}
	}

}
