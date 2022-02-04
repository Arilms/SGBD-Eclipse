package apf3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexaoSqlite3 {

    private Connection connection;
    public TestConexaoSqlite3(){
        this.connection = null;
    }
    
    private void setConnection(Connection connection){
        this.connection = connection;
    }
    public Connection getConnection(){
        return this.connection;
    }
    
    public boolean abrirConexao(){
      
      try
      {
        // create a database connection
        connection = DriverManager.getConnection("jdbc:sqlite:E:/Arilmar/Aulas/Programação/APF3/apf3.db");
        this.setConnection(connection);        
        return true;

      }
      catch(SQLException e)
      { 
    	System.out.println("Erro!: "+e);  
        return false;
      }
    }
      public boolean fecharConexao(){
        try
        {
          if(this.getConnection() != null)
                this.getConnection().close();
                return true;
        }
        catch(SQLException e)
        {
        System.out.println("Erro!: "+e);
        return false;
        }
    }
}