package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.List;

import javax.persistence.*;

public class TesteListaTodosJPQL {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Usuario");
		List<Usuario> usuarios = query.getResultList();
		for (Usuario u : usuarios) {
			System.out.println(u);
		}
		manager.close();
		JPAUtil.close();
	}
}
