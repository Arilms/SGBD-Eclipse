package apf2;

public class Escritorio {
	
	private int id_escritorio;//chave primária
	private String Equipamento;//(pode ser computador, mesa digitalizadora, etc.)
	private String Modelo;//referente ao equipamento escolhido
	private String Marca;//referente ao equipamento escolhido
	private String Usuario;//para acesso ao equipamento.
	private String Senha;//para acesso ao equipamento.
	private int id_Funcionarioe;//chave estrangeira de FuncionarioE
	
	public Escritorio() {
		
	}

	public int getId_escritorio() {
		return id_escritorio;
	}

	public void setId_escritorio(int id_escritorio) {
		this.id_escritorio = id_escritorio;
	}

	public int getId_Funcionarioe() {
		return id_Funcionarioe;
	}

	public void setId_Funcionarioe(int id_Funcionarioe) {
		this.id_Funcionarioe = id_Funcionarioe;
	}

	public String getEquipamento() {
		return Equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.Equipamento = equipamento;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		this.Marca = marca;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		this.Usuario = usuario;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		this.Senha = senha;
	}

}
