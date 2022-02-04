package apf3;

public class Jogo {
	private int id_jogo;
	private String Nome;
	private String Genero;
	private int Quantidade;
	private int id_empresa;
	
	public Jogo() {
		
	}
	
	public int getId_jogo() {
		return id_jogo;
	}

	public void setId_jogo(int id_jogo) {
		this.id_jogo = id_jogo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}	

}
