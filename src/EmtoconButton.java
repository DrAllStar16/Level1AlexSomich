import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EmtoconButton implements ActionListener {
	JFrame f;
	JPanel p;
	JButton b1;
	JButton b2;
public static void main(String[] args) {
	new EmtoconButton();
	
}
public EmtoconButton(){
	
	f=new JFrame();
	p=new JPanel();
	b1=new JButton("Happy");
	b2=new JButton("Sad");
	f.add(p);
	p.add(b1);
	p.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	f.setVisible(true);
	f.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==b1) {
		System.out.println("Happy");
	}
	else if (e.getSource()==b2) {
		
System.out.println("Sad");
		
	}
	
}
}
