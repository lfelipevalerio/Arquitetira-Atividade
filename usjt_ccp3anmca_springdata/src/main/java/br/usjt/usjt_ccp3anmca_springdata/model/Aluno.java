package br.usjt.usjt_ccp3anmca_springdata.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tb_aluno")

@NamedQuery (name = "Aluno.buscarPeloNomeEPeloEmail", query = "SELECT a FROM Aluno a WHERE nome = :nome AND email = :email")
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome, fone, email;
//getters/setters
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
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}