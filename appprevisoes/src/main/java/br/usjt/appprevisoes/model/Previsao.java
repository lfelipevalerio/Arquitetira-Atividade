package br.usjt.appprevisoes.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Previsao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String diaDaSemana;
	private String dataHora;
	private String latitude;
	private String longitude;
	private Double temperaturaMin;
	private Double temperaturaMax;
	private Double umidadeDoAr;
	private String descricao;
	
	//get and set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiaDaSemana() {
		return diaDaSemana;
	}
	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
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
	public Double getTemperaturaMin() {
		return temperaturaMin;
	}
	public void setTemperaturaMin(Double temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}
	public Double getTemperaturaMax() {
		return temperaturaMax;
	}
	public void setTemperaturaMax(Double temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
	public Double getUmidadeDoAr() {
		return umidadeDoAr;
	}
	public void setUmidadeDoAr(Double umidadeDoAr) {
		this.umidadeDoAr = umidadeDoAr;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
