package com.catalog.category;

public class Category {
	
		public String catName;
		public int catId;
		public Category(String catName, int catId) {
			super();
			this.catName = catName;
			this.catId = catId;
		}
		
		public Category(String catName) {
			this.catName = catName;
		}
		public String getCatName() {
			return catName;
		}
		public void setCatName(String catName) {
			this.catName = catName;
		}
		public int getCatId() {
			return catId;
		}
		public void setCatId(int catId) {
			this.catId = catId;
		}

		@Override
		public String toString() {
			return "ListCatalog [catName=" + catName + ", catId=" + catId + "]";
		}
		
}
