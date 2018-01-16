import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLation implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JTextField tp = new JTextField(10);
	JButton b = new JButton();
	JLabel l = new JLabel(" ");
public static void main(String[] args) {
	
new PigLation();
}
PigLation(){
	

	f.add(p);
	p.add(tp);
	p.add(b);
	p.add(l);
	b.setText("Translate");
	b.addActionListener(this);
		
	
	
	
	
	
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	f.pack();
}
String translate(String input) {
	String translated = input.substring(1, input.length());
	translated += input.charAt(0);
	translated += "ay";
	return translated;
}
@Override
public void actionPerformed(ActionEvent e) {
	String text=tp.getText();
	String output=translate(text);
	l.setText(output);
	System.out.println("Processing...");
	f.pack();
}
}