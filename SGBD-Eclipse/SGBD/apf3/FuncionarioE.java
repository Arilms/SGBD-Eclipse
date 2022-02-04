package apf3;

public class FuncionarioE {
	
	private int id_FuncionaE;
	private String Nome;
	private String Cargo;
	private String CPF;
	private String Email;
	private String Usuario;
	private String Senha;
	private String Telefone1;
	private int id_empresa;
	private int id_endereço;
	
	public FuncionarioE() {
		
	}

	public int getId_FuncionaE() {
		return id_FuncionaE;
	}

	public void setId_Funcionae(int id_FuncionaE) {
		this.id_FuncionaE = id_FuncionaE;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		this.Cargo = cargo;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		this.CPF = cPF;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}

	public int getId_endereço() {
		return id_endereço;
	}

	public void setId_endereço(int id_endereço) {
		this.id_endereço = id_endereço;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
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

	public String getTelefone1() {
		return Telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.Telefone1 = telefone1;
	}

}
