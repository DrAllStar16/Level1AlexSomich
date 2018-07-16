import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Exam implements ActionListener {
	JFrame f;
	JPanel p;
	JButton y;
	JButton r;
	JButton b;
	JButton g;

	public static void main(String[] args) {
		Level1Exam l = new Level1Exam();

	}

	public Level1Exam() {
		f = new JFrame();
		p = new JPanel();
		y = new JButton();
		r = new JButton();
		b = new JButton();
		g = new JButton();
		f.add(p);
		p.add(y);
		p.add(r);
		p.add(b);
		p.add(g);
		y.setBackground(Color.YELLOW);
		r.setBackground(Color.RED);
		b.setBackground(Color.BLUE);
		g.setBackground(Color.GREEN);
		y.setOpaque(true);
		r.setOpaque(true);
		b.setOpaque(true);
		g.setOpaque(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.pack();
		y.addActionListener(this);
		r.addActionListener(this);
		b.addActionListener(this);
		g.addActionListener(this);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("Say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == y) {
			speak("Yellow"); 
		}
		else if (e.getSource()==r) {
			speak("Red");
		}
		else if (e.getSource()==b) {
			speak("Blue");
		}
		else if (e.getSource()==g) {
			speak("Green");
		}

	}
}