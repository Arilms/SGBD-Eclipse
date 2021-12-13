package tp6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud {
	private Connection conexao;
	public Crud(Connection conexao) {
		this.conexao = conexao;
	}
	
	
	public boolean create(int ID_Localiza, String Rua, int Numero, String Complemento, String CEP, String Cidade, String Estado) {
		try {
			Statement statement = this.conexao.createStatement();
			statement.executeUpdate("INSERT INTO Localizacao VALUES("+ID_Localiza+", '"+Rua+"', '"+Complemento+"', "+Numero+", '"+CEP+"', '"+Cidade+"', '"+Estado+"')");
			
			return true;
		}
		catch(SQLException e) {
			return false;
		}
	}
	
	public boolean read(String Rua) {
		try {
			Statement statement = this.conexao.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM Localizacao WHERE Rua = '"+Rua+"' ");
			
			while (rs.next()) {
				String rua = rs.getString("Rua");
				
				System.out.println(rua);
			}
			
			return true;
		}
		catch(SQLException e) {
			return false;
		}
	}
	
	public boolean readlike(String Rua) {
		try {
			Statement statement = this.conexao.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM Localizacao WHERE "+Rua+" LIKE '%a%'");
			
			while (rs.next()) {
				String rua = rs.getString("Rua");
				
				System.out.println("Rua = "+rua);
			}
			
			return true;
		}
		catch(SQLException e) {
			return false;
		}
	}
	
	public boolean update(int ID_Localiza, String Rua) {
		try {
			Statement statement = this.conexao.createStatement();
			statement.executeUpdate("UPDATE Localizacao SET Rua = '"+Rua+"' WHERE ID_Localiza ="+ID_Localiza);
			
			return true;
		}
		catch(SQLException e) {
			return false;
		}
	}
	
	public boolean delete(int ID_Localiza) {
		try {
			Statement statement = this.conexao.createStatement();
			statement.executeUpdate("DELETE FROM Localizacao WHERE ID_Localiza ="+ID_Localiza);
			
			return true;
		}
		catch(SQLException e) {
			return false;
		}
	}

}
