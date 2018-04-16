import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;

public class ColorButton {
	Random r = new Random();
	Color c;
	String color;

	private Color getRandomColor() {
		int ran = r.nextInt(4);
		if (ran == 0) {
			color = "Blue";
			return Color.BLUE;
		}

		else if (ran == 1) {
			color = "Green";
			return Color.GREEN;
		}

		else if (ran == 2) {
			color = "Orange";
			return Color.ORANGE;
		}

		else {
			color = "Red";
			return Color.RED;
		}
	}

	public JButton getNewButton() {

		JButton b = new JButton();
		Color c = getRandomColor();
		b.setBackground(c);
		b.setOpaque(true);
		b.setPreferredSize(new Dimension(100, 100));
		return b;

	}

	public String getButtonColor() {

		return color;
	}
}
