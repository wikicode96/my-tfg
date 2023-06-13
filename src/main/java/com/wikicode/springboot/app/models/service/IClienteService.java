package com.wikicode.springboot.app.models.service;

import java.util.List;

import com.wikicode.springboot.app.models.entity.Menu;
import com.wikicode.springboot.app.models.entity.Order;

public interface IClienteService {

	public List<Menu> findAll();

	public Menu findOne(int id);
	
	public void saveOrder(Order order);
	
}
