package com.wikicode.springboot.app.models.dao;

import java.util.List;

import com.wikicode.springboot.app.models.entity.Employer;

public interface IEmployerDao {

	public List<Employer> findAll();
	
	public Employer findOne(int id);
}
