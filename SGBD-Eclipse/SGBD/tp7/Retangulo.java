package tp7;

public class Retangulo extends Quadrilateros {	


	public Retangulo(int base, int altura) {
		super(base, altura, base, altura);
	}
	
	public void setbase(int base) {
		super.setlado1(base);
		super.setlado3(base);
		
	}
	
	public void setaltura(int altura) {
		super.setlado2(altura);
		super.setlado4(altura);
		
	}
	
	public void setmedida(int base, int altura) {
		super.setlado1(base);
		super.setlado2(altura);
		super.setlado3(base);
		super.setlado4(altura);
	}
	
	public String toString() {
		String A ="Base 1: "+super.getlado1()+
				"\nAltura 1: "+super.getlado2()+
				"\nBase 2: "+super.getlado3()+
				"\nAltura 2: "+super.getlado4()+
				"\n\nArea do Retangulo: "+super.calculoarea()+
				"\n\nPerimetro do Retangulo: "+super.calculoperimetro()+"\n---------------------------|";
		return  A;
	}
	
	



}
