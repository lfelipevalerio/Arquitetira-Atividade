package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_conteudo")
public class Conteudo {
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private String tipo;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Conteudo conteudo;
	@OneToMany (mappedBy = "conteudo")
	private List <Consumo> consumos;


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuarios(Usuario usuario) {
		this.usuario = usuario;
	}

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
