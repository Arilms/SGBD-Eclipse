package tp7;


public class Circulo implements Poligonos {
	
	private double raio;
	private double pi = 3.14159;
	
	public Circulo() {
		double raio = 1;
		this.raio = raio;
	}
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public void setraio(double raio) {
		this.raio = raio;
	}
	
	public double getraio() {
		return raio;
	}

	public double calculoperimetro() {
		double P = 2*pi*raio;
		return P;
	}

	public double calculoarea() {
		double Area = pi*raio*raio;
		return Area;
	}
	
	public String toString() {
		return "Raio: "+getraio()+
				"\n\nPerimetro do Circulo: "+calculoperimetro()+
				"\n\nArea do Circulo: "+calculoarea()+"\n---------------------------|";
	}

}
