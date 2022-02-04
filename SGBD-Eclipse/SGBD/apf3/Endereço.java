package apf3;

public class Endereço {
	
	private int id_endereço;
	private int Numero;
	private String Rua;
	private String Complemento;
	private String CEP;
	private String Cidade;
	private String Estado;
	
	public Endereço() {
		
	}
	
	public void setidEndereço(int id_endereço) {
		this.id_endereço = id_endereço;
	}
	
	public int getidEndereço() {
		return id_endereço;
	}
	
	public void setNumero(int numero) {
		this.Numero = numero;
	}

	public int getNumero() {
		return Numero;
	}
	
	public void setRua(String rua) {
		this.Rua = rua;
	}


	public String getRua() {
		return Rua;
	}
	
	public void setComplemento(String complemento) {
		this.Complemento = complemento;
	}

	public String getComplemento() {
		return Complemento;
	}
	
	public void setCEP(String cEP) {
		this.CEP = cEP;
	}

	public String getCEP() {
		return CEP;
	}
	
	public void setCidade(String cidade) {
		this.Cidade = cidade;
	}

	public String getCidade() {
		return Cidade;
	}
	
	public void setEstado(String estado) {
		this.Estado = estado;
	}

	public String getEstado() {
		return Estado;
	}

	

}
