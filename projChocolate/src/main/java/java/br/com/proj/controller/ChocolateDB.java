package java.br.com.proj.controller;

import java.util.List;

import javax.persistence.EntityManager;

import java.br.com.proj.model.Chocolate;
import java.br.com.proj.util.HibernateUtil;

public class ChocolateDB {
	
	EntityManager entityManager;

	public ChocolateDB() {
		entityManager = HibernateUtil.getEntityManager();
	}

	public boolean insert(Chocolate chocolate) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(chocolate);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean update(Chocolate chocolate) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(chocolate);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean delete(Chocolate chocolate) {
		try {
			entityManager.getTransaction().begin();
			chocolate = entityManager.find(Chocolate.class, chocolate.getId());
			entityManager.remove(chocolate);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public Chocolate selectTo(int id) {
		try {
			entityManager.getTransaction().begin();
			Chocolate chocolate = entityManager.find(Chocolate.class, id);
			entityManager.getTransaction().commit();
			entityManager.close();
			return chocolate;
		} catch (Exception e) {
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Chocolate> selectAll() {
		return entityManager.createQuery("FROM " + Chocolate.class.getName()).getResultList();
	}
}
