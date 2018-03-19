import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	 JPanel p = new JPanel();
	 Random r = new Random();
	 public static void main(String[] args) {
	WhackAMole WAM= new WhackAMole();


}

WhackAMole(){
	 JFrame f = new JFrame();
	int y= r.nextInt(24);
	 drawButtons(y);
		f.add(p);
		f.setVisible(true);
		f.setSize(300, 300);
	


}
void drawButtons(int n) {
	
	for (int i = 0; i < 24; i++) {
		JButton b = new JButton();
		b.setOpaque(true);
		if (i==n) {
			b.setText("MOLE!!");

		}
		
		p.add(b);
	}
	
	
}
}
