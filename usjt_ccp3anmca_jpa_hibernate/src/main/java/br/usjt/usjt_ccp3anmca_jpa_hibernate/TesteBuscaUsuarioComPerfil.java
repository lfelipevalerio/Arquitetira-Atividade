package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.*;

public class TesteBuscaUsuarioComPerfil {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Usuario u = manager.find(Usuario.class, 1L);
		System.out.println(u);
		manager.close();
		JPAUtil.close();
	}

}
