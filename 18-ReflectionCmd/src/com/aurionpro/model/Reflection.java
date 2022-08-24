package com.aurionpro.model;
import java.util.*;
import com.aurionpro.test.*;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.aurionpro.test.*;
public class Reflection {

	
		public static void getData(String user_input) {
			System.out.println("The input from Cmd is ");
			System.out.println(user_input);
			
	}
		public void methods(Class classname) {
			Method[] methods=classname.getDeclaredMethods();
			for(Method method:methods) {
				System.out.println(method);
			}
		}
		public void fields(Class className) {
			Field[] fields = className.getDeclaredFields();
		      for(int i = 0; i < fields.length; i++) {
		         System.out.println(" " +(i+1)+ fields[i].toString());
		      }
		}	

}
