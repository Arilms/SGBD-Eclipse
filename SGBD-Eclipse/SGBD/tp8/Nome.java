package tp8;

public class Nome {
	private int[] a1;
	private int[] a2;
	
	public Nome(){
		a1 = new int[10];
		a2 = new int[10];
	}
	
    public void seta1(int[] a1){
        this.a1 = a1;
    }
    
    public int[] geta1(){
        return a1;
    }
    
    
    public void seta2(int[] a2){
        this.a2 = a2;
    }
    
    public int[] geta2(){
        return a2;
    }
    
    public void seta1p(int posicao, int valor) {
    	try {
    		a1[posicao] = valor;
    		System.out.println("Posição: "+posicao+", Valor: "+a1[posicao]);
    			
    		}catch(ArrayIndexOutOfBoundsException e) {
    			System.out.println("Digite uma Posição entre 0 e 9!");
    		}
    }
    
    public void seta2p(int posicao, int valor) {
    	try {
    		a2[posicao] = valor;
    		System.out.println("Posição: "+posicao+", Valor: "+a2[posicao]);
    			
    		}catch(ArrayIndexOutOfBoundsException e) {
    			System.out.println("Digite uma Posição entre 0 e 9!");
    		}
    }
    
    public double calcula(int a, int b) throws ExcecaoDivisaoResultadoZero {
    		if (b == 0) {
    			throw new ExcecaoDivisaoResultadoZero();
    		} else {
    			double c = ((double)a)/b;
    			return c;
    		}
    		
    }
    
    public void calculada() {
    	for (int i = 0; i<a1.length || i<a2.length;i++) {
    		int a = a1[i];
    		int b = a2[i];
    		try {
				System.out.println("Divisão: "+calcula(a, b)+", Posição: "+i);
				System.out.println("----------");
			} catch (ExcecaoDivisaoResultadoZero e) {
				e.printStackTrace();
			} finally {
				System.out.println("Posição: "+i+", Valor 1: "+a1[i]+", Valor 2: "+a2[i]);
				System.out.println("----------------------------------------|");
			}
    	}
    	
    	
    }
    
	
}
