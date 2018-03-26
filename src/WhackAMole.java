import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JPanel p = new JPanel();
	Random r = new Random();
	JFrame f = new JFrame();
	static int z = 0;
	static Date timeAtStart = new Date();
	public static void main(String[] args) {
		WhackAMole WAM = new WhackAMole();

	}

	WhackAMole() {
		JFrame f = new JFrame();
		int y = r.nextInt(24);
		drawButtons(y);
		f.add(p);
		f.setVisible(true);
		f.setSize(300, 300);

	}

	void drawButtons(int n) {

		for (int i = 0; i < 24; i++) {
			JButton b = new JButton();
			b.addActionListener(this);
			b.setOpaque(true);
			if (i == n) {
				b.setText("MOLE");

			}
			f.add(p);
			p.add(b);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (button.getText().equals("MOLE")) {
			z++;
			speak("Correct");
			if (z==10) {
			endGame(timeAtStart, 10);
			}
			f.dispose();
			WhackAMole WAM = new WhackAMole();
		
		}
		else {
			speak("You SUCK");  
			
		}
	}
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}

}
