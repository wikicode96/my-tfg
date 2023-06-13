package com.wikicode.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wikicode.springboot.app.models.dao.IMenuDao;
import com.wikicode.springboot.app.models.dao.IOrderDao;
import com.wikicode.springboot.app.models.entity.Menu;
import com.wikicode.springboot.app.models.entity.Order;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IMenuDao menuDao;
	
	@Autowired 
	private IOrderDao orderDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Menu> findAll() {
		
		return menuDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Menu findOne(int id) {
		
		return menuDao.findOne(id);
	}

	@Override
	@Transactional
	public void saveOrder(Order order) {
		
		orderDao.saveOrder(order);
	}
}