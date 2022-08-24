package com.aurionpro.test;
import com.aurionpro.model.*;
import java.lang.reflect.*;

public class ReflectionTest {
	static String user_input;
	public static void main(String[] args) {
		System.out.println("Reflection Test");
		String input;
		input=args[0];
		try {
			Class className = Class.forName(input);
			Reflection obj = new Reflection();
			System.out.println("Methods");
			obj.methods(className);
			System.out.println("Fields");
			obj.fields(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
		
	}

	

}
