package com.catalog.product;

import java.util.ArrayList;
import java.util.List;

public class ProductServices {
	 
	public static List<Product> products = new ArrayList<Product>();
	
	public static List<Product> retreiveProduct(){
		return products;
	}
	public static void addProduct(String name, String prodCat, int price) {		
		Product product = new Product(name, prodCat, price);
		products.add(product);
		 return ;
	}
	public static void deleteProduct(Product product) {		
		products.remove(product);
		return ;
	}

}
