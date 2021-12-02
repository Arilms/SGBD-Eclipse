package tp5;

public class Aluno
{
    private String nome;
    private int id;
    private double media;
    
    protected double nota1;
    protected double nota2;
    
    public Aluno(){
        nome = "Arilmar";
        id = 475153;
        nota1 = 9;
        nota2 = 8;
    }
    
    
    public void ImprimeNome(){
        System.out.println(nome);
    }
    
    public void ImprimeID(){
        System.out.println(id);
    }
    
    private double calculaMedia(){
    	media = (nota1 + nota2)/2;
        return media;
    }
    
    public void retornaMedia(){   
        System.out.println(calculaMedia());
    }
    
    public void passou(){
        if (calculaMedia() > 7){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    
    }

    public void setnome(String Nome){
        nome = Nome;
    }
    
    public String getnome(){
        return nome;
    }
    
    public void setid(int ID){
        id = ID;
    }
    
    public int getid(){
        return id;
    }
    
    public void setNota1(double nota){
        nota1 = nota;
    }
    
    public double getNota1(){
        return nota1;
    }
    
    public void setNota2(double nota){
        nota2 = nota;
    }
    
    public double getNota2(){
        return nota2;
    }

}