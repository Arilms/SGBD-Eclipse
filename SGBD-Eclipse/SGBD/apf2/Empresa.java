package apf2;

public class Empresa {
	
	private String Nome_empresa;
	private int id_empresa;//chave prim�ria
	private String CNPJ;
	private int id_endere�o;//chave estrangeira de Endere�o
	
	
	public Empresa() {
	}


	public String getNome_empresa() {
		return Nome_empresa;
	}


	public void setNome_empresa(String nome_empresa) {
		this.Nome_empresa = nome_empresa;
	}


	public int getId_empresa() {
		return id_empresa;
	}


	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		this.CNPJ = cNPJ;
	}


	public int getId_endere�o() {
		return id_endere�o;
	}


	public void setId_endere�o(int id_endere�o) {
		this.id_endere�o = id_endere�o;
	}
	
	

}
