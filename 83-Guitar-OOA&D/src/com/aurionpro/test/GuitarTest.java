package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.Guitar;
import com.aurionpro.model.Inventory;


public class GuitarTest {

	public static void main(String[] args) {
		
		ArrayList<Guitar> guitar = new ArrayList<>();
		guitar.add(new Guitar("V95693","Fender","Stratoc","Electric","Alder","Alder",1499.95));
		guitar.add(new Guitar("V1263","Steve Henderson and Larry Breedlove","Telecaster","Electric","Basswood","Ash",1899.95));
		guitar.add(new Guitar("R7893"," Gibson","Epiphone","Electric","Maple","Walnut",2000.5));
		
		Inventory inventory = new Inventory();
		inventory.setGuitar(guitar);
		

	}

}
