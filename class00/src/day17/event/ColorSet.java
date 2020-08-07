package day17.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day17.*;

public class ColorSet implements ActionListener{
	ColorPick pick;
	public ColorSet(ColorPick pick) {
		this.pick = pick;
		
//		ColorClass main= pick.main;
//		JPanel pan = main.panel;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ColorClass main = pick.main;
		Color color = pick.color;
		
		main.panel.setBackground(color);
		
//한방에 쓰기 // pick.main.panel.setBackground(pick.color);
	}
	
	
}
