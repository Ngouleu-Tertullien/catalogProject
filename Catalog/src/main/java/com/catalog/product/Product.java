package com.catalog.product;

public class Product {
	
	private String name, prodCat;
	private int price;
	public Product(String name, String prodCat, int price) {
		super();
		this.name = name;
		this.prodCat = prodCat;
		this.price = price;
		
	}
	public Product(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCat() {
		return prodCat;
	}
	public void setCat(String prodCat) {
		this.prodCat = prodCat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", prodCat=" + prodCat + ", price=" + price + "]";
	}

}
