package com.wikicode.springboot.app.service;

import java.util.List;

import com.wikicode.springboot.app.model.entity.Menu;
import com.wikicode.springboot.app.model.entity.Order;

public interface IClienteService {

	public List<Menu> findAll();

	public Menu findOne(int id);
	
	public void saveOrder(Order order);
	
}
