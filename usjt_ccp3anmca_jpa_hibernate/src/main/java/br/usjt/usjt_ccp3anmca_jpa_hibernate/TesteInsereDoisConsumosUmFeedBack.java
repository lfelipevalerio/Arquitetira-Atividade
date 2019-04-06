package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.*;

import javax.persistence.*;

public class TesteInsereDoisConsumosUmFeedBack {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Feedback f = new Feedback();
		f.setDescricao("curti");
		List<Consumo> consumos = new ArrayList<>();
		Consumo c1 = new Consumo();
		c1.setDataHora(new Date());
		c1.setFeedback(f);
		Consumo c2 = new Consumo();
		c2.setDataHora(new Date());
		c2.setFeedback(f);
		consumos.add(c1);
		consumos.add(c2);
		f.setConsumos(consumos);
		manager.persist(f);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
