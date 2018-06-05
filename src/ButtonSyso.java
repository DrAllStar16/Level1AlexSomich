import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonSyso implements ActionListener {
	JFrame f= new JFrame();
	JPanel p = new JPanel(); 
	JButton b1 = new JButton();
	JButton b2 = new JButton();
public static void main(String[] args) {
new ButtonSyso();

	}
 ButtonSyso () {
	f.add(p);
	p.add(b1);
	b1.setText("CLICK ME");
	p.add(b2);
	b2.setText("CLICK ME");
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setVisible(true);
	f.pack();
	b1.addActionListener(this);
	b2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	
if (e.getSource().equals(b1)) {
	System.out.println("YOU CLICKED BUTTON ONE");
}
else {
	System.out.println("YOU CLICKED BUTTON TWO");
}
	
}
}
