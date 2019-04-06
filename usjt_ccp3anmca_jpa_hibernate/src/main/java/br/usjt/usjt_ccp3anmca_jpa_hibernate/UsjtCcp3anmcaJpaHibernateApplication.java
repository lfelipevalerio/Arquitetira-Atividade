package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.sql.Date;

import javax.persistence.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsjtCcp3anmcaJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsjtCcp3anmcaJpaHibernateApplication.class, args);
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario u = new Usuario ();
		u.setNome("Ana");
		u.setFone("11223344");
		u.setEmail("ana@usjt.br");
		Perfil p = new Perfil();
		p.setDescricao("Perfil da Ana");
		p.setUsuario(u);
		u.setPerfil(p);
		Conteudo conteudo = new Conteudo ();
		conteudo.setDescricao("Conteúdo consumido pela Ana");
		conteudo.setTipo("Conteúdo do tipo texto");
		Consumo consumo = new Consumo();
		consumo.setDataHora(new Date(0));
		consumo.setUsuario(u);
		consumo.setConteudo(conteudo);
		manager.persist(consumo);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
