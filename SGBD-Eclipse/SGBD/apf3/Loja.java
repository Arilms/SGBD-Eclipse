package apf3;

public class Loja {
	
	private int id_loja;
	private String Nome;
	private int id_endereço;
	private int id_FuncionaE;
	private int id_estoque;
	
	public Loja() {
		
	}

	public int getId_loja() {
		return id_loja;
	}

	public void setId_loja(int id_loja) {
		this.id_loja = id_loja;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public int getId_endereço() {
		return id_endereço;
	}

	public void setId_endereço(int id_endereço) {
		this.id_endereço = id_endereço;
	}

	public int getId_FuncionaE() {
		return id_FuncionaE;
	}

	public void setId_FuncionaE(int id_FuncionaE) {
		this.id_FuncionaE = id_FuncionaE;
	}

	public int getId_estoque() {
		return id_estoque;
	}

	public void setId_estoque(int id_estoque) {
		this.id_estoque = id_estoque;
	}

}
