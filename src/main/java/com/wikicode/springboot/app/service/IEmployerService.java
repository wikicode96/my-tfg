package com.wikicode.springboot.app.service;

import java.util.List;

import com.wikicode.springboot.app.model.entity.Employer;
import com.wikicode.springboot.app.model.entity.Order;

public interface IEmployerService {

	public List<Employer> findAllEmployers();

	public Employer findOne(int id);
	
	//Habría que implementar traer todos los empleados Administradores
	
	public List<Order> findAllOrders();
}
