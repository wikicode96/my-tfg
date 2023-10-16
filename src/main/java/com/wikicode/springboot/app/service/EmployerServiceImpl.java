package com.wikicode.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wikicode.springboot.app.repository.IEmployerDao;
import com.wikicode.springboot.app.repository.IOrderDao;
import com.wikicode.springboot.app.model.entity.Employer;
import com.wikicode.springboot.app.model.entity.Order;

@Service
public class EmployerServiceImpl implements IEmployerService{
	
	@Autowired
	private IEmployerDao employerDao;
	
	@Autowired
	private IOrderDao orderDao;

	@Override
	@Transactional(readOnly=true)
	public List<Employer> findAllEmployers() {
		
		return employerDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Employer findOne(int id) {
		
		return employerDao.findOne(id);
	}

	@Override
	public List<Order> findAllOrders() {
		
		return orderDao.findAll();
	}

}
