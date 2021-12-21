package tp7;

public class Quadrado extends Quadrilateros {
	
	public Quadrado(int lado) {
		super(lado, lado, lado, lado);
		
	}
	
	public void setlado(double lado) {
		super.setlado1(lado);
		super.setlado2(lado);
		super.setlado3(lado);
		super.setlado4(lado);
		
	}
	

	public String toString() {
		String A = "---------------------------|\nLado do Quadrado: "+super.getlado1()+
				"\n\nArea do Quadrado: "+super.calculoarea()+
				"\n\nPerimetro do Quadrado: "+super.calculoperimetro()+"\n---------------------------|";
		return  A;
	}
	

}
