package br.usjt.usjt_ccp3anmca_springdata.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Cidade implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	public Long idCidade;
	
	public String nomeCidade;
	
	public String latitude;
	
	public String longitude;

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
}
