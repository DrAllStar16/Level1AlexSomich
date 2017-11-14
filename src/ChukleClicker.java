import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Make a ChuckleClicker class, a main method and a makeButtons method. Put a pop-up in the makeButtons method and get it working. You will need to instantiate your class and call method an instance of it. 
public class ChukleClicker implements ActionListener{
	JFrame f = new JFrame();	
	JPanel pquestion = new JPanel();	
	JPanel panswer = new JPanel();
	JButton bjoke = new JButton("Joke");
	JButton bpunch = new JButton("PunchLine");
	JLabel l = new JLabel("Answer");
	
	public static void main(String[] args) {
		 new ChukleClicker();
	}
	public ChukleClicker(){
		pquestion.add(bjoke);
		pquestion.add(bpunch);
		panswer.add(l);
	f.add(pquestion,BorderLayout.NORTH);
	f.add(panswer,BorderLayout.CENTER);
	f.setVisible(true);
    f.setSize(400, 90);
    bjoke.addActionListener(this);
    bpunch.addActionListener(this);
    bjoke.setBackground(Color.BLUE);
    bjoke.setOpaque(true);
    bpunch.setBackground(Color.BLUE);
    bpunch.setOpaque(true);
    bpunch.setEnabled(false);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
if (e.getSource()==bjoke) {
	l.setText("What do you call a factory that sells good products?");
	bpunch.setEnabled(true);
}
else {
	l.setText("A Satifactory");
}
		
	}	

}

//Make a JFrame in makeButtons() method and get it to show.

//Add a JPanel and two JButtons and get them to show up like this:

//*[Optional] Customize your GUI with setText, setSize, etc.

//Make a pop-up that says “hi” when either of the buttons are pressed. You will need to add listeners to the buttons for this to work.

//Check if the ActionEvent came from the joke button or the punchline button.  
//if(arg0.getSource() == jokeButton)
//You might need to move the declaration of your buttons above the the makeButtons() method.

//Use JOptionPane to print the joke or the punchline depending on which button was clicked.
