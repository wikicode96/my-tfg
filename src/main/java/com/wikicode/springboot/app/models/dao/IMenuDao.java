package com.wikicode.springboot.app.models.dao;

import java.util.List;

import com.wikicode.springboot.app.models.entity.Menu;

public interface IMenuDao {
	
	public List<Menu> findAll();
	
	public Menu findOne(int id);

}