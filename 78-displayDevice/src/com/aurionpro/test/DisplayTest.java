package com.aurionpro.test;

import com.aurionpro.model.Advertisment;
import com.aurionpro.model.Idisplay;
import com.aurionpro.model.Monitior;
import com.aurionpro.model.Projector;
import com.aurionpro.model.Television;

public class DisplayTest {

	public static void main(String[] args) {
		Idisplay dp;
		// TODO Auto-generated method stub
		Monitior monitor= new Monitior();
		Projector projector = new Projector();
		Television tv = new Television();
		Advertisment ad= new Advertisment();
		ad.setDisplay(monitor);
		ad.show();
		ad.setDisplay(projector);
		
		ad.show();

		ad.setDisplay(tv);
		ad.show();


	}

	

}
