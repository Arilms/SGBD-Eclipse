package apf3;

import apf3.TestConexaoSqlite3;
import apf3.Crud;
import java.sql.Statement;
import java.sql.SQLException;

public class Main{
    public static void main(String args[])throws Exception{
        TestConexaoSqlite3 conexao = new TestConexaoSqlite3();
        conexao.abrirConexao();
        Crud crud = new Crud(conexao.getConnection());
        
        //Equipe: José Arilmar Saldanha Fontenele Neto - 475153
        
        
        crud.createEn(0, 1234, "Solon Pinheiro", "atras de uma escola", "12345-678", "Fortaleza", "Ceará");
        crud.createEn(1, 1235, "Avenida Afrânio Peixoto", "perto de uma escola", "12345-677", "Salvador", "Bahia");
        crud.createEn(2, 1236, "Heraclito Graça", "do lado de uma escola", "12345-321", "Fortaleza", "Ceará");
        crud.createEn(3, 1231, "Floriano Peixoto", "longe de uma escola", "12345-421", "Fortaleza", "Ceará");
        crud.createEn(4, 1222, "Floriano Peixoto", "longe mais ainda de uma escola", "12345-422", "Fortaleza", "Ceará");
        crud.createEn(5, 1254, "Floriano Peixoto", "quase do lado de uma escola", "12345-423", "Fortaleza", "Ceará");
        crud.createEm(0, "Jogos/Vendas LTDA", "12313123123", 3);
        crud.createEq(0, "Notebook", "Dell", 0);
        crud.createF(0, "Arilmar", "Gerente", "512.123.432-12", "batata@gmail.com", "Cenoura", "senha", "91234-5678", 0, 0);
        crud.createF(1, "Gilberto", "Lojista-Chefe", "532.123.432-12", "cenoura@gmail.com", "Gilberto", "senhadificil", "91234-5668", 0, 1);
        crud.createF(2, "Matheus", "Programador-Chefe", "122.123.432-12", "feijao@gmail.com", "Matheus", "senhafacil", "91234-1234", 0, 2);
        crud.createEsc(0, 0, 0, 0);
        crud.createJ(0, "Batatonator", "Ação/Aventura", 250, 0);
        crud.createEst(0, 0, 0);
        crud.createL(0, "Lojas LTDA", 4, 1, 0);
        
        
        
        crud.readF(0);
        
        crud.update(0, "Arilmar F");
        
        crud.readF(0);
        
        crud.readE(5);
        crud.deleteE(5);
        crud.readE(5);
    
        
        
        conexao.fecharConexao();
        
        System.out.println("Deu errado!");
        //System.out.println("Pronto!");
        
        
    }
}