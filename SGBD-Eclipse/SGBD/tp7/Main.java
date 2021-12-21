package tp7;

public class Main {
	public static void main(String args[]) {
		Quadrado quadrado1 = new Quadrado(5);
		Retangulo retangulo1 = new Retangulo(3,3);
		Circulo circulo1 = new Circulo(2.5);
		
		System.out.println(quadrado1);
		System.out.println(retangulo1);
		
		System.out.println(circulo1);
	
		
		
		circulo1.setraio(1);
		
		System.out.println("Teste: \n"+circulo1);
		
		
		
		
		
		quadrado1.setlado(3);
		
		System.out.println("Teste1: \n"+quadrado1);
		
		
		
		
		
		retangulo1.setaltura(2);
		
		System.out.println("Teste2: \n"+retangulo1);
		
		retangulo1.setbase(4);
		
		System.out.println("Teste3: \n"+retangulo1);
		
		retangulo1.setmedida(8, 1);
		
		System.out.println("Teste4: \n"+retangulo1);
		
		
	}

}
