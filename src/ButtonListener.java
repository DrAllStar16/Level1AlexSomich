import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListener implements ActionListener {
public static void main(String[] args) {
	

	ButtonListener BL= new ButtonListener();

}
ButtonListener(){
	

System.out.println("This is the Button listener Contructer");
JFrame frame= new JFrame();
JButton button= new JButton("Click Me");
frame.add(button);
frame.setVisible(true);
frame.pack();
button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	System.out.println("Congrats you clicked me HAHAHAHAHAHHAHAHAHAHA");
	
}
}