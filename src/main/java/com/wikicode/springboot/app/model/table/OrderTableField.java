package com.wikicode.springboot.app.model.table;

public class OrderTableField {

	private String orderId;
	private String main;
	private String side;
	private String drink;
	private String identifier;
	
	public OrderTableField(int orderId, String main, String side, String drink, String identifier) {
		this.orderId = String.valueOf(orderId);
		this.main = main;
		this.side = side;
		this.drink = drink;
		this.identifier = identifier;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
}
