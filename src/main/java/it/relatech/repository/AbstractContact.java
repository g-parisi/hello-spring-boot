package it.relatech.repository;

import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractContact {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return (Session) sessionFactory.getCurrentSession();
	}

	public void persist(Object obj) {
		((AbstractContact) getSession()).persist(obj);
	}

	public void delete(Object obj) {
		((AbstractContact) getSession()).delete(obj);
	}

	public void update(Object obj) {
		((AbstractContact) getSession()).update(obj);
	}
}
