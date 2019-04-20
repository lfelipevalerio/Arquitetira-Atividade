package br.usjt.previsoesV2.model;

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
	
	
}
