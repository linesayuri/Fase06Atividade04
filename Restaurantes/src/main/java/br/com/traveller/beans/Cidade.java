package br.com.traveller.beans;

public class Cidade {
	private int idCidade;
	private String cidade;
	private String estado;
	private String siglaEstado;
	private String pais;
	private String siglaPais;	
	
	public Cidade() {
		super();
	}

	public Cidade(int idCidade, String cidade, String estado, String siglaEstado, String pais, String siglaPais) {
		super();
		this.idCidade = idCidade;
		this.cidade = cidade;
		this.estado = estado;
		this.siglaEstado = siglaEstado;
		this.pais = pais;
		this.siglaPais = siglaPais;
	}

	public int getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSiglaPais() {
		return siglaPais;
	}

	public void setSiglaPais(String siglaPais) {
		this.siglaPais = siglaPais;
	}		
}

