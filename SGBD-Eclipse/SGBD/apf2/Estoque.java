package apf2;

public class Estoque {
	
	private int id_estoque;//chave primária
	private int qtd_estoque;//quantidade de jogos em estoque
	private String qtd_jogo_A;//quantidades de jogos A
	private String qtd_jogo_B;// quantidades de jogos B
	
	public Estoque() {
		
	}

	public int getId_estoque() {
		return id_estoque;
	}

	public void setId_estoque(int id_estoque) {
		this.id_estoque = id_estoque;
	}

	public String getQtd_jogo_A() {
		return qtd_jogo_A;
	}

	public void setQtd_jogo_A(String qtd_jogo_A) {
		this.qtd_jogo_A = qtd_jogo_A;
	}

	public String getQtd_jogo_B() {
		return qtd_jogo_B;
	}

	public void setQtd_jogo_B(String qtd_jogo_B) {
		this.qtd_jogo_B = qtd_jogo_B;
	}
	
	public int qtd_estoque(int qtd_jogo_A, int qtd_jogo_B) {
		qtd_estoque = qtd_jogo_A + qtd_jogo_B;
		return qtd_estoque;
	}

}
