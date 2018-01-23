import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SenstiveKeyboard implements KeyListener {
public static void main(String[] args) {
	
new	SenstiveKeyboard();
}
public SenstiveKeyboard(){
	JFrame f = new JFrame();
	f.addKeyListener(this);
	f.setVisible(true);
	f.pack();
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	
System.out.println("Ouch");
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}
