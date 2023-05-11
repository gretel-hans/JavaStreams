package com.hans.streams;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;

public class MainProject {

	public static Product p1=new Product(34572, "iPhone 12", "Phones", 930.0);
	public static Product p2=new Product(3872, "MacBook Air", "Laptops", 1250.0);
	public static Product p3=new Product(9076, "MagSafe", "Accessories", 35.0);
	public static Product p4=new Product(1043, "Hansel & Gretel", "Books", 101.0);
	public static Product p5=new Product(8731, "Barbie", "Baby", 50.0);
	public static Product p6=new Product(3291, "Toys Story DVD", "Baby", 70.0);

	public static Customer c1=new Customer(1810, "Hansel", 2);
	public static Customer c2=new Customer(3452, "Mario", 3);
	public static Customer c3=new Customer(6590, "Luca", 1);

	public static List<Product> listaTotaleProdotti= new ArrayList<Product>();
	public static List<Order> listaTotaleOrdini= new ArrayList<Order>();
	public static void main(String[] args) {


		List<Product> listaProdottiOrdine = new ArrayList<Product>();
		listaProdottiOrdine.add(p1);
		listaProdottiOrdine.add(p2);
		listaProdottiOrdine.add(p3);

		LocalDate oggi=LocalDate.now();

		Order o1 = new Order(3455, "Shiped", oggi, listaProdottiOrdine, c3);
		Order o2 = new Order(3240, "Delivered", oggi, listaProdottiOrdine, c1);
		Order o3 = new Order(1302, "Prepared", oggi, listaProdottiOrdine, c1);

		listaTotaleOrdini.add(o1);
		listaTotaleOrdini.add(o2);
		listaTotaleOrdini.add(o3);


		//System.out.println(o1);

		listaTotaleProdotti.add(p1);
		listaTotaleProdotti.add(p2);
		listaTotaleProdotti.add(p3);
		listaTotaleProdotti.add(p4);
		listaTotaleProdotti.add(p5);
		listaTotaleProdotti.add(p6);

		
		primoEsercizio();
		terzoEsercizio();
		
	}
	
	public static void primoEsercizio(){
		List<Product> primaListaF =listaTotaleProdotti.stream()
		.filter(e -> e.category.equals("Books"))
		.filter(e -> e.price > 100.0)
		.collect(Collectors.toList());
	
		primaListaF.forEach(e->System.out.println("Ecco il 1 risultato: "+e));
	}

	public static void secondoEsercizio(){
		List<Order> secondaLista=listaTotaleOrdini.stream()
		.filter(e->e.products).stream().filter(e->e.category.equals("Baby"))
		
		.collect(Collectors.toList());

		secondaLista.forEach(e->System.out.println("Ecco il 2 risultato: "+e));
	}

	public static void terzoEsercizio(){
		List<Product> terzaLista=listaTotaleProdotti.stream()
		.filter(e->e.category.equals("Baby"))
		.collect(Collectors.toList());
		terzaLista.forEach((e)->{
			e.price-=e.price*10/100;
		});

		terzaLista.forEach(e->System.out.println("Ecco il 2 risultato: "+e));
	}

}
