package apf3;

public class Endere�o {
	
	private int id_endere�o;
	private int Numero;
	private String Rua;
	private String Complemento;
	private String CEP;
	private String Cidade;
	private String Estado;
	
	public Endere�o() {
		
	}
	
	public void setidEndere�o(int id_endere�o) {
		this.id_endere�o = id_endere�o;
	}
	
	public int getidEndere�o() {
		return id_endere�o;
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
