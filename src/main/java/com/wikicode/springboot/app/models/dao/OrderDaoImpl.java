package com.wikicode.springboot.app.models.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wikicode.springboot.app.models.entity.Order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class OrderDaoImpl implements IOrderDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findAll() {
		
		return em.createQuery("from Order").getResultList();
	}
	
	@Override
	public void saveOrder(Order order) {
		
		em.persist(order);
	}
}
