//★★
package event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day17.*;

public class ColorSet implements ActionListener {
	ColorPick pick;
	
	public ColorSet(ColorPick pick) {
		this.pick = pick;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		pick.main.panel.setBackground(pick.color);

		
		
	}
}
