package tp6;

import tp6.TestConnectionsql3;
import tp6.Crud;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String args[])throws Exception{
		TestConnectionsql3 conexao = new TestConnectionsql3();
		conexao.abrirConexao();
		Crud crud = new Crud(conexao.getConnection());
		
		
		crud.create(0,"Floriano_Peixoto",1211,"Perto_do_posto_ipiranga","123446-789","Fortaleza","Ceara");
		crud.create(1,"Floriano_Peixoto",1111,"Perto_do_posto","123456-789","Fortaleza","Ceara");
		crud.create(2,"Saldanha_Marinho",4321,"Perto_de_uma_pedra_grande","123654-789","Fortaleza","Ceara");
		crud.create(3,"Rua_Ficticia",1234,"Do_lado_de_uma_escola","321123-432","Fortaleza","Ceara");
		crud.create(4,"Teste",5421,"teste denovo","312123-333","Testo","Testa");
		
		
		
		
		crud.read("Teste");
		
		crud.update(4,"teste 2");
		
		crud.read("teste 2");
		
		crud.delete(4);
		
		crud.read("Floriano_Peixoto");
		
		crud.create(4,"Teste",5421,"teste denovo","312123-333","Testo","Testa");
		
		crud.readlike("Rua","a");
		
		
		
		
		
		Armazenamento teste = new Armazenamento(conexao.getConnection());
		
		
		Funcionario[] Funcionarios = new Funcionario[5];
		
		
		
		Funcionarios[0] = new Funcionario();
		Funcionarios[0].setid_funciona(1);
		Funcionarios[0].setnome("Teste0");
		Funcionarios[0].setcargo("Testador0");
		Funcionarios[0].setid_empresa(1);
		Funcionarios[0].setid_localiza(1);
		System.out.println(Funcionarios[0].getid_funciona());
		Funcionarios[1] = new Funcionario();
		Funcionarios[1].setid_funciona(2);
		Funcionarios[1].setnome("Teste1");
		Funcionarios[1].setcargo("Testador1");
		Funcionarios[1].setid_empresa(1);
		Funcionarios[1].setid_localiza(1);
		System.out.println(Funcionarios[1].getid_funciona());
		Funcionarios[2] = new Funcionario();
		Funcionarios[2].setid_funciona(3);
		Funcionarios[2].setnome("Teste2");
		Funcionarios[2].setcargo("Testador2");
		Funcionarios[2].setid_empresa(1);
		Funcionarios[2].setid_localiza(1);
		System.out.println(Funcionarios[2].getid_funciona());
		Funcionarios[3] = new Funcionario();
		Funcionarios[3].setid_funciona(4);
		Funcionarios[3].setnome("Teste3");
		Funcionarios[3].setcargo("Testador3");
		Funcionarios[3].setid_empresa(1);
		Funcionarios[3].setid_localiza(1);
		System.out.println(Funcionarios[3].getid_funciona());
		Funcionarios[4] = new Funcionario();
		Funcionarios[4].setid_funciona(5);
		Funcionarios[4].setnome("Teste4");
		Funcionarios[4].setcargo("Testador4");
		Funcionarios[4].setid_empresa(1);
		Funcionarios[4].setid_localiza(1);
		System.out.println(Funcionarios[4].getid_funciona());		
		
		
		
		for(int i=0;i < Funcionarios.length; i++) {
			teste.Posicao(i, Funcionarios[i]);
		}
		
		
		teste.adiciona();
		
		
		
		
		
		
		conexao.fecharConexao();
		
	}

}
