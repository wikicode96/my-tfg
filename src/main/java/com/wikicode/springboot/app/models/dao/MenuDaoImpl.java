package com.wikicode.springboot.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wikicode.springboot.app.models.entity.Menu;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class MenuDaoImpl implements IMenuDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Menu> findAll() {

		return em.createQuery("from Menu").getResultList();
	}
	
	@Override
	public Menu findOne(int id) {
		
		return em.find(Menu.class, id);
	}
}
