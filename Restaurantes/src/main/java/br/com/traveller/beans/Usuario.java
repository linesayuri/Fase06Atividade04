package br.com.traveller.beans;

public class Usuario {
	private String TelefoneUsuario;
	private String Data_Nasc;
	private String EnderecoUsuario;
	private String CPF;
	private String NomeUsuario;
	private String IdUsuario;
	
	public Usuario() {
		super();
	}
	public Usuario(String telefoneUsuario, String data_Nasc, String enderecoUsuario, String cPF, String nomeUsuario,
			String idUsuario) {
		super();
		TelefoneUsuario = telefoneUsuario;
		Data_Nasc = data_Nasc;
		EnderecoUsuario = enderecoUsuario;
		CPF = cPF;
		NomeUsuario = nomeUsuario;
		IdUsuario = idUsuario;
	}
	public String getTelefoneUsuario() {
		return TelefoneUsuario;
	}
	public void setTelefoneUsuario(String telefoneUsuario) {
		TelefoneUsuario = telefoneUsuario;
	}
	public String getData_Nasc() {
		return Data_Nasc;
	}
	public void setData_Nasc(String data_Nasc) {
		Data_Nasc = data_Nasc;
	}
	public String getEnderecoUsuario() {
		return EnderecoUsuario;
	}
	public void setEnderecoUsuario(String enderecoUsuario) {
		EnderecoUsuario = enderecoUsuario;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNomeUsuario() {
		return NomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}
	public String getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		IdUsuario = idUsuario;
	}

}

