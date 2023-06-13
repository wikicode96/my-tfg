package com.wikicode.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wikicode.springboot.app.models.dao.IEmployerDao;
import com.wikicode.springboot.app.models.dao.IOrderDao;
import com.wikicode.springboot.app.models.entity.Employer;
import com.wikicode.springboot.app.models.entity.Order;

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
