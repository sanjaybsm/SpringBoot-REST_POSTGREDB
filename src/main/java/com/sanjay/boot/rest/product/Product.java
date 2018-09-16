package com.sanjay.boot.rest.product;

public class Product {
	
	public Product(int id, String name, String discription) {
		super();
		this.id = id;
		this.name = name;
		this.discription = discription;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	private String name;
	private String discription;

}
