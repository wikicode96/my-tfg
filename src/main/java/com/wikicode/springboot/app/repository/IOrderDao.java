package com.wikicode.springboot.app.repository;

import java.util.List;

import com.wikicode.springboot.app.model.entity.Order;

public interface IOrderDao {

	public List<Order> findAll();
	
	public void saveOrder(Order order);
}
