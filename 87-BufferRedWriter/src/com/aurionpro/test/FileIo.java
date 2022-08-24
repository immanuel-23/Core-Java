package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []names= {"Immanuel","Israel","Johns","Great"};
		try {
			BufferedWriter writer= new BufferedWriter(new FileWriter("Output.txt"));
			writer.write("Hey iam from writer1\n");
			writer.write("Hey iam from writer2");
			for(String s :names) {
				writer.write("\n"+s);
			}

			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedReader reader=new BufferedReader(new FileReader("Output.txt"));
			
			System.out.println(reader.readLine());
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
