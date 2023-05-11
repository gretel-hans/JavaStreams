package com.hans.streams;

public class Customer {

	 long id;
     String name;
     Integer tier;

    public Customer(long id, String name, Integer tier){
        this.id=id;
        this.name=name;
        this.tier=tier;
    }
    
    @Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tier=" + tier + "]";
	}
    
}
