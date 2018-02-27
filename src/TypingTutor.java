import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	JLabel l = new JLabel();
	JFrame f = new JFrame();
	 int score = 0;
	 int total = 0;
	 Date timeAtStart = new Date();
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
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		total++;
		if (e.getKeyChar() == currentletter) {
			System.out.println("Corect");
			l.setOpaque(true);
			l.setBackground(Color.GREEN);
			score++;
		} else {
			l.setBackground(Color.RED);
		}
		if (score>19) {
			showTypingSpeed(score);
			System.exit(0);
			}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentletter = generateRandomLetter();
		l.setText(String.valueOf(currentletter));

	}
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null,"Great job out got "+score +" out of "+total +" and your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	

}
