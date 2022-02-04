package apf3;

public class Enderešo {
	
	private int id_enderešo;
	private int Numero;
	private String Rua;
	private String Complemento;
	private String CEP;
	private String Cidade;
	private String Estado;
	
	public Enderešo() {
		
	}
	
	public void setidEnderešo(int id_enderešo) {
		this.id_enderešo = id_enderešo;
	}
	
	public int getidEnderešo() {
		return id_enderešo;
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
