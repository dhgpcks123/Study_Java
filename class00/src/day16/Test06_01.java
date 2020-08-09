package day16;

import java.awt.*;
import java.awt.event.*;

import day16.*;
public class Test06_01 implements ActionListener {
	Test06 main;
	
	public Test06_01(Test06 main) {
		this.main = main;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
//		Test06 main1 = new Test06();
		// Color 객체를 만들고
		Color color = new Color(red, green, blue);
		main.pan.setBackground(color);
	}
	
	
}
