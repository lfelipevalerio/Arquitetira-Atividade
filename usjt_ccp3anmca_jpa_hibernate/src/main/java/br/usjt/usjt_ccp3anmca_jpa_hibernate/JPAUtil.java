package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.*;

public class JPAUtil {
	private static EntityManagerFactory factory;
	// bloco inicializador estático
	static {
		factory = Persistence.createEntityManagerFactory("usjtPU");
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	public static void close() {
		factory.close();
	}
}
