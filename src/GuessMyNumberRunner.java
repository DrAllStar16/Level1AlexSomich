import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuessMyNumberRunner implements ActionListener {
	JFrame f;
	JButton b1;
	JButton b2;
	int count;

	public static void main(String[] args) {
		new GuessMyNumberRunner();

	}

	public GuessMyNumberRunner() {
		 f = new JFrame();
		JPanel p = new JPanel();
		b1 = new JButton("Guess Random Number");
		 b2 = new JButton("Answer");
		f.add(p);
		p.add(b1);
		p.add(b2);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		
		b1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GuessMyNumber z = new GuessMyNumber();
		for (int i = 1000; i <= 1099; i++) {
			boolean b = z.checknumber(i);
			if (b) {
				System.out.println("Correct answer is " + i);
			b2.setText("Answer is "+i);
			f.pack();
			count++;
			if (count==5) {
				f.dispose();
			}
		}
	}

}
}