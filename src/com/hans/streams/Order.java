package com.hans.streams;

import java.time.LocalDate;
import java.util.List;

public class Order {

     long id;
     String status;
     LocalDate orderDate;
     LocalDate deliveryDate;
     List<Product> products;
     Customer customer;
    
	public Order(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer) {
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", products=" + products + ", customer=" + customer + "]";
	}

   
}