package com.wikicode.springboot.app.repository;

import java.util.List;

import com.wikicode.springboot.app.model.entity.Menu;

public interface IMenuDao {
	
	public List<Menu> findAll();
	
	public Menu findOne(int id);

}