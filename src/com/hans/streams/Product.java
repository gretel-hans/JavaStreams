package com.hans.streams;

public class Product {

     long id;
     String name;
    String category;
     Double price;

    public Product(long id, String name, String category, Double price){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}

    
}
