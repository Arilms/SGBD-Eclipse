package apf3;

public class Empresa {
	
	private int id_empresa;
	private String Nome_empresa;
	private String CNPJ;
	private int id_endereço;
	
	
	public Empresa() {
	}

	public int getId_empresa() {
		return id_empresa;
	}


	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}
	
	public String getNome_empresa() {
		return Nome_empresa;
	}


	public void setNome_empresa(String nome_empresa) {
		this.Nome_empresa = nome_empresa;
	}


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		this.CNPJ = cNPJ;
	}


	public int getId_endereço() {
		return id_endereço;
	}


	public void setId_endereço(int id_endereço) {
		this.id_endereço = id_endereço;
	}
	
	

}
