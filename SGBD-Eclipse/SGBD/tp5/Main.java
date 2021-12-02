package tp5;

//Nome: José Arilmar Saldanha Fontenele Neto

public class Main {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.setnome("José Arilmar Saldanha Fontenele Neto");
		aluno1.setid(475153);
		aluno1.setNota1(3.5);
		aluno1.setNota2(6.5);
		aluno1.passou();
		aluno1.retornaMedia();
		

		Aluno[] alunos = new Aluno[10];
		
		alunos[0] = new Aluno();
		alunos[0].setnome("Andre");
		alunos[0].setNota1(4);
		alunos[0].setNota2(8);
		alunos[1] = new Aluno();
		alunos[1].setnome("Carlos");
		alunos[1].setNota1(9);
		alunos[1].setNota2(7);
		alunos[2] = new Aluno();
		alunos[2].setnome("Carol");
		alunos[2].setNota1(6);
		alunos[2].setNota2(3);
		alunos[3] = new Aluno();
		alunos[3].setnome("Helio");
		alunos[3].setNota1(4);
		alunos[3].setNota2(5);
		alunos[4] = new Aluno();
		alunos[4].setnome("Gilberto");
		alunos[4].setNota1(3);
		alunos[4].setNota2(10);
		alunos[5] = new Aluno();
		alunos[5].setnome("Clara");
		alunos[5].setNota1(10);
		alunos[5].setNota2(9);
		alunos[6] = new Aluno();
		alunos[6].setnome("Jessica");
		alunos[6].setNota1(8);
		alunos[6].setNota2(7);
		alunos[7] = new Aluno();
		alunos[7].setnome("Jenifer");
		alunos[7].setNota1(6);
		alunos[7].setNota2(8);
		alunos[8] = new Aluno();
		alunos[8].setnome("Pamela");
		alunos[8].setNota1(8);
		alunos[8].setNota2(9);
		alunos[9] = new Aluno();
		alunos[9].setnome("Arilmar");
		alunos[9].setNota1(8);
		alunos[9].setNota2(6);
		
		Disciplina aluno2 = new Disciplina();
		
		for(int i=0;i < alunos.length; i++) {
			aluno2.Posicao(i, alunos[i]);
		}
		
		aluno2.ImprimeMedia1();
		aluno2.ImprimeMedia2();
		
		aluno2.Cessor(4);
	
	}
	

	
}
