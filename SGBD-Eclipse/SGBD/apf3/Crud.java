package apf3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud
{
    private Connection conexao;
    public Crud(Connection conexao){
        this.conexao = conexao;
    }
    
    public boolean createEm(int id_empresa, String Nome_empresa, String CNPJ, int id_endereço) {
    	try {
    		Statement statement = this.conexao.createStatement();
    		statement.executeUpdate("INSERT INTO Empresa VALUES ("+id_empresa+", '"+Nome_empresa+"', '"+CNPJ+"', "+id_endereço+")");
    		
    		return true;
    	}catch(SQLException e){
    		System.out.println("Erro!: "+e);
    		return false;
    		
    	}
    }
    
    public boolean createEn(int id_endereço, int Numero, String Rua, String Complemento, String CEP, String Cidade, String Estado){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO Endereço VALUES("+id_endereço+", "+Numero+", '"+Rua+"', '"+Complemento+"', '"+CEP+"', '"+Cidade+"', '"+Estado+"')");
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
    
    public boolean createEq(int id_equipamento, String Modelo, String Marca, int id_empresa){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO Equipamento VALUES("+id_equipamento+", '"+Modelo+"', '"+Marca+"', "+id_empresa+")");
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
    
    public boolean createF(int id_FuncionaE, String Nome, String Cargo, String CPF, String Email, String Usuario, String Senha, String Telefone1, int id_empresa, int id_endereço){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO FuncionarioE VALUES("+id_FuncionaE+", '"+Nome+"', '"+Cargo+"', '"+CPF+"', '"+Email+"', '"+Usuario+"', '"+Senha+"', '"+Telefone1+"', "+id_empresa+", "+id_endereço+")");
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
    
    public boolean createEsc(int id_escritorio, int id_equipamento, int id_FuncionaE, int id_empresa){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO Escritorio VALUES("+id_escritorio+", "+id_equipamento+", "+id_FuncionaE+", "+id_empresa+")");
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
    
    public boolean createL(int id_loja, String Nome, int id_endereço, int id_FuncionaE, int id_estoque){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO Loja VALUES("+id_loja+", '"+Nome+"', "+id_endereço+", "+id_FuncionaE+", "+id_estoque+")");
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
    
    public boolean createJ(int id_jogo, String Nome, String Genero, int Quantidade, int id_empresa){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO Jogo VALUES("+id_jogo+", '"+Nome+"', '"+Genero+"', "+Quantidade+", "+id_empresa+")");
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
    
    public boolean createEst(int id_estoque, int id_empresa, int id_jogo){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("INSERT INTO Estoque VALUES("+id_estoque+", "+id_empresa+", "+id_jogo+")");
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
    
    public boolean readF(int id_FuncionaE){
        try{
            Statement statement = this.conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM FuncionarioE WHERE id_FuncionaE = "+id_FuncionaE);
            
            while (rs.next()) {
                Integer id = rs.getInt("id_FuncionaE");
                String Nome = rs.getString("Nome");

                System.out.println( Nome +" - " + id);
            }
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
    
    public boolean readE(int id_endereço){
        try{
            Statement statement = this.conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Endereço WHERE id_endereço = "+id_endereço);
            
            while (rs.next()) {
                Integer id = rs.getInt("id_endereço");
                String Rua = rs.getString("Rua");

                System.out.println( Rua +" - " + id);
            }
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
    
    public boolean update(int id_FuncionaE, String novoNome){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("UPDATE FuncionarioE SET Nome ='"+novoNome+"' WHERE id_FuncionaE ="+id_FuncionaE);
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
    
    public boolean deleteE(int id_endereço){
        try{
            Statement statement = this.conexao.createStatement();
            statement.executeUpdate("DELETE FROM Endereço WHERE id_endereço ="+id_endereço+"");
            
            return true;
        }catch(SQLException e){
        	System.out.println("Erro!: "+e);
            return false;
        }
    }
}