package tp5;

public class Disciplina {
	
	Aluno[] alunos;
	
	public Disciplina() {
		alunos = new Aluno[10];
	}
	
	public void Posicao(int i, Aluno aluno) {
		
		alunos[i] = aluno;
	}
	
	public double RetornaMedia1() {
		int max = 0;
		double media1 = 0;
		for (int i=0; i<10; i++) {
			if(alunos[i]!= null) {
				media1 += alunos[i].getNota1();
				max++;
			}
		}
		return media1/max;
	}
	
	public double RetornaMedia2() {
		int max = 0;
		double media2 = 0;
		for (int i=0; i<10; i++) {
			if(alunos[i]!= null) {
				media2 += alunos[i].getNota2();
				max++;
			}
		}
		return media2/max;
	}
	
	
	public void ImprimeMedia1() {
		System.out.println("Media1: "+ RetornaMedia1());
	}
	
	
	public void ImprimeMedia2() {
		System.out.println("Media2: "+ RetornaMedia2());
	}
	
	public void Cessor(int i) {
		int x;
		for(x=i+1;x<10;x++) {
			if(alunos[x]!= null) {
				System.out.println(alunos[x].getnome() + " eh sucessor(a) de " + alunos[i].getnome());
				break;
			}
				
		}
		if(x==10) {
			System.out.println(alunos[i].getnome() + " nao possui sucessor(a).");
		}
		for(x=i-1; x>=0;x--) {
			if(alunos[x]!=null) {
				System.out.println(alunos[x].getnome() + " eh antecessor(a) de " + alunos[i].getnome());
				break;
			}
		}
		if(x==-1) {
			System.out.println(alunos[i].getnome() +" nao possui antecessor(a).");
		}
	}
	
	
}
