package com.wikicode.springboot.app.model.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "menus")
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;

	@Column(name = "main")
	private String main;

	@Column(name = "side")
	private String side;

	@Column(name = "drink")
	private String drink;

	@Column(name = "price")
	private double price;

	@Column(name = "img")
	private String img;

	// constructor vacío necesario para JPA
	public Menu() {
	}

	// constructor con todos los campos excepto ID
	public Menu(String main, String side, String drink, double price, String img) {
		this.main = main;
		this.side = side;
		this.drink = drink;
		this.price = price;
		this.img = img;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
