package day17.event;

import java.awt.*;
import java.awt.event.*;

import day17.*;
public class CloseEvt implements ActionListener {
	ColorPick pick;
	public CloseEvt(ColorPick pick) {
		this.pick = pick;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//그 창만 닫아줘야함.
		pick.setVisible(false);
	}

}
