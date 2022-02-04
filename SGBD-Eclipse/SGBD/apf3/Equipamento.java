package apf3;

public class Equipamento {
	private int id_equipamento;
	private String Modelo;
	private String Marca;
	private int id_empresa;
	
	public Equipamento() {
		
	}
	
	public int getId_equipamento() {
		return id_equipamento;
	}
	public void setId_equipamento(int id_equipamento) {
		this.id_equipamento = id_equipamento;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}

}
