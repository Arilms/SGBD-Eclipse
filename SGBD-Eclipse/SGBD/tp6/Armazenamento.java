package tp6;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Armazenamento {
	
	private Connection conexao;
	
	Funcionario[] Funcionarios;
	

	
	public Armazenamento(Connection conexao) {
		Funcionarios = new Funcionario[5];
		this.conexao = conexao;
		
		
	}
	
    
    public boolean adiciona() {
		try {
			
				for (int i=0; i<Funcionarios.length; i++) {
					if(Funcionarios[i]!= null) {
						Statement statement = this.conexao.createStatement();
						statement.executeUpdate("INSERT INTO Funcionario VALUES("+Funcionarios[i].getid_funciona()+", '"+Funcionarios[i].getnome()+"', '"+Funcionarios[i].getcargo()+"', "+Funcionarios[i].getid_empresa()+", "+Funcionarios[i].getid_localiza()+")");
					}
				}
			
			//statement.executeUpdate("INSERT INTO Funcionario VALUES("+ID_Funciona+", '"+Nome+"', '"+Cargo+"', "+ID_Empresa+", "+ID_Localiza+")");
			
			return true;
		}
		catch(SQLException e) {
			return false;
		}
	}
	
	public void Posicao(int i, Funcionario funcionario) {
		
		Funcionarios[i] = funcionario;
	}
	

}
