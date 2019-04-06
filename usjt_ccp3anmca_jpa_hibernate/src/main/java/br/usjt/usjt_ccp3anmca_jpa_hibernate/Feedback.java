package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tb_feedback")
public class Feedback {
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	@OneToMany (mappedBy = "feedback", cascade = CascadeType.ALL)
	private List <Consumo> consumos;


	public List<Consumo> getConsumos() {
		return consumos;
	}

	public void setConsumos(List<Consumo> consumos) {
		this.consumos = consumos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
