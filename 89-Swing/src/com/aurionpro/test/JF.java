package com.aurionpro.test;

import javax.swing.*;


public class JF {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setTitle("Hey i am JFrame");
		//rame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		ImageIcon image = new ImageIcon("nasa.jpg");
		frame.setIconImage(image.getImage());
		
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		          
		frame.add(b);//adding button in JFrame  
		          
		frame.setSize(400,500);//400 width and 500 height  
		frame.setLayout(null);//using no layout managers  
	}

}
