package br.com.traveller.beans;

public class Restaurantes {
	private int id;
	private String Nome_Restaurante;
	private String Logo_Restaurante;
	private String Foto_Restaurante;
	private String Endereço;
	private float Avaliação;
	private String Tipo_Comida;
	private String Telefone;
	private String Site;
	private String Funcionamento;
	private String Faixa_Preco;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome_Restaurante() {
		return Nome_Restaurante;
	}
	public void setNome_Restaurante(String nome_Restaurante) {
		Nome_Restaurante = nome_Restaurante;
	}
	public String getFoto_Restaurante() {
		return Foto_Restaurante;
	}
	public void setFoto_Restaurante(String foto_Restaurante) {
		Foto_Restaurante = foto_Restaurante;
	}
	public String getEndereço() {
		return Endereço;
	}
	public void setEndereço(String endereço) {
		Endereço = endereço;
	}
	public float getAvaliação() {
		return Avaliação;
	}
	public void setAvaliação(float avaliação) {
		Avaliação = avaliação;
	}
	public String getTipo_Comida() {
		return Tipo_Comida;
	}
	public void setTipo_Comida(String tipo_Comida) {
		Tipo_Comida = tipo_Comida;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getSite() {
		return Site;
	}
	public void setSite(String site) {
		Site = site;
	}
	public String getFuncionamento() {
		return Funcionamento;
	}
	public void setFuncionamento(String funcionamento) {
		Funcionamento = funcionamento;
	}
	public String getFaixa_Preco() {
		return Faixa_Preco;
	}
	public void setFaixa_Preco(String faixa_Preco) {
		Faixa_Preco = faixa_Preco;
	}
	
	public String getLogo_Restaurante() {
		return Logo_Restaurante;
	}
	public void setLogo_Restaurante(String logo_Restaurante) {
		Logo_Restaurante = logo_Restaurante;
	}
	
	public Restaurantes() {
		super();
	}
	public Restaurantes(int id, String nome_Restaurante, String logo_Restaurante, String foto_Restaurante,
			String endereço, float avaliação, String tipo_Comida, String telefone, String site, String funcionamento,
			String faixa_Preco) {
		super();
		this.id = id;
		Nome_Restaurante = nome_Restaurante;
		Logo_Restaurante = logo_Restaurante;
		Foto_Restaurante = foto_Restaurante;
		Endereço = endereço;
		Avaliação = avaliação;
		Tipo_Comida = tipo_Comida;
		Telefone = telefone;
		Site = site;
		Funcionamento = funcionamento;
		Faixa_Preco = faixa_Preco;
	}



}
