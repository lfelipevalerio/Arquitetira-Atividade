package br.usjt.appprevisoes.model;

import javax.persistence.*;

@Entity
public class DiaDaSemana {
	
	@Id
	@GeneratedValue
	private Long id;
	private String diaDaSemana;
	
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
}
