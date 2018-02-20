import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	JLabel l = new JLabel();
	JFrame f = new JFrame();
	char currentletter = generateRandomLetter();

	public static void main(String[] args) {

		new TypingTutor();

	}

	public TypingTutor() {
	

		f.setTitle("TYPE OR I WILL KILL YOU");

		f.add(l);
		l.setText(String.valueOf(currentletter));
		l.setFont(l.getFont().deriveFont(28.0f));
		l.setHorizontalAlignment(l.CENTER);
		f.addKeyListener(this);

		f.setSize(250, 75);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("You Typed: " + e.getKeyChar());
		if (e.getKeyChar()==currentletter) {
System.out.println("Corect");
l.setOpaque(true);
l.setBackground(Color.GREEN);
		}
		else {
			l.setBackground(Color.RED);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentletter = generateRandomLetter();
		l.setText(String.valueOf(currentletter));

	}

}
