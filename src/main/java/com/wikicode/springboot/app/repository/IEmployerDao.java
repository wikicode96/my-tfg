package com.wikicode.springboot.app.repository;

import java.util.List;

import com.wikicode.springboot.app.model.entity.Employer;

public interface IEmployerDao {

	public List<Employer> findAll();
	
	public Employer findOne(int id);
}
