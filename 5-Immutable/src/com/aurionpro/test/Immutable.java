package com.aurionpro.test;

public class Immutable {

	public static void main(String[] args) {
		String name="Immanuel";
		System.out.println(name.hashCode());
		String name1="Immanuel";
		System.out.println(name1.hashCode());
		name="israel";
		System.out.println(name.hashCode());
		String name2=new String();
		name2="Immanuel";
		System.out.println(name2.hashCode());
		/*String name1=new String("apple").intern();//intern will compare the content
		if(name==name1) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}*/
	}

}
