package com.wikicode.springboot.app.models.service;

import java.util.List;

import com.wikicode.springboot.app.models.entity.Employer;
import com.wikicode.springboot.app.models.entity.Order;

public interface IEmployerService {

	public List<Employer> findAllEmployers();

	public Employer findOne(int id);
	
	//Habría que implementar traer todos los empleados Administradores
	
	public List<Order> findAllOrders();
}
