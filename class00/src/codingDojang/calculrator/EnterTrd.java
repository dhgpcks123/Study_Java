package codingDojang.calculrator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

import codingDojang.calculrator.ui.Ui;

public class EnterTrd implements KeyListener {
	Ui main;
	public EnterTrd(Ui main) {
		this.main=main;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		System.out.println("엔터 먹혔다.");
	if(keycode == KeyEvent.VK_ENTER) {
		System.out.println("if문 시작");
		String resultStr = main.rField.getText();
		 main.rField.setText("");
		 System.out.println(resultStr);
		 int result=1;
		 StringTokenizer token;
		 if(resultStr.contains("+")) {
			token = new StringTokenizer(resultStr, "+");
			while(token.hasMoreTokens()) {
				result += Integer.parseInt(token.nextToken());
			}
		}else if(resultStr.contains("-")) {
			token = new StringTokenizer(resultStr, "-");
			while(token.hasMoreTokens()) {
				result -= Integer.parseInt(token.nextToken());
			}
		}else if(resultStr.contains("*")) {
			token = new StringTokenizer(resultStr, "*");
			while(token.hasMoreTokens()) {
				result *= Integer.parseInt(token.nextToken());
			}
		}else if(resultStr.contains("/")) {
			token = new StringTokenizer(resultStr, "/");
			while(token.hasMoreTokens()) {
				result /= Integer.parseInt(token.nextToken());
			}
		}
		DecimalFormat form = new DecimalFormat("###,###,###,###");
		
		main.rField.append(form.format(result));

		}

	}

@Override
public void keyReleased(KeyEvent e) {
	}
@Override
public void keyTyped(KeyEvent e) {
}

}

