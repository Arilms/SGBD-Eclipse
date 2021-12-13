package tp6;

public class Funcionario {
	
	private int ID_Funciona;
	private String Nome;
	private String Cargo;
	private int ID_Empresa;
	private int ID_Localiza;
	
	public void setid_funciona(int ID){
        ID_Funciona = ID;
    }
    
    public int getid_funciona(){
        return ID_Funciona;
    }
    
    public void setnome(String A){
        Nome = A;
    }
    
    public String getnome(){
        return Nome;
    }
    
    public void setcargo(String B){
        Cargo = B;
    }
    
    public String getcargo(){
        return Cargo;
    }
    
    public void setid_empresa(int C){
        ID_Empresa = C;
    }
    
    public int getid_empresa(){
        return ID_Empresa;
    }
    
    public void setid_localiza(int D){
        ID_Localiza = D;
    }
    
    public int getid_localiza(){
        return ID_Localiza;
    }
    

}
