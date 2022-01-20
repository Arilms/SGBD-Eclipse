package tp8;

public class Main {
	public static void main(String args[]) {
		
		Nome a3 = new Nome();
		
		a3.seta1p(0, 3);
		a3.seta1p(1, 2);
		a3.seta1p(2, 2);
		a3.seta1p(3, 2);
		a3.seta1p(4, 2);
		a3.seta1p(5, 2);
		a3.seta1p(6, 2);
		a3.seta1p(7, 2);
		a3.seta1p(8, 2);
		a3.seta1p(9, 2);
		
		System.out.println("----------");
		
		a3.seta1p(10, 1);
		
		System.out.println("----------");
		
		a3.seta2p(0, 2);
		a3.seta2p(1, 2);
		a3.seta2p(2, 2);
		a3.seta2p(3, 2);
		a3.seta2p(4, 2);
		a3.seta2p(5, 2);
		a3.seta2p(6, 2);
		a3.seta2p(7, 2);
		a3.seta2p(8, 2);
		a3.seta2p(9, 0);
		
		System.out.println("----------");
		
		a3.seta2p(10, 0);
		
		System.out.println("----------");
		
		try {
			a3.calcula(3, 1);
		} catch (ExcecaoDivisaoResultadoZero e) {
			e.printStackTrace();
		}
		
		
		a3.calculada();
		
	}
}
