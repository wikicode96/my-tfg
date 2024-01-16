package com.wikicode.springboot.app.model.entity;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employers")
public class Employer implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "DNI", nullable = false, unique = true)
    private String dni;
    
    @Column(name = "password", nullable = false)
    private String password;

    public Employer() {

	}
    
	public Employer(String dni, String password) {
		this.dni = dni;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int iD) {
		id = iD;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}