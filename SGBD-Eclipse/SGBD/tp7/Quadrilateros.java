package tp7;

public abstract class Quadrilateros implements Poligonos {
	
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	
	public Quadrilateros(int lado1, int lado2, int lado3, int lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	public void setlado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public double getlado1() {
		return lado1;
	}
	
	public void setlado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public double getlado2() {
		return lado2;
	}
	
	public void setlado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public double getlado3() {
		return lado3;
	}
	
	public void setlado4(double lado4) {
		this.lado4 = lado4;
	}
	
	public double getlado4() {
		return lado4;
	}
	
	public double calculoperimetro() {
		double perimetro = lado1+lado2+lado3+lado4;
		return perimetro;
	}
	
	public double calculoarea() {
		double area = lado1*lado2;
		return area;
	}
	
}
