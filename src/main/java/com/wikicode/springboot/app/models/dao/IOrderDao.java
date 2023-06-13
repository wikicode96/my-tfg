package com.wikicode.springboot.app.models.dao;

import java.util.List;

import com.wikicode.springboot.app.models.entity.Order;

public interface IOrderDao {

	public List<Order> findAll();
	
	public void saveOrder(Order order);
}
