import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class BinaryConverter implements ActionListener {
	JFrame f;
	JPanel p; 
	JButton b; 
	JTextField input;
	JTextField output;
public static void main(String[] args) {
new BinaryConverter().createUIC();
}


void createUIC() {
	f = new JFrame();
	p = new JPanel();
	b = new JButton();
	input = new JTextField(20); 
	output = new JTextField(20);
	f.add(p);
	p.add(input);
	p.add(b);
	p.add(output);
	b.setText("CONVERT");
	b.addActionListener(this);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setVisible(true);
	f.pack();
}
String convert(String binary){
	int asciiValue = Integer.parseInt(binary, 2);
	char theLetter = (char) asciiValue;
	return "" + theLetter;
}

@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource()==b) {
	output.setText(convert(input.getText()));
	System.out.println(":");
}
	
}

}
