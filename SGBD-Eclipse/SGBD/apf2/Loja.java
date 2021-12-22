package apf2;

public class Loja {
	
	private int id_loja;//chave primaria
	private String nome;//nome da loja
	private int id_endere�o;// localiza��o / chave estrangeira de Endere�o
	private int id_estoque;// estoque da loja / chave estrangeira de Estoque
	private int id_FuncionaE;// id dos funcionarios que trabalham nessa loja / chave estrangeira de Funcionario
	
	public Loja() {
		
	}

	public int getId_loja() {
		return id_loja;
	}

	public void setId_loja(int id_loja) {
		this.id_loja = id_loja;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_endere�o() {
		return id_endere�o;
	}

	public void setId_endere�o(int id_endere�o) {
		this.id_endere�o = id_endere�o;
	}

	public int getId_estoque() {
		return id_estoque;
	}

	public void setId_estoque(int id_estoque) {
		this.id_estoque = id_estoque;
	}

	public int getId_FuncionaE() {
		return id_FuncionaE;
	}

	public void setId_FuncionaE(int id_FuncionaE) {
		this.id_FuncionaE = id_FuncionaE;
	}

}
