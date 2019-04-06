package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "tb_consumo")
public class Consumo {
	@Id
	@GeneratedValue
	private Long id;
	private Date dataHora;
	@ManyToOne
	private Feedback feedback;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Conteudo conteudo;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

}