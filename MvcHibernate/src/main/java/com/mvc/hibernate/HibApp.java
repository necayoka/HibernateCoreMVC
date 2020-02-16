package com.mvc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibApp {
	
	public static Covek get(int id) {
		Session session = openSession();
		Covek covek = (Covek) session.get(Covek.class, id);
		session.close();
		
		return covek;
	}
	
	public static void put(Object obj) {
		Session session = openSession();
		session.getTransaction().begin();
		session.persist(obj);
		session.getTransaction().commit();
		session.close();
	}
	
	public static Session openSession() {
		Configuration config = new Configuration().configure().addAnnotatedClass(Covek.class);
		ServiceRegistry reg = (ServiceRegistry) new ServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory factory = config.buildSessionFactory(reg);
		return factory.openSession();
	}
	
}
