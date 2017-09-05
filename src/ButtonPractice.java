import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonPractice {
public static void main(String[] args) {
	JFrame f= new JFrame();
	JPanel p=new JPanel();
	JButton b=new JButton("Click Me Pls");
	JButton b1=new JButton("I really want clicked");
	b.setPreferredSize(new Dimension(1000,1000));
	b1.setPreferredSize(new Dimension(1000,1000));
	b.setBackground(Color.BLUE);
	b1.setBackground(Color.CYAN);
	b.setOpaque(true);
	b1.setOpaque(true);
	f.add(p);
	p.add(b);
	p.add(b1);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.pack();
}
}
