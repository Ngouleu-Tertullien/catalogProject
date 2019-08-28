package com.catalog.category;

import java.util.ArrayList;
import java.util.List;

public class CategoryServices {
	 
	public static List<Category> categories = new ArrayList<Category>();
	
	public static List<Category> retreiveCatalog(){
		return categories;
	}
	public static void addCatalog(String catName) {		
		Category category = new Category(catName);
		categories.add(category);
		 return ;
	}
	public static void deleteCatalog(Category category) {		
		categories.remove(category);
		return ;
	}

}
