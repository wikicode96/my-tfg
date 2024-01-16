package com.wikicode.springboot.app.model.entity;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "identifier")
	private String identifier;

	@OneToOne
	@JoinColumn(name = "menu_id", referencedColumnName = "ID")
	private Menu menu;

	public Order() {
	}

	public Order(String identifier, Menu menu) {
		this.identifier = identifier;
		this.menu = menu;
	}

	public int getId() {
		return id;
	}

	public void setId(int iD) {
		id = iD;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}
