import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ColorButtonRunner implements ActionListener {
	JPanel p;
	JFrame f;
	ColorButton CB1;
	ColorButton CB2;
	ColorButton CB3;
	ColorButton CB4;

	public static void main(String[] args) {
		new ColorButtonRunner();
	}

	ColorButtonRunner() {
		drawButtons();
	}

	public void drawButtons() {
		p = new JPanel();
		f = new JFrame();
		f.add(p);
		CB1 = new ColorButton();
		CB2 = new ColorButton();
		CB3 = new ColorButton();
		CB4 = new ColorButton();
		JButton b1 = CB1.getNewButton();
		JButton b2 = CB2.getNewButton();
		JButton b3 = CB3.getNewButton();
		JButton b4 = CB4.getNewButton();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		JButton redraw = new JButton("REDRAW");
		p.add(redraw);
		redraw.addActionListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		f.dispose();
		drawButtons();
		JOptionPane.showMessageDialog(null, "Why colors are " + CB1.getButtonColor() + CB2.getButtonColor()
				+ CB3.getButtonColor() + CB4.getButtonColor());

	}
}
