import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonListener2 implements ActionListener {
	JButton b = new JButton();
	

	public static void main(String[] args) {
		new ButtonListener();
	}

	public ButtonListener2() {
		JFrame f = new JFrame();
		f.setVisible(true);
		JButton b = new JButton();
		b.setText("CLICK ME");
		f.add(b);
		f.pack();
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(" YAYAYAYAYAYAY ");
	}

}