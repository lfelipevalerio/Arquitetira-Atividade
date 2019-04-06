package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.*;

import javax.persistence.*;

public class TesteInsereManyToMany {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		List<Conteudo> conteudos = new ArrayList<>();
		Conteudo c1 = new Conteudo();
		c1.setDescricao("conteudo 1");
		c1.setTipo("Tipo 1");
		Conteudo c2 = new Conteudo();
		c2.setDescricao("conteudo 2");
		c2.setTipo("Tipo 2");
		conteudos.add(c1);
		conteudos.add(c2);
		Usuario u1 = new Usuario();
		Perfil perfil = new Perfil();
		perfil.setDescricao("perfil do João");
		perfil.setUsuario(u1);
		u1.setNome("João");
		u1.setFone("12321131");
		u1.setEmail("joao@usjt.br");
		u1.setPerfil(perfil);
		u1.setConteudos(conteudos);
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(u1);
		c1.setUsuarios(usuarios);
		c2.setUsuarios(usuarios);
		manager.persist(u1);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
