package com.divergentsl.cms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.divergentsl.cms.entity.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	EntityManager em;
	
	public Admin login(String username) {
		
//		EntityManager entityManager = EntityManagerUtility.getEntityManager();
//		entityManager.getTransaction().begin();
//		entityManager.persist(username);
//		entityManager.getTransaction().commit();
		
		
		Admin admin = em.find(Admin.class, username);
		
		em.close();
		return admin;
	}

}
