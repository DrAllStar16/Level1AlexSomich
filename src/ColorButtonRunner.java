import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorButtonRunner implements ActionListener {
	JPanel p;
	JFrame f;

public static void main(String[] args) {
	new ColorButtonRunner();
}

ColorButtonRunner(){
	drawButtons();
}
public void drawButtons() {
	p = new JPanel();
 	f= new JFrame();
	f.add(p);
	ColorButton CB = new ColorButton();
	JButton b1=CB.getNewButton();
	JButton b2=CB.getNewButton();
	JButton b3=CB.getNewButton();
	JButton b4=CB.getNewButton();
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
}
}
