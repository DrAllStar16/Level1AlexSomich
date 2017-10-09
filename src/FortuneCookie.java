import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener   {
public static void main(String[] args) {
	FortuneCookie c=new FortuneCookie();
	c.makeButtom();
}



public void makeButtom() {

JFrame f= new JFrame();
f.setVisible(true);
JButton b=new JButton();
f.add(b);
b.addActionListener(this);
b.setText("CLICK ME");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("WOOHOO");
	Random r = new Random();
	int nem=r.nextInt(3);
	if (nem==0) {
		JOptionPane.showMessageDialog(null, "You will find 2 milion $$$$$$");
	}
	else if (nem==1) {
		JOptionPane.showMessageDialog(null, "You will explode");
	}
	else {
		JOptionPane.showMessageDialog(null, "You get 5 wishes congrats");
	}
}







}



//Fortune Cookie recipe: Create a button that gives one of five random fortunes when clicked.
//Make a class, main method and showButton method. Put a printout in the showButton method. Instantiate your class and see that your printout works. 
//Make a JFrame in showButton method and get it to show.
//Make a JButton and add it to the JFrame.
//Add an action listener to the button (auto fix the errors!!). When the button is clicked, say “Woohoo”.
//Generate a random number between 0 and 4. Depending on the random number, show on of five fortunes.
