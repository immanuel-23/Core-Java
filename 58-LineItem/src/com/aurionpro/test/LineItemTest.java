package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		ArrayList<LineItem>items=new ArrayList<>();
		
		items.add(new LineItem(101,"shoes",3,400));
		items.add(new LineItem(102,"pen",4,10));
		items.add(new LineItem(103,"shirt",5,300));
		items.add(new LineItem(104,"watch",2,1000));
		items.add(new LineItem(105,"football",1,400));
		int totalCartPrice=0;
		for(LineItem li:items) {
			System.out.println(li.toString());
			totalCartPrice=totalCartPrice+li.calculateTotalPrice();
			
		}
		System.out.println("*********************************");
		System.out.println(totalCartPrice);
		System.out.println("*********************************");
		


		
	}

}
