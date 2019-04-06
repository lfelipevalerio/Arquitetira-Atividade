package br.usjt.appprevisoes.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Cidade {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String latitude;
	private String longitude;
	@OneToMany
	private List <Previsao> previsao;


	public List<Previsao> getPrevisao() {
		return previsao;
	}

	public void setPrevisao(List<Previsao> previsao) {
		this.previsao = previsao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
