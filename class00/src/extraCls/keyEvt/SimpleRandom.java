package extraCls.keyEvt;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleRandom extends JFrame {

	int n1, n2, n3;
	JButton btn1, btn2, btn3;
	
	public SimpleRandom() {
		this.setTitle("Simple Game Machine");
		this.setSize(300,150);
		JPanel panel = new JPanel();
		btn1 = new JButton(""+n1);
		panel.add(btn1);
		btn2 = new JButton(""+n2);
		panel.add(btn2);
		btn3 = new JButton(""+n3);
		panel.add(btn3);
		panel.requestFocus();
		panel.setFocusable(true);
		
		panel.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				if(keycode == KeyEvent.VK_ENTER) {
					n1=(int)(Math.random()*10);
					n2=(int)(Math.random()*10);
					n3=(int)(Math.random()*10);
					btn1.setText(""+n1);
					btn2.setText(""+n2);
					btn3.setText(""+n3);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

		});
		this.add(panel);
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new SimpleRandom();
	}

}
