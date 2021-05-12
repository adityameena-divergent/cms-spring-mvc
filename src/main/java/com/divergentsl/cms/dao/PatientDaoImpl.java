package com.divergentsl.cms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.divergentsl.cms.entity.Patient;
import com.divergentsl.cms.utility.EntityManagerUtility;

public class PatientDaoImpl implements BaseDAO<Patient> {

	public void insert(Patient patient) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(patient);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public Patient find(int id) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Patient patient = entityManager.find(Patient.class, id);
		entityManager.close();
		return patient;
	}

	public List<Patient> findAll() {
		
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		
		CriteriaQuery<Patient> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(Patient.class);
		Root<Patient> root = criteriaQuery.from(Patient.class);
		
		List<Patient> patients = entityManager.createQuery(criteriaQuery).getResultList();
		entityManager.close();
		return patients;
		
	}

	public void remove(int patientId) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		
		Patient patient = entityManager.find(Patient.class, patientId);
		if (patient != null)
			entityManager.remove(patient);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void update(Patient data) {

		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		
		Patient patient = entityManager.find(Patient.class, data.getId());
		
		if (patient != null) {
			patient.setName(data.getName());
			patient.setGender(data.getGender());
			patient.setAge(data.getAge());
			patient.setWeight(data.getWeight());
			patient.setContactNumber(data.getContactNumber());
			patient.setAddress(data.getAddress());
		}
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
