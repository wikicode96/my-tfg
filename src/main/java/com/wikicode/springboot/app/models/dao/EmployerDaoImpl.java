package com.wikicode.springboot.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wikicode.springboot.app.models.entity.Employer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class EmployerDaoImpl implements IEmployerDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employer> findAll() {

		return em.createQuery("from Employer").getResultList();
	}
	
	@Override
	public Employer findOne(int id) {
		
		return em.find(Employer.class, id);
	}
}