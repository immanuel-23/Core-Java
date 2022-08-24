package com.aurionpro.model;

public class LineItem {
	private int id;
	private String name;
	private int quantity;
	private int unitprice;
	private int totalcost;
	
	public LineItem(int id, String name, int quantity,int unitprice) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitprice=unitprice;
		this.totalcost=unitprice*quantity;
	}
	
	
	


	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTotalcost() {
		return totalcost;
	}

	public int getUnitprice() {
		return unitprice;
	}

	public int calculateTotalPrice(){
	
		return quantity*unitprice;
		
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unitprice=" + unitprice
				+ ", totalcost=" + totalcost + "]";
	}
	
	
}
